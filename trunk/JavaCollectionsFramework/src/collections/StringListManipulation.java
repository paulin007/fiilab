package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StringListManipulation {

	public static void main(String[] args) {
		
		List<String> list=new LinkedList<String>();
		
		Collections.addAll(list, "Ciao", "Cane","Cosa","Dove","Chi",
				"Come", "Ora", "Domani","Oro", "Forse");
		

		System.out.println("Beginning List");
		for (String string : list) {
			System.out.println(string);
		}
		
		Collections.sort(list);
		
		System.out.println("After Sort");
		for (String string : list) {
			System.out.println(string);
		}
		
		Collections.reverse(list);
		
		System.out.println("After Reverse");
		for (String string : list) {
			System.out.println(string);
		}
		
		Collections.shuffle(list);
		
		System.out.println("After Shuffle");
		for (String string : list) {
			System.out.println(string);
		}
	}
}
