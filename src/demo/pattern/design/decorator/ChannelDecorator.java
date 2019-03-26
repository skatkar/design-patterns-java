package demo.pattern.design.decorator;

public abstract class ChannelDecorator implements SatelliteTV {

	private SatelliteTV satelliteTV;
	
	ChannelDecorator(SatelliteTV satelliteTV){
		this.satelliteTV = satelliteTV;
	}


	public SatelliteTV getSatelliteTV() {
		
		return satelliteTV;
	}

}
