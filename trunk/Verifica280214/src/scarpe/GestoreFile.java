package scarpe;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GestoreFile {
	
	public static final String FILENAME = "stock.txt";
	
	public void inizializzaFile(){
		try {
			File file=new File(FILENAME);
			if(!file.exists()){
				file.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void aggiungiStock(String stock){
		try {
			FileWriter writer=new FileWriter(new File(FILENAME),true);
			writer.append(stock);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
