package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	public static void main(String[] args) {
		
		String message="This is a simple message";
		
		FlyWeightFactory factory=new FlyWeightFactory();
		List<FlyWeight> flyweights=new ArrayList<FlyWeight>();
		
		char[] data=message.toCharArray();
		
		for (int i = 0; i < data.length; i++) {
			flyweights.add(factory.generateFlyweight(data[i]));
		}
		
		for (FlyWeight flyweight : flyweights) {
			System.out.print(flyweight.getMessage());
		}
	}
}
