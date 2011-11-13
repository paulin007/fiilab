package abstractfactory;

public class ConcreteFactory implements IAbstractFactory{

	private String header="";
	private String tailer="";
	
	public ConcreteFactory(String header, String tailer) {
		super();
		this.header = header;
		this.tailer = tailer;
	}

	@Override
	public IProductA createA() {
		return new ConcreteProductA(header, tailer);
	}
	
	@Override
	public IProductB createB() {
		return new ConcreteProductB(header, tailer);
	}
	
	@Override
	public IProductC createC() {
		return new ConcreteProductC(header, tailer);
	}
}
