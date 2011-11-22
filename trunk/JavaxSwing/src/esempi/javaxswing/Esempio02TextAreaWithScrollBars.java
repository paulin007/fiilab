package esempi.javaxswing;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Esempio02TextAreaWithScrollBars  extends JFrame{

	private static final String CONTENT_STRING="Enter has been pressed, and content is: ";
	
	public static void main(String[] args) {
		Esempio02TextAreaWithScrollBars frame1=new Esempio02TextAreaWithScrollBars();
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public Esempio02TextAreaWithScrollBars() {
	
		setTitle("Frame  1");
		setSize(400,400);
		
		JTextArea textArea = new JTextArea(); 
		JScrollPane scrollableTextArea = new JScrollPane(textArea); 
		
		getContentPane().add(scrollableTextArea);
	}
}
