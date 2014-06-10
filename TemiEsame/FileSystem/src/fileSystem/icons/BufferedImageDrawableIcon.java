package fileSystem.icons;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import fileSystem.DrawableIcon;

public class BufferedImageDrawableIcon implements DrawableIcon{

	private static final int HEIGHT=80;
	private static final int MAX_CHARACTERS=12;
	
	private BufferedImage image;
	
	private String name="-";

	public BufferedImageDrawableIcon(BufferedImage image) {
		super();
		this.image = image;
	}
	
	public BufferedImage getImage() {
		return image;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void draw(int x, int y, Graphics2D graphics) {
		graphics.drawImage(image, x, y, null);
		if(name.length()>MAX_CHARACTERS){
			name=name.substring(0,MAX_CHARACTERS-1)+"...";
		}
		graphics.drawString(name, x, y + HEIGHT);
	}
	
}
