package flyweight;

import java.util.HashMap;

/*
 * not necessary an abstract factory....
 * but it maybe!! (Depending on situations)
 */
public class FlyWeightFactory {

	private HashMap<Character, FlyWeight> flyweights=new HashMap<Character, FlyWeight>(); 

	
	public FlyWeight generateFlyweight(char k){
		
		FlyWeight flyweight=flyweights.get(k);
		if(flyweight==null){
			System.out.println("Generating Flyweight for key: "+k);
			flyweight=new FlyWeight("["+k+"]");
			flyweights.put(k, flyweight);
		}
		return flyweight;
	}
}
