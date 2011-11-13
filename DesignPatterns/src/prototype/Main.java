package prototype;

public class Main {

	public static ConcretePrototype prototype1=new ConcretePrototype("Primo prototipo");
	public static ConcretePrototype prototype2=new ConcretePrototype("Secondo prototipo");
	
	static{
		buildPrototypes();
	}
	
	public static void main(String[] args) {
		
		ConcretePrototype element1=prototype1.clone();
		element1.setAddictionalInformation("Elemento01");
		ConcretePrototype element2=prototype1.clone();
		element2.setAddictionalInformation("Elemento01");
		ConcretePrototype element3=prototype2.clone();
		element3.setAddictionalInformation("Elemento01");
		ConcretePrototype element4=prototype2.clone();
		element4.setAddictionalInformation("Elemento01");
		ConcretePrototype element5=prototype2.clone();
		element5.setAddictionalInformation("Elemento01");
		
		writeElement(element1);
		writeElement(element2);
		writeElement(element3);
		writeElement(element4);
		writeElement(element5);
	}
	
	private static void writeElement(ConcretePrototype prototype){
		System.out.println("Concrete Element "+prototype.getAddictionalInformation()+
				" with v1:"+prototype.getDataObject().getValue(0)+
				" with v2:"+prototype.getDataObject().getValue(1)+
				" with v3:"+prototype.getDataObject().getValue(2));
	}
	
	private static void buildPrototypes(){
		for (int i = 0; i < DataObject.DATA_OBJECT_SIZE; i++) {
			prototype1.getDataObject().setValue(i, i);
		}
		for (int i = 0; i < DataObject.DATA_OBJECT_SIZE; i++) {
			prototype2.getDataObject().setValue(i, (int)(300*Math.random()));
		}
	}
}
