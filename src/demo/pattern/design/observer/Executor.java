package demo.pattern.design.observer;

public class Executor {

	public static void main(String[] args) {
		
		
		//Create stocks
		IBM ibm = new IBM();
		Microsoft ms = new Microsoft();
		Walmart walmart = new Walmart();
		
		//Create observer
		Mobile mobile = new Mobile();
		DisplayBoard displayBoard= new DisplayBoard();
		
		ibm.registerObserver(mobile);
		ibm.registerObserver(displayBoard);
		
		ms.registerObserver(mobile);
		ms.registerObserver(displayBoard);
		
		walmart.registerObserver(displayBoard);
		
		for(int i=0;i<10;i++) {
			ibm.updateStockPrice((int)(Math.random() * 11) + 1);
			ms.updateStockPrice((int)(Math.random() * 11) + 1);
			walmart.updateStockPrice((int)(Math.random() * 11) + 1);
		}

	}

}
