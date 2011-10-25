package srp.applicato;

import java.awt.Graphics;

public class RettangoloDisegnabile extends Rettangolo{

	private int x,y;
	
	public RettangoloDisegnabile(int x,int y,int w,int h) {
		super(w,h);
		this.x=x;
		this.y=y;
	}
	
	public void draw(Graphics graphics){
		graphics.drawRect(x,y,getW(),getH());
	}
}
