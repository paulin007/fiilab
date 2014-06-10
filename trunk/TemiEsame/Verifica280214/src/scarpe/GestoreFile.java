package scarpe;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

public class GestoreFile implements Observer{
	
	public static final String FILENAME = "stock.txt";

	private ScarpeModel model;
	
	public GestoreFile(ScarpeModel model) {
		super();
		this.model = model;
		model.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		this.aggiungiStock(model.getStockTest());
	}
	
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
