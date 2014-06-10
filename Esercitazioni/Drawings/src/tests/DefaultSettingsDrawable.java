package tests;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

import drawings.DefaultSettings;
import drawings.Drawable;

public class DefaultSettingsDrawable implements Drawable{

	@Override
	public void draw(Graphics graphics) {
		Graphics2D graphics2D=(Graphics2D)graphics;
		graphics.setColor(DefaultSettings.getSettings().getColor());
		graphics2D.setStroke(new BasicStroke(
				DefaultSettings.
				getSettings().getWidth()));
	}
}
