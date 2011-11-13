package proxy;

public class Proxy implements ISubject{

	private ISubject subject;

	public Proxy(ISubject subject) {
		super();
		this.subject = subject;
	}
	
	public void setSubject(ISubject subject) {
		this.subject = subject;
	}

	@Override
	public void doSomething() {
		subject.doSomething();
	}
}
