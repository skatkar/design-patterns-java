package demo.pattern.design.decorator;

public class Espn extends ChannelDecorator {

	Espn(SatelliteTV satelliteTV) {
		super(satelliteTV);
		
	}

	@Override
	public void show(int channelNumber) {
		if(channelNumber > 100 && channelNumber < 200)
			System.out.println("Enjoy footbal match"); 
		else
			this.getSatelliteTV().show(channelNumber);

	}

	@Override
	public int subscriptionPrice() {
		
		return this.getSatelliteTV().subscriptionPrice() + 7;
	}

}
