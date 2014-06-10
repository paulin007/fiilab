package javaio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Questo esempio mostra come salvare all'interno di un file un elenco di valori float usando il formato binario
 * 
 * @author Alessandro Martinelli
 */
public class Esempio04FileStreams {

	public static final int INT_BYTES_SIZE=4;
	
	public static void main(String[] args) {
		
		float[] data={
			1.0f,2.0f,3.0f,3.5f,1.5f,2.5f,7.0f	
		};
		
		try {
			OutputStream stream=new FileOutputStream(new File("valori.str"));
			
			//Salvo la lunghezza del vettore
			writeInt(stream, data.length);
			for (int i = 0; i < data.length; i++) {
				/*Converte il numero float in un intero che ha la stessa rappresentazione in bit*/
				int value=Float.floatToIntBits(data[i]);
				
				//stampo la versione in byte del valore float
				writeInt(stream, value);
			}
			stream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/* NOTA: a questo punto dell'esecuzione del programma il file viene salvato. 
		 * Verificare che il file è esattamente di 4+4*data.length byte.
		 * 
		 */
		
		try {
			InputStream stream=new FileInputStream(new File("valori.str"));
			int N=readInt(stream);
			
			for (int i = 0; i < N; i++) {
				
				float f=Float.intBitsToFloat(readInt(stream));
				System.out.println("Valore letto dal file "+f);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void writeInt(OutputStream stream,int N) throws IOException{
		byte[] data=new byte[INT_BYTES_SIZE];
		data[0]=(byte)((N & 0xff000000) >>24);
		data[1]=(byte)((N & 0xff0000) >>16);
		data[2]=(byte)((N & 0xff00) >>8);
		data[3]=(byte)((N & 0xff));
		stream.write(data);
	}
	
	private static int readInt(InputStream stream) throws IOException{
		byte[] data=new byte[INT_BYTES_SIZE];
		stream.read(data);
		
		/*il valore di un byte sta in [-128,127]
		 * per ricostruire un valore intero usando un byte alla volta,
		 * è necessario convertire ogni valore in [-128,127] in un valore
		 * intero che sia in [0,255]
		 */
		int v1=data[0]>=0?data[0]:data[0]+256;
		int v2=data[1]>=0?data[1]:data[1]+256;
		int v3=data[2]>=0?data[2]:data[2]+256;
		int v4=data[3]>=0?data[3]:data[3]+256;
		
		//si ricompone un intero che usa come bit quelli contenuti nei 4 byte.
		return (v1<<24) | (v2<<16) | (v3<<8) | v4;
	}
	
}
