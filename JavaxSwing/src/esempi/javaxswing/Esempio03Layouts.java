package esempi.javaxswing;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Here we are applying a Grid Layout to place 4 Buttons and 
 * 4 TextFields in a Panel. When the user is pressing 
 * on one of the Buttons, a JDialog is shown with a message
 * reporting the content of one of the TextFields.
 * 
 * @author Alessandro Martinelli
 */
public class Esempio03Layouts  extends JFrame{

	private static final String PRESSING="Pressing";
	
	public static void main(String[] args) {
		Esempio03Layouts frame1=new Esempio03Layouts();
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private Esempio03Layouts() {
		
		setTitle(getClass().getSimpleName());

		//Placing this window in the center of the screen
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((int)screenSize.getWidth()>>2, (int)screenSize.getHeight()>>2,
				(int)screenSize.getWidth()>>1, (int)screenSize.getHeight()>>1);
		
		//adding 4 FieldAndButton Panel with different Layout
		getContentPane().setLayout(new GridLayout(4,1));
		
		FieldAndButtonPanel panel1 =new FieldAndButtonPanel("Button 1",Color.RED,new GridLayout(1,2));
		FieldAndButtonPanel panel2 =new FieldAndButtonPanel("Button 2",Color.GREEN,new CardLayout());
		FieldAndButtonPanel panel3 =new FieldAndButtonPanel("Button 3",Color.BLUE,new FlowLayout());
		FieldAndButtonPanel panel4 =new FieldAndButtonPanel("Button 4",Color.YELLOW,new BorderLayout());
		
		getContentPane().add(panel1);
		getContentPane().add(panel2);
		getContentPane().add(panel3);
		getContentPane().add(panel4);
	}
	
	
	/* NOTE: this internal class is declared private, 
	 * so it can be instanced only inside its external class.
	 */
	private class FieldAndButtonPanel extends JPanel{
		
		public FieldAndButtonPanel(final String buttonName,Color background,
				LayoutManager manager) {

			setLayout(manager);
			
			final JTextField field=new JTextField(buttonName);
			add(field);
			
			JButton button=new JButton(buttonName);
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					System.out.println(PRESSING+buttonName);
				}
			});
			add(button);
			
			setBackground(background);
		}
		
	}

}