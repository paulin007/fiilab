package bridge;

public class Main {

	public static void main(String[] args) {
		
		Abstraction abstraction=new Abstraction(new Implementor1());
		
		System.out.println(abstraction.operation());
		
		abstraction.setImplementor(new Implementor2());
		
		System.out.println(abstraction.operation());
	}
}
