package demo.pattern.design.observer;

public class DisplayBoard implements Observer {

	@Override
	public void update(Stock stock) {
		System.out.println("DISPLAYBOARD - The price of " + stock.getStockName() 
		+" has changed: " + stock.getStockPrice());

	}

}
