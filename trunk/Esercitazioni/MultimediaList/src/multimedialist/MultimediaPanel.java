package multimedialist;

import java.awt.Graphics;

import javax.swing.JPanel;

public class MultimediaPanel extends JPanel implements Updatable{

	private Drawable list;
	
	public void setList(Drawable list) {
		this.list = list;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		list.draw(g);
	}
	
	/* (non-Javadoc)
	 * @see multimedialist.Updatable#update()
	 */
	@Override
	public void update(){
		repaint();
	}
}
