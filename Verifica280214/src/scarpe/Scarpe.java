package scarpe;

import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Scarpe {

	public static final String FILENAME = "stock.txt";
	
	public static int number;
	public static int size;
	public static String model;
	
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
			
			final TextField fieldNumber=new TextField();
			fieldsPanel.add(fieldNumber);
			fieldNumber.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Scarpe.number=Integer.parseInt(fieldNumber.getText());
				}
			});
			
			final TextField fieldSize=new TextField();
			fieldsPanel.add(fieldSize);
			fieldSize.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Scarpe.size=Integer.parseInt(fieldSize.getText());
				}
			});

			final TextField fieldModel=new TextField();
			fieldsPanel.add(fieldModel);
			fieldModel.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Scarpe.model=fieldModel.getText();
				}
			});
		
		JPanel resultsPanel=new JPanel();
		
			resultsPanel.setLayout(new GridLayout(2, 1));
			
			final JLabel resultLabel=new JLabel();
			
			JButton insertButton=new JButton("Insert");
			insertButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					String text=Scarpe.number+" "+Scarpe.model+"("
						+Scarpe.size+")";
					
					resultLabel.setText(text);
					
					try {
						FileWriter writer=new FileWriter(new File(FILENAME),true);
						writer.append(text);
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
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
