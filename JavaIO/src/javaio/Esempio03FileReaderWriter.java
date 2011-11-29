package javaio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Questo esempio mostra come salvare all'interno di un file un elenco di valori float usando il formato binario
 * 
 * @author Alessandro Martinelli
 */
public class Esempio03FileReaderWriter {

	public static void main(String[] args) {

		float[] data={
			1.0f,2.0f,3.0f,3.5f,1.5f,2.5f,7.0f	
		};
		
		try {
			Writer writer=new FileWriter(new File("valori.txt"));
			
			for (int i = 0; i < data.length; i++) {
				writer.write(data[i]+"\n");
			}
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/* NOTA: a questo punto dell'esecuzione del programma il file viene salvato. 
		 * Il suo contenuto può essere aperto con un editor di testo
		 */
		
		try {
			BufferedReader reader=new BufferedReader(new FileReader(new File("valori.txt")));
			
			String line=reader.readLine();
			
			while(line!=null){
				
				Float f=new Float(line);
				
				System.out.println("Valore letto dal file "+f);
				
				line=reader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
