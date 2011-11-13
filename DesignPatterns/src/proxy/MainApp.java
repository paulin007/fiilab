package proxy;

public class MainApp {

	public static void main(String[] args) {
		
		RealSubject1 subject1=new RealSubject1();
		
		Proxy proxy=new Proxy(subject1);
		
		Client client=new Client(proxy);
		
		client.executeSubject();
		
		proxy.setSubject(subject1);
		
		client.executeSubject();
	}
}
