package mvc.tests;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import mvc.Circle;
import mvc.CircleController;
import mvc.CircleView;

public class CircleTest2 {

	public static void main(String[] args) {
		
		Circle circle = new Circle(100, 100, 50);
		
		CircleView view = new CircleView(circle);
		
		CircleController controller = 
			new CircleController(circle);
		
		view.addMouseListener(controller);
		view.addMouseMotionListener(controller);
		
			JPanel panel=new JPanel();
			panel.setLayout(new BorderLayout());
			panel.add(view);
			
				JPanel buttonsPanel=new JPanel();
				buttonsPanel.setLayout(new GridLayout(3, 1));
				
				JButton circleButton=new JButton("Circle");
				
					circleButton.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent arg0) {
							System.out.println("Circle");
						}
					});
				
				buttonsPanel.add(circleButton);

				JButton rectangleButton=new JButton("Rectangle");

					rectangleButton.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent arg0) {
							System.out.println("Rectangle");
						}
					});
				
				buttonsPanel.add(rectangleButton);

				JButton dragButton=new JButton("Drag");
					
					dragButton.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent arg0) {
							System.out.println("Drag");
						}
					});
				
				buttonsPanel.add(dragButton);
				
			panel.add(buttonsPanel,BorderLayout.EAST);	
				
		
		JFrame frame=new JFrame();
		frame.setTitle("Circle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.getContentPane().add(panel);
		frame.setVisible(true);
	}
}
