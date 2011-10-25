package srp.sbagliato;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grafica extends JPanel{

	private static final long serialVersionUID=0;
	private Rettangolo rett=new Rettangolo(10,10,100,100);

	@Override
	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		rett.draw(graphics);
	}
	
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setSize(400,400);
		frame.setTitle("Grafica");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Grafica());
		frame.setVisible(true);
	}
}
