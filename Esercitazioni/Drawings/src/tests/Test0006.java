package tests;

import javax.swing.JFrame;

import drawings.CurveDrawable;
import drawings.DrawingsPanel;
import drawings.FlowerModel;

/**
 * Lancia una Finestra e ci Disegna
 * un Fiore
 */
public class Test0006 {

	public static void main(String[] args) {
		
		DrawingsPanel panel=new DrawingsPanel();
		
		panel.addDrawable(
				new CurveDrawable(
				new FlowerModel(100, 100, 6, 60)));
		
		JFrame frame=new JFrame();
		frame.setTitle("Drawings");
		frame.setSize(300,200);
		frame.setDefaultCloseOperation(
				JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel);
		frame.setVisible(true);
	}
}