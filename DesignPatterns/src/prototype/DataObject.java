package prototype;

public class DataObject {

	public static final int DATA_OBJECT_SIZE=300;
	
	private int[] values=new int[DATA_OBJECT_SIZE];
	
	public void setValue(int index,int value){
		values[index]=value;
	}
	
	public int getValue(int index){
		return values[index];
	}
}
