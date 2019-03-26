/**
 * 
 */
package demo.pattern.design.decorator;

/**
 * @author CampusUser
 *
 */
public class SkyTV implements SatelliteTV {

	/* (non-Javadoc)
	 * @see demo.pattern.design.decorator.SatelliteTV#show(int)
	 */
	@Override
	public void show(int channelNumber) {
		if(channelNumber < 100)
			System.out.println("Basic news channel");
		else
			System.out.println("You are not subscribed");

	}

	/* (non-Javadoc)
	 * @see demo.pattern.design.decorator.SatelliteTV#subscriptionPrice()
	 */
	@Override
	public int subscriptionPrice() {
		
		return 100;
	}

}
