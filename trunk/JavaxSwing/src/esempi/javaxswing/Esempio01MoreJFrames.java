package esempi.javaxswing;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * A Simple Window
 * 
 * @author Alessandro Martinelli
 */
public class Esempio01MoreJFrames extends JFrame{

	public static void main(String[] args) {
		Esempio01MoreJFrames frame1=new Esempio01MoreJFrames();
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public Esempio01MoreJFrames() {
	
		setTitle("Frame  1");
		setSize(400,400);
		
		JLabel label=new JLabel("Ciao Mondo");
		getContentPane().add(label);
	}
}
