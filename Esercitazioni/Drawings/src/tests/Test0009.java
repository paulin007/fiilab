package tests;

import java.awt.Color;

import javax.swing.JFrame;

import drawings.Circle;
import drawings.ColoredDrawable;
import drawings.DefaultSettings;
import drawings.DrawingsPanel;
import drawings.StrokedDrawable;

/**
 * Lancia una Finestra e ci Disegna
 * un Fiore
 */
public class Test0009 {

	public static void main(String[] args) {
		
		DrawingsPanel panel=new DrawingsPanel();
		
		DefaultSettings.getSettings().setColor(Color.RED);
		DefaultSettings.getSettings().setWidth(2);

		panel.addDrawable(new DefaultSettingsDrawable());
		panel.addDrawable(new Circle(150, 100, 20));
		panel.addDrawable(new Circle(100, 150, 20));		

		panel.addDrawable(
				new StrokedDrawable(
						new ColoredDrawable(Color.GREEN,
				new Circle(100, 100, 20)),1));

		
		JFrame frame=new JFrame();
		frame.setTitle("Drawings");
		frame.setSize(300,200);
		frame.setDefaultCloseOperation(
				JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel);
		frame.setVisible(true);
	}
}