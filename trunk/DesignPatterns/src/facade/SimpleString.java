package facade;

public class SimpleString {

	private String realString;
	
	public SimpleString(char[] chars){
		realString=new String(chars);
	}
	
	public char charAt(int index){
		return realString.charAt(index);
	}
	
	public String getRealString() {
		return realString;
	}
}
