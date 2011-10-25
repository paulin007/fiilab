package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StringSort {

	public static void main(String[] args) {
		
		List<String> list=new LinkedList<String>();
		
		Collections.addAll(list, "Ciao", "Cane","Cosa","Dove","Chi",
				"Come", "Ora", "Domani","Oro", "Forse");
		
		Collections.sort(list);
		
		for (String string : list) {
			System.out.println(string);
		}
		/*for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
			String string =iterator.next();
			System.out.println(string);
		}*/
	}
}
