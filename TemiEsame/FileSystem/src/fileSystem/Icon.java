package fileSystem;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import drawings.Drawable;

public class Icon implements Drawable {

	private Action action;
	private DrawableIcon drawableIcon;
	private Rectangle2D rectangle;

	public void setDrawableIcon(DrawableIcon drawableIcon) {
		this.drawableIcon = drawableIcon;
	}
	
	public void setAction(Action action) {
		this.action = action;
	}
	
	public Action getAction() {
		return action;
	}
	
	public DrawableIcon getDrawableIcon() {
		return drawableIcon;
	}

	public void setRectangle(Rectangle2D rectangle) {
		this.rectangle = rectangle;
	}
	
	public Rectangle2D getRectangle() {
		return rectangle;
	}
	
	@Override
	public void draw(Graphics2D graphics){
		drawableIcon.draw((int)rectangle.getX(), (int)rectangle.getY(), graphics);
	}
	
	public boolean click(int x,int y){
		if(rectangle.contains(x, y) && action!=null){
			action.execute();
			return true;
		}
		return false;
	}
}
