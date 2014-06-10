package tests;

import javax.swing.JFrame;

import drawings.Circle;
import drawings.DrawingsPanel;

/**
 * Lancia una Finestra e ci Disegna dei Cerchi
 */
public class Test0001 {

	public static void main(String[] args) {
		
		DrawingsPanel panel=new DrawingsPanel();
		
		panel.addDrawable(new Circle(20, 20, 10));
		panel.addDrawable(new Circle(100, 20, 10));
		panel.addDrawable(new Circle(20, 100, 10));
		
		JFrame frame=new JFrame();
		frame.setTitle("Drawings");
		frame.setSize(800,600);
		frame.setDefaultCloseOperation(
				JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel);
		frame.setVisible(true);
	}
}
