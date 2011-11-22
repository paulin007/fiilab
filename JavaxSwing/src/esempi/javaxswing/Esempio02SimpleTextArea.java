package esempi.javaxswing;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Esempio02SimpleTextArea  extends JFrame{

	private static final String CONTENT_STRING="Enter has been pressed, and content is: ";
	
	public static void main(String[] args) {
		Esempio02SimpleTextArea frame1=new Esempio02SimpleTextArea();
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public Esempio02SimpleTextArea() {
	
		setTitle("Frame  1");
		setSize(400,400);
		
		final JTextArea field=new JTextArea();
		getContentPane().add(field);
		
	}
}
