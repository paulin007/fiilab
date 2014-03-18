package scarpe;

import java.util.Observable;

public class ScarpeModel extends Observable{

	private int number;
	private int size;
	private String model;
	
	public void setNumber(String text){
		this.number=Integer.parseInt(text);
	}
	
	public void setSize(String text){
		this.size=Integer.parseInt(text);
	}
	
	public void setModel(String text){
		this.model=text;
	}
	
	public String getStockTest(){
		String stock=this.number+" "+this.model+"("
			+this.size+")";
		return stock;
	}
	
	public void update(){
		setChanged();
		notifyObservers();
	}
}
