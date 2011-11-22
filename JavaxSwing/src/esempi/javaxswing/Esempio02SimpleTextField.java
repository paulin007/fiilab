package esempi.javaxswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Esempio02SimpleTextField  extends JFrame{

	private static final String CONTENT_STRING="Enter has been pressed, and content is: ";
	
	public static void main(String[] args) {
		Esempio02SimpleTextField frame1=new Esempio02SimpleTextField();
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public Esempio02SimpleTextField() {
	
		setTitle("Frame  1");
		setSize(400,100);
		
		final JTextField field=new JTextField();
		getContentPane().add(field);
		
		//Adding the event to be executed when a button is pressed;
		field.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(CONTENT_STRING+field.getText());
			}
		});
	
	}
}
