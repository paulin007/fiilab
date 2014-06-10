package mvc;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class CircleView extends JPanel 
						implements Observer{

	private Circle circle;

	public CircleView(Circle circle) {
		super();
		this.circle = circle;
		circle.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		repaint();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawOval(circle.getX()-(circle.getRadius()>>1), 
				circle.getY()-(circle.getRadius()>>1), 
				circle.getRadius(), 
				circle.getRadius());
	}
}
