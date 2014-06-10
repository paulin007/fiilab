package javaio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Esistono alcune importanti differenze tra un byte ed un char. 
 * 
 * Dal punto di vista del codice java:
 * 
 * 			- Un byte � un intero ad 8 bit e sta nell'intervallo [-128,127]
 * 	        - Un char � un intero ad 8 bit e sta nell'intervallo [0,255] quando la codifica � UTF8
 * 
 * Dal punto di vista della codifica nei file
 * 
 * 			- Un byte � sempre un valore di 8 bit e viene salvato nei file come valore ad 8 bit.
 * 			- Un char � un carattere. Ai caratteri � possibile associare una codifica,
 * 			e questo fa si che i caratteri vengano scritti nei file
 * 
 * In questo esempio si confrontano due file in cui viene salvato uno stesso vettore di caratteri.
 * Nel primo caso i caratteri sono convertiti in bytes, nel secondo caso sono convertiti in vettori
 * di caratteri.
 * 
 * @author Alessandro Martinelli
 */
public class Esempio06CharVSBytes {

	public static void main(String[] args) {
		
		String toBeWritten="Questa �una stringa che non pu� essere scritta correttamente in un\n" +
				"file perch� fa uso di caratteri della lingua italiana che devono \n" +
				"essere codificati correttamente\n";
		//Versione della stringa come vettore di char
		char[] stringChars=toBeWritten.toCharArray();
		//versione della stringa come vettore di byte
		byte[] data=new byte[stringChars.length];
		for (int i = 0; i < data.length; i++) {
			data[i]=(byte)(stringChars[i]);
		}
		
		try {
			//chars.char è un file che viene salvato e che conterr� la stringa scritta con i char
			FileWriter writer=new FileWriter(new File("chars.char"));
			System.out.println("Il file chars.char sta utilizzando la codifica "+writer.getEncoding());
			writer.write(stringChars);
			writer.close();
			//NOTA: verificare le dimensioni in byte del file 'chars.char'
			
			//chars.byte è un file che viene salvato e che conterrà la stringa scritta con i bytes
			FileOutputStream stream=new FileOutputStream(new File("chars.byte"));
			stream.write(data);
			stream.close();
			//NOTA: verificare le dimensioni in byte del file 'chars.byte'
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
