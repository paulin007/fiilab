package javareflection;

import java.lang.reflect.Method;

public class Esempio02Reflection {

	public static void main(String[] args) {
		
		ExampleClass example=new ExampleClass(18,"Sufficiente");
		
		//NOTE: wili stamp also java.lang.Object methods!
		Method[] methods=example.getClass().getMethods();
		for (int j = 0; j < methods.length; j++) {
			System.out.println(methods[j]);
		}
		
	}
}
