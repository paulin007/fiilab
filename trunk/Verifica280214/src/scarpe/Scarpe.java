package scarpe;

import java.io.File;
import java.io.IOException;

public class Scarpe {

	public static final String FILENAME = "stock.txt";
	
	public static void main(String[] args) {

		try {
			File file=new File(FILENAME);
			if(!file.exists()){
				file.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
