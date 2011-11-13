package proxy;

public class RealSubject2 implements ISubject{

	@Override
	public void doSomething() {
		System.err.println("I'd rather do something");
	}
}
