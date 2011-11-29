package javareflection;

public class ExampleClass {

	private int value;
	private String information;
	
	public ExampleClass(int value, String information) {
		super();
		this.value = value;
		this.information = information;
	}
	
	@Override
	public String toString() {
		return information+" ["+value+"]";
	}
	
	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	/**
	 * @return the information
	 */
	public String getInformation() {
		return information;
	}
	/**
	 * @param information the information to set
	 */
	public void setInformation(String information) {
		this.information = information;
	}
	
	
}
