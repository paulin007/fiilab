package fileSystem;

import java.awt.geom.Rectangle2D;

public class RegularGrid {

	private int width;
	private int height;
	private int offsetX;
	private int offsetY;
	private int cellWidth;
	private int cellHeight;
	
	private int cellX,cellY;
	
	public RegularGrid(int offsetX, int offsetY, int cellWidth, int cellHeight) {
		super();
		this.offsetX = offsetX;
		this.offsetY = offsetY;
		this.cellWidth = cellWidth;
		this.cellHeight = cellHeight;
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
	
	public void reset(){
		cellX=offsetX;
		cellY=offsetY;
	}
	
	public Rectangle2D nextCell(){
		Rectangle2D rectangle2d=new Rectangle2D.Float();
		rectangle2d.setRect(cellX, cellY, cellWidth, cellHeight);
		cellX+=cellWidth;
		if(cellX+cellWidth>width){
			cellX=offsetX;
			cellY+=cellHeight;
		}
		return rectangle2d;
	}
}
