package esempi.javaxswing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * This example shows how to open two JFrame. 
 * NOTE: we are using 2 completely different ways open/define
 * Frame1 and Frame2
 * 
 * @author Alessandro Martinelli
 */
public class Esempio01JFrame extends JFrame{

	public static void main(String[] args) {
		Esempio01JFrame frame1=new Esempio01JFrame();
		frame1.setVisible(true);
		
		Frame2 frame2=new Frame2();
		frame2.setVisible(true);
	
		/*NOTE: the setDefaultCloseOperation tell what to do
		 * when the user is closing a frame. Note that, has programmed here,
		 * the user need to close frame1 to exit the program.
		 */
		frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public Esempio01JFrame() {
		
		/*NOTE: the getClass() function is part of the java reflection mechanism.
		 *It returns an instance of the 'Class' class which contains
		 *a description of an object class itself. We are using
		 *it here to write the Class Name on the Frame Title
		 */
		setTitle("Frame1: Class "+getClass().getSimpleName());
		
		/*
		 * NOTE: Toolkit.getDefaultToolkit() returns a singleton instance of the Toolkit class.
		 * the Toolkit class gives a lot of functionalities which can be exploited while 
		 * working on graphical user interfaces.
		 */
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		/* Making this frame as wide as half of the screen size 
		 */
		screenSize.setSize((int)screenSize.getWidth()>>1, (int)screenSize.getWidth()>>1);
		setSize(screenSize);
		
		//Assignig a white color to this frame
		getContentPane().setBackground(Color.WHITE);
	}
	
	/**
	 * NOTE 1: this class is an internal class
	 * 
	 * NOTE 2: this class is declared 'static'. Static classes
	 * can be instanced in static methods. Normal
	 * class classes cannot be instanced in static methods.
	 * 
	 * @author Alessandro Martinelli
	 */
	public static class Frame2 extends JFrame{
		
		public Frame2() {
			/*NOTE: here we are using getName instead of getSimpleName(), so we 
			 * are writing the wall Name (package.Class_Name)
			 * of the frame instead of the Simple Class Name
			 */
			setTitle("Frame1: Class "+getClass().getName());
			
			/** Making this frame as wide as half of the screen size 
			 */
			
			Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
			
			//Placing this window in the center of the screen
			setBounds((int)screenSize.getWidth()>>2, (int)screenSize.getHeight()>>2,
					(int)screenSize.getWidth()>>1, (int)screenSize.getHeight()>>1);
		}
	}
}
