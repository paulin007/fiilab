package esempi.javaxswing;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
public class Esempio04JDialog  extends JFrame{

	public static void main(String[] args) {
		Esempio04JDialog frame1=new Esempio04JDialog();
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private static Esempio04JDialog esempio; 
	
	private Esempio04JDialog() {
		
		setTitle(getClass().getSimpleName());

		//Placing this window in the center of the screen
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((int)screenSize.getWidth()>>2, (int)screenSize.getHeight()>>2,
				(int)screenSize.getWidth()>>1, (int)screenSize.getHeight()>>1);
		
		//setting the singleton instance in this class as this isntance
		Esempio04JDialog.esempio=this;
		
		//adding our GridLayout Panel
		getContentPane().add(new GridPanel());
	}
	
	
	/* NOTE: this internal class is declared private, 
	 * so it can be instanced only inside its external class.
	 */
	private class GridPanel extends JPanel{
		
		private static final int ROWS=4;
		private static final int COLS=4;
		private static final String HALF_MESSAGE="You wrote : ";
		private static final String BUTTON_BASE_NAME="Button ";
		
		
		public GridPanel() {
			
			setLayout(new GridLayout(ROWS,COLS));
			
			for (int i = 0; i < ROWS; i++) {
				addFieldAndButton(BUTTON_BASE_NAME+i);
			}
		}
		
		public void addFieldAndButton(String buttonName){
			
			final JTextField field=new JTextField();
			add(field);
			
			JButton button=new JButton(buttonName);
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					AlertDialog dialog= new AlertDialog(esempio,HALF_MESSAGE+field.getText());
					dialog.setVisible(true);
				}
			});
			add(button);
		}
	}
	
	
	public class AlertDialog extends JDialog{

		/* we are creating a modal frame ; modal frame blocks
		 * windows which are defined as their owners. 
		 * To change to a non-modal frame, 
		 * change 'super(owner,true)' with 'super(owner,false)'
		 */
		public AlertDialog(Frame owner,String alert) {
			super(owner,true);

			/*Adding a label to this dialog*/
			setSize(400,400);
			JLabel label=new JLabel();
		
			label.setText(alert);
			getContentPane().add(label);

			//Placing this window in the center of the screen
			Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
			setBounds(3*(int)screenSize.getWidth()>>3, 3*(int)screenSize.getHeight()>>3,
					(int)screenSize.getWidth()>>2, (int)screenSize.getHeight()>>2);
		}
	}
}