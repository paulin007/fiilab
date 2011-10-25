package collections;

import java.util.Collections;
import java.util.TreeSet;
import java.util.SortedSet;

public class StringSubSet {
	
	public static void main(String[] args) {
		
		SortedSet<String> set=new TreeSet<String>();
		
		Collections.addAll(set, "Ciao", "Cane","Cosa","Dove","Chi",
				"Come", "Ora", "Domani","Oro", "Forse");
		
		SortedSet<String> subSet=set.subSet("Cane","Domani");
		
		for (String string : subSet) {
			System.out.println(string);
		}
		
		/*for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
			String string =iterator.next();
			System.out.println(string);
		}*/
	}
}
