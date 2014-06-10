package scarpe;

import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ScarpeUI {

	public void generaUI(final ScarpeModel model){

		JPanel fieldsPanel=new JPanel();
			
			fieldsPanel.setLayout(new GridLayout(3, 1));
			
			final TextField fieldNumber=new TextField();
			fieldsPanel.add(fieldNumber);
			fieldNumber.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					model.setNumber(fieldNumber.getText());
				}
			});
			
			final TextField fieldSize=new TextField();
			fieldsPanel.add(fieldSize);
			fieldSize.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					model.setSize(fieldSize.getText());
				}
			});

			final TextField fieldModel=new TextField();
			fieldsPanel.add(fieldModel);
			fieldModel.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					model.setModel(fieldModel.getText());
				}
			});
		
		JPanel resultsPanel=new JPanel();
		
			resultsPanel.setLayout(new GridLayout(2, 1));
			
			final JLabel resultLabel=new JLabel();
			
			JButton insertButton=new JButton("Insert");
			insertButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					String text=model.getStockTest();
					
					resultLabel.setText(text);
					
					model.update();
				}
			});
			
			resultsPanel.add(insertButton);
			resultsPanel.add(resultLabel);
			
		
		JFrame frame=new JFrame();
		frame.setTitle("Stocks");
		frame.setSize(150, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
			frame.getContentPane().setLayout(new GridLayout(2, 1));
			frame.getContentPane().add(fieldsPanel);
			frame.getContentPane().add(resultsPanel);
			
		frame.setVisible(true);
	}
}
