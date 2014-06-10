package drawings;

import java.awt.Graphics;

public class Rectangle extends Shape implements Drawable{

	private int x,y;
	private int width,height;

	public Rectangle(int x, int y, int width, int height) {
		super(false);
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public Rectangle(int x, int y, int width, int height,
			boolean filled) {
		super(filled);
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void draw(Graphics graphics){
		if (isFilled()) {
			graphics.fillRect(x, y, 
					width, height);
		} else {
			graphics.drawRect(x, y, 
					width, height);
		}
	}
}
