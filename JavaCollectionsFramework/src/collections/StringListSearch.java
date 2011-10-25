package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StringListSearch {

	public static void main(String[] args) {
		
		List<String> list=new LinkedList<String>();
		
		Collections.addAll(list, "Ciao", "Cane","Cosa","Dove","Chi",
				"Come", "Ora", "Domani","Oro", "Forse");
		
		Collections.sort(list);
		
		String key="Dove";
		int index=Collections.binarySearch(list, key);
		
		System.out.println("Result of Binary Search on key ["+key+"]: "+
				list.get(index)+"("+index+")");
	}
}
