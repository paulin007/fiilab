package observer.concrete;

import observer.Observable;

public class ConcreteObservable1 extends Observable{

	private float value;

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
		setChanged();
		notifyObservers();
	}
}
