package javareflection;

public class Esempio01Reflection {

	
	public static void main(String[] args) {
		
		ExampleClass example=new ExampleClass(18,"Sufficiente");
		
		System.out.println("Object "+example.toString());
		System.out.println("Class "+example.getClass().toString());
	}
}
