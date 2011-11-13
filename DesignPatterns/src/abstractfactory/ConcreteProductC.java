package abstractfactory;

public class ConcreteProductC implements IProductC{

	String header="";
	String tailer="";
	
	public ConcreteProductC(String header, String tailer) {
		super();
		this.header = header;
		this.tailer = tailer;
	}

	@Override
	public void operationC() {
		System.out.println(header+" operazione C "+tailer);
	}
}
