package decorator;

public class ConcreteComponent2 implements IComponent{

	@Override
	public void operation() {
		System.out.println("I am doing something else!");
	}
}
