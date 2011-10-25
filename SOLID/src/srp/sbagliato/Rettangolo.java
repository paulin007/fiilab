package srp.sbagliato;

import java.awt.Graphics;

public class Rettangolo {

	private int x,y,w,h;
	
	public Rettangolo(int x, int y, int w, int h) {
		super();
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	public void draw(Graphics graphics){
		graphics.drawRect(x,y,w,h);
	}
	
	public float getArea(){
		return w*h;
	}
}
