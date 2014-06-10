package multimedialist;

import java.awt.Graphics;

public class MultimediaList implements Drawable {

	private IPlacer placer;
	private IMultimediaSettings settings;
	private IMultimediaContents contents;
	
	private int index;
	private Updatable panel;
	
	public void setPlacer(IPlacer placer) {
		this.placer = placer;
	}
	
	public void setContents(IMultimediaContents contents) {
		this.contents = contents;
	}
	
	public void setSettings(IMultimediaSettings settings) {
		this.settings = settings;
	}
	
	public void setPanel(Updatable panel) {
		this.panel = panel;
	}
	
	public void update(){
		panel.update();
	}
	
//	public void setPositioning(int positioning) {
//		this.placer.setPositioning(positioning);
//		panel.update();
//	}
	
	/* (non-Javadoc)
	 * @see multimedialist.Drawable#draw(java.awt.Graphics)
	 */
	@Override
	public void draw(Graphics graphics){
		for (int i = 0; i < contents.size(); i++) {
			settings.applySettings(graphics, index, i);
			String string=contents.getTitle(i);
			int[] xy=new int[2];
			placer.place(i, index, xy);
			
			graphics.drawString(string, xy[0], xy[1]);
		}
	}

	public void up(){
		index--;
		if(index<0)
			index=0;
		panel.update();
	}
	
	public void down(){
		index++;
		if(index>=contents.size())
			index=contents.size()-1;
		panel.update();
	}
}
