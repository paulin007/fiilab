package fileSystem.factoryWithFlyweight;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;

public class BufferedImageFlyweight {

	private HashMap<String, BufferedImage> drawableIcons=new HashMap<String, BufferedImage>();
	
	public BufferedImage getIcon(String filePath) throws IOException{
		
		BufferedImage icon=drawableIcons.get(filePath);
		
		if(icon==null){
			try {
				
				BufferedImage image=ImageIO.read(new File(filePath));
				drawableIcons.put(filePath, image);
				icon=image;
				
			} catch (IOException e) {
				throw e;
			}
		}
		
		return icon;
	}
}
