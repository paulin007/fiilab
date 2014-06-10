package drawings;

import java.awt.Color;
import java.awt.Graphics;

public class ColoredDrawable implements Drawable{

	private Color color;
	private Drawable drawable;
	
	public ColoredDrawable(Color color, Drawable drawable) {
		super();
		this.color = color;
		this.drawable = drawable;
	}

	@Override
	public void draw(Graphics graphics) {
		graphics.setColor(color);
		drawable.draw(graphics);
		graphics.setColor(DefaultSettings.
				getSettings().getColor());
	}
}
