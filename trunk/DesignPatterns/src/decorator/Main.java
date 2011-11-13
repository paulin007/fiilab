package decorator;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("\t Executing Operation 1");
		IComponent component=new ConcreteComponent1();
		component.operation();
		
		System.out.println("\t Executing Decorated Operation 1");
		IComponent component1=new Decorator(new ConcreteComponent1());
		component1.operation();

		System.out.println("\t Executing Decorated Operation 2");
		IComponent component2=new Decorator(new ConcreteComponent2());
		component2.operation();
	}
}
