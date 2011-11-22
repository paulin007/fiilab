package esempi.javaxswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class Esempio02TextFieldEvents  extends JFrame{

	private static final String CONTENT_STRING="Enter has been pressed, and content is: ";
	private static final String CHANGING_CARET="Caret is moving";
	private static final String KEY_PRESS="KEY has been pressed: ";
	private static final String KEY_RELEASE="KEY has been release: ";
	
	public static void main(String[] args) {
		Esempio02TextFieldEvents frame1=new Esempio02TextFieldEvents();
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public Esempio02TextFieldEvents() {
	
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
	
		field.addCaretListener(new CaretListener() {
			
			@Override
			public void caretUpdate(CaretEvent arg0) {
				System.out.println(CHANGING_CARET);
			}
		});
		
		field.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				//Do nothing
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				System.out.println(KEY_RELEASE+arg0.getKeyChar());
			}
			
			@Override
			public void keyPressed(KeyEvent arg0) {
				System.out.println(CHANGING_CARET+arg0.getKeyChar());
			}
		});
	}
}
