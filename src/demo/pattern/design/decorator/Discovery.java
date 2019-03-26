package demo.pattern.design.decorator;

public class Discovery extends ChannelDecorator {

	Discovery(SatelliteTV satelliteTV) {
		super(satelliteTV);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show(int channelNumber) {
		if(channelNumber > 200 && channelNumber < 300)
			System.out.println("Enjoy Documentary"); 
		else
			this.getSatelliteTV().show(channelNumber);

	}

	@Override
	public int subscriptionPrice() {
		return this.getSatelliteTV().subscriptionPrice() + 10;
	}

}
