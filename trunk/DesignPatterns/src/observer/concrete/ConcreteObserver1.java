package observer.concrete;

import observer.Observer;

public class ConcreteObserver1 implements Observer{

	private ConcreteObservable1 data1;
	
	public ConcreteObserver1(ConcreteObservable1 data1) {
		super();
		this.data1 = data1;
	}

	@Override
	public void update() {
		System.out.println("data now is "+data1.getValue());
	}
}
