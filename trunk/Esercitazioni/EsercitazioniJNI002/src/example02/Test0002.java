package example02;

import java.util.Arrays;

public class Test0002 {

	public static void main(String[] args) {
		
		float[] d=new float[10];
		
		Randomizer randomizer=new Randomizer();
		int size = randomizer.randomNumbers(d);
		
		System.out.println("size:("+size+"),"+Arrays.toString(d));
	}
}
