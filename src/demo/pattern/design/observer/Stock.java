package demo.pattern.design.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stock implements Observable{

	private String name;
	private int price;
	private List<Observer> observers;
	
	public Stock() {
		observers = new ArrayList<Observer>();
	}
		
	public void setName(String stockName) {
		name = stockName;
	}
	
	public String getStockName() {
		return name;
	}
	
	public int getStockPrice() {
		return price;
	}
	
	public void updateStockPrice(int updatedPrice) {
		this.price = updatedPrice;
		notifyObservers();
	}
	
	
	
	@Override
	public void registerObserver(Observer observer) {
		if(observer!=null)
			observers.add(observer);
		
	}

	@Override
	public void notifyObservers() {
		Iterator<Observer> it = observers.iterator();
		while(it.hasNext()) {
			Observer observer = it.next();
			observer.update(this);
		}
		
	}

	@Override
	public void removeObserver(Observer observer) {
		if(observer!=null)
			observers.remove(observer);
		
	}

}
