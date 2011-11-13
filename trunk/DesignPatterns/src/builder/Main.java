package builder;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Data> list=new LinkedList<Data>();
		Collections.addAll(list, new Data("Gatto"),new Data("Bacio"),new Data("Casa"),
				new Data("Studio"),new Data("Libro"),new Data("Informazioni"));
		
		executeOutput(list, new ConcreteBuilder1());
		executeOutput(list, new ConcreteBuilder2());
	}

	private static void executeOutput(List<Data> list,Builder builder) {
		Director director=new Director(builder);
		ElaboratedData data=director.generateInformations(list);
		System.out.println(data);
	}
	
}
