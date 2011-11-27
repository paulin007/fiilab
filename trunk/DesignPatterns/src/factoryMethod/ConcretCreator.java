package factoryMethod;

public class ConcretCreator implements Creator{
	@Override
	public Product generateProduct() {
		return new ConcreteProduct(0);
	}
}
