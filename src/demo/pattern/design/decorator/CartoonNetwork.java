package demo.pattern.design.decorator;

public class CartoonNetwork extends ChannelDecorator {

	CartoonNetwork(SatelliteTV satelliteTV) {
		super(satelliteTV);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show(int channelNumber) {
		if(channelNumber > 300 && channelNumber < 400)
			System.out.println("Enjoy Tom & Jerry"); 
		else
			this.getSatelliteTV().show(channelNumber);


	}

	@Override
	public int subscriptionPrice() {
		return this.getSatelliteTV().subscriptionPrice() + 6;
	}

}
