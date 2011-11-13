package prototype;

/**
 * @author Alessandro Martinelli
 */
public class ConcretePrototype implements IPrototype{

	private DataObject dataObject;
	private String addictionalInformation;

	public ConcretePrototype(String addictionalInformation) {
		super();
		dataObject=new DataObject();
		this.addictionalInformation = addictionalInformation;
	}

	
	/* DataObject has only a get method and cannot be set
	 */
	public DataObject getDataObject() {
		return dataObject;
	}

	public String getAddictionalInformation() {
		return addictionalInformation;
	}


	public void setAddictionalInformation(String addictionalInformation) {
		this.addictionalInformation = addictionalInformation;
	}


	/* This constructor is private and can be called
	 * only in this file*/
	private ConcretePrototype(DataObject dataObject,
			String addictionalInformation) {
		super();
		this.dataObject = dataObject;
		this.addictionalInformation = addictionalInformation;
	}

	@Override
	public ConcretePrototype clone() {
		/*use the private constructor, assigning dataObject. This instance and 
		 * the new instance will share the same instance of dataObject
		 */
		return new ConcretePrototype(dataObject, addictionalInformation);
	}
}
