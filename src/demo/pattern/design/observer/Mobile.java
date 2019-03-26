package demo.pattern.design.observer;

public class Mobile implements Observer {

	@Override
	public void update(Stock stock) {
		System.out.println("MOBILE - The price of " + stock.getStockName() 
		+" has changed: " + stock.getStockPrice());

	}

}
