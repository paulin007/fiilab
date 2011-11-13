package abstractfactory;

public class ConcreteProductA implements IProductA{

	String header="";
	String tailer="";
	
	public ConcreteProductA(String header, String tailer) {
		super();
		this.header = header;
		this.tailer = tailer;
	}

	@Override
	public void operationA() {
		System.out.println(header+" operazione A "+tailer);
	}
}
