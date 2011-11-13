package observer;

import java.util.LinkedList;
import java.util.List;


/**
 * An implementation of Observable.
 * Please: don't use this in your programs!! Use java.utils.Observable!!
 * 
 * @author Alessandro Martinelli
 */
public class Observable {
	private boolean changed=false;
	
	private List<Observer> observers=new LinkedList<Observer>();
	
	public void addObserver(Observer observer){
		observers.add(observer);
	}
	
	public boolean isChanged(){
		return changed;
	}
	
	/**
	 * set this Observable has a changed one.
	 * Next call to {@link notifyObservers} will be effective. 
	 */
	public void setChanged(){
		changed=true;
	}
	
	/**
	 * if someone has called 'setChanged' all registerd observers
	 * are updated.
	 * and will tag this observer for no change
	 */
	public void notifyObservers(){
		if(changed){
			for (Observer observer : observers) {
				observer.update();
			}
			changed=false;
		}
	}
}
