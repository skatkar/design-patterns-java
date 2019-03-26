package demo.pattern.design.decorator;

public class Exec {

	public static void main(String[] args) {
		SatelliteTV satelliteTV = new Espn(new CartoonNetwork(new SkyTV()));
		satelliteTV.show(105);
		System.out.println(satelliteTV.subscriptionPrice());
		
		SatelliteTV satelliteTV2 = new Espn(new Discovery(new CartoonNetwork(new SkyTV())));
		satelliteTV2.show(500);
		System.out.println(satelliteTV2.subscriptionPrice());

	}

}
