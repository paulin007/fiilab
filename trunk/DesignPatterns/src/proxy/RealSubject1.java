package proxy;

public class RealSubject1 implements ISubject{

	@Override
	public void doSomething() {
		System.err.println("I don't want to do anything");
	}
}
