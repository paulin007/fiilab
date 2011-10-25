package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapUse {

	public static void main(String[] args) {
		
		Map<String, String> map=new HashMap<String,String>();
		
		map.put("Cane", "Dog");
		map.put("Gatto", "Cat");
		map.put("Bambino", "Child");
		map.put("Prosciutto", "Ham");
		map.put("Ladro", "Thied");
		
		String key="Gatto";
		String result=map.get(key);
		System.out.println("La Traduzione di "+key+" è "+result);
	}
}
