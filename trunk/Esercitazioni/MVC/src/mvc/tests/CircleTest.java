package mvc.tests;

import javax.swing.JFrame;

import mvc.Circle;
import mvc.CircleController;
import mvc.CircleView;

public class CircleTest {

	public static void main(String[] args) {
		
		Circle circle = new Circle(100, 100, 50);
		
		CircleView view = new CircleView(circle);
		
		CircleController controller = 
			new CircleController(circle);
		
		view.addMouseListener(controller);
		view.addMouseMotionListener(controller);
		
		JFrame frame=new JFrame();
		frame.setTitle("Circle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.getContentPane().add(view);
		frame.setVisible(true);
	}
}
