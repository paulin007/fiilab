package collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapUse {
	
	public static void main(String[] args) {

		Map<String, String> map=new TreeMap<String,String>();
		
		map.put("Cane", "Dog");
		map.put("Gatto", "Cat");
		map.put("Bambino", "Child");
		map.put("Prosciutto", "Ham");
		map.put("Ladro", "Thied");
		
		Set<String> keys=map.keySet();
		for (String key : keys) {
			System.out.println("La Traduzione di "+key+" è "+map.get(key));
		}
		
		//		for (Iterator<String> iterator = keys.iterator(); iterator.hasNext();) {
		//			String key = iterator.next();
		//			System.out.println("La Traduzione di "+key+" Ã¨ "+map.get(key));
		//		}
	}
}
