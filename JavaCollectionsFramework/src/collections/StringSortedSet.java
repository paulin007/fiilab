package collections;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class StringSortedSet {

	public static void main(String[] args) {
		
		SortedSet<String> set=new TreeSet<String>();
		
		Collections.addAll(set, "Ciao", "Ciao", "Cane","Cosa","Dove","Chi",
				"Come", "Ora", "Domani","Oro", "Forse");
		
		//TreeSet implements SortedSet and does not need to be ordered
		
		for (String string : set) {
			System.out.println(string);
		}
		
		/*for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
			String string =iterator.next();
			System.out.println(string);
		}*/
	}
}
