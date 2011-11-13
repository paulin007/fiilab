package adapter;

/**
 * Adapts the interface of a TargetInterface to
 * a reference Implementation
 * 
 * @author Alessandro
 */
public class Adapter implements TargetInterface{
	
	private Implementation implementation=new Implementation();
	
	@Override
	public void doSomething() {
		implementation.operation1();
		implementation.operation2();
	}
	
	@Override
	public void doTheOtherThing() {
		implementation.operation3();
	}
	
}
