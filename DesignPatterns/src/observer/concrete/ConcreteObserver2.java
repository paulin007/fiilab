package observer.concrete;

import observer.Observer;

public class ConcreteObserver2 implements Observer{

	private ConcreteObservable1 data2;
	
	public ConcreteObserver2(ConcreteObservable1 data2) {
		super();
		this.data2 = data2;
	}

	@Override
	public void update() {
		System.err.println("data now is "+data2.getValue());
	}
}
