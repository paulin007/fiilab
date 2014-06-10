package drawings;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class DrawingsPanel extends JPanel{
	
	private static final long serialVersionUID = 0;//this is just to shut up the compiler for 'Serializable' interface

	private ArrayList<Drawable> drawables=new ArrayList<Drawable>();
	
	public void addAll(Drawable... drawables){
		for (int i = 0; i < drawables.length; i++) {
			this.drawables.add(drawables[i]);
		}
	}
	
	public <T extends Drawable> void addAll(List<T> drawables){
		for (int i = 0; i < drawables.size(); i++) {
			this.drawables.add(drawables.get(i));
		}
	}
	
	public void removeAll(){
		drawables.clear();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D graphics2D=(Graphics2D)g;
		
		for (Drawable drawable : drawables) {
			drawable.draw(graphics2D);
		}
	}
	
}
