package multimedialist;

import java.awt.Color;
import java.awt.Graphics;

public class MultimediaSettings implements IMultimediaSettings {

	/* (non-Javadoc)
	 * @see multimedialist.IMultimediaSettings#applySettings(java.awt.Graphics, int, int)
	 */
	@Override
	public void applySettings(Graphics graphics, int index, int i) {
		if(i==index){
			graphics.setColor(Color.RED);
		}else{
			graphics.setColor(Color.BLACK);
		}
	}
}
