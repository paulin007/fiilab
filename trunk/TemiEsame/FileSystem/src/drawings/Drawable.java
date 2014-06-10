package drawings;

import java.awt.Graphics2D;

/**
 * Something which can be drawn on a Graphics2D
 * @author Alessandro Martinelli
 */
public interface Drawable {

	/**
	 * Draw this drawable
	 * @param graphics Graphics2D on which this drawalbe should be drawn
	 */
	public abstract void draw(Graphics2D graphics);

}