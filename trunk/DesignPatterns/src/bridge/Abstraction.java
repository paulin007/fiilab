package bridge;

public class Abstraction {

	private Implementor implementor;

	public Abstraction(Implementor implementor) {
		super();
		this.implementor = implementor;
	}

	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}

	public int operation(){
		return implementor.operationImplementation();
	}
	
}
