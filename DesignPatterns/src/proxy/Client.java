package proxy;

public class Client {

	private ISubject subject;

	public Client(ISubject subject) {
		super();
		this.subject = subject;
	}
	
	public void executeSubject(){
		System.out.println("I'm "+this+".");
		System.out.println("I'm going to execute my subject");
		subject.doSomething();
	}
}
