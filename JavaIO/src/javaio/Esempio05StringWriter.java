package javaio;

import java.io.StringWriter;

/**
 * Questo esempio mostra come scrivere in modo efficente una stringa molto lunga usando 
 * la classe StringWriter
 * 
 * @author Alessandro Martinelli
 */
public class Esempio05StringWriter {

	public static void main(String[] args) {
	
		StringWriter writer=new StringWriter();
		
		long time1_millis=System.currentTimeMillis(); //per avere il tempo in millisecondi
		long time1=System.nanoTime(); //per avere il tempo in nanosecondi
		
			for(int i=0;i<10000;i++){
				
				writer.write("La radice quadrata di "+i+" è "+Math.sqrt(i)+"\n");
			}

		long time2_millis=System.currentTimeMillis(); //per avere il tempo in millisecondi
		long time2=System.nanoTime(); //per avere il tempo in nanosecondi
			
		System.out.println(writer.toString());
		System.out.println("La procedura ha richiesto "+(time2-time1)+" nanosecondi");
		System.out.println("La procedura ha richiesto "+(time2_millis-time1_millis)+" millisecondi");
	}
}
