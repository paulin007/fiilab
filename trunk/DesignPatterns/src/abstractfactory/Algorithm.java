package abstractfactory;

/* NOTA: si vede la Dependency Inversion??*/
public class Algorithm {

	private IAbstractFactory factory;

	public Algorithm(IAbstractFactory factory) {
		super();
		this.factory = factory;
	}
	
	public void algorithm(){
		
		IProductA	aProduct=factory.createA();
		
		IProductB	bProduct1=factory.createB();
		IProductB	bProduct2=factory.createB();
		
		IProductC	cProduct=factory.createC();
		
		System.out.println("Devo eseguire un po' di operazioni:");
		aProduct.operationA();
		bProduct1.operationB();
		bProduct2.operationB();
		cProduct.operationC();
	}
}
