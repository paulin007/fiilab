package drawings;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 * TODO
 * 
 * @author Alessandro
 */
public class CompositeDrawable implements Drawable{

	private ArrayList<Drawable> drawables=
		new ArrayList<Drawable>();
	//private Drawable drawable1;
	//private Drawable drawable2;
	
	public ArrayList<Drawable> getDrawables() {
		return drawables;
	}
	
	@Override
	public void draw(Graphics graphics) {
		//drawable1.draw(graphics);
		//drawable2.draw(graphics);
		for (int i = 0; i < drawables.size(); i++) {
			drawables.get(i).draw(graphics);
		}
	}

}
