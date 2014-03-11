package scarpe;

import java.awt.GridLayout;
import java.awt.TextField;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Scarpe {

	public static final String FILENAME = "stock.txt";
	
	public static void main(String[] args) {

		try {
			File file=new File(FILENAME);
			if(!file.exists()){
				file.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		JPanel fieldsPanel=new JPanel();
			
			fieldsPanel.setLayout(new GridLayout(3, 1));
			
			TextField fieldNumber=new TextField();
			fieldsPanel.add(fieldNumber);

			TextField fieldSize=new TextField();
			fieldsPanel.add(fieldSize);

			TextField fieldModel=new TextField();
			fieldsPanel.add(fieldModel);
		
		JPanel resultsPanel=new JPanel();
		
			resultsPanel.setLayout(new GridLayout(2, 1));
			
			JLabel resultLabel=new JLabel();
			
			JButton insertButton=new JButton("Insert");
			
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
