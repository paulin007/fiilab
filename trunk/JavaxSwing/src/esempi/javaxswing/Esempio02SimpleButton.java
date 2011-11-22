package esempi.javaxswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Esempio02SimpleButton  extends JFrame{

	private static final String BUTTON_NAME="Hello World";
	private static final String BUTTON_ACTION_MESSAGE="Hello World";
	
	public static void main(String[] args) {
		Esempio02SimpleButton frame1=new Esempio02SimpleButton();
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public Esempio02SimpleButton() {
	
		setTitle("Frame  1");
		setSize(400,100);
		
		JButton button=new JButton(BUTTON_NAME);
		getContentPane().add(button);
		
		//Adding the event to be executed when a button is pressed;
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(BUTTON_ACTION_MESSAGE);
			}
		});
		
	}
}
