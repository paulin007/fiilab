package abstractfactory;

public class ConcreteProductB implements IProductB{

	String header="";
	String tailer="";
	
	public ConcreteProductB(String header, String tailer) {
		super();
		this.header = header;
		this.tailer = tailer;
	}

	@Override
	public void operationB() {
		System.out.println(header+" operazione B "+tailer);
	}
}
