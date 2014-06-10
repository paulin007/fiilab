package mainPanelTest;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import messagePanel.Message;
import messagePanel.MessagePanel;
import messagePanel.MessagePanelColor;

public class MessagePanelTest {

	public static void main(String[] args) {
		
		final MessagePanel panel=new MessagePanel();
		panel.removeAllMessage();
		panel.addMessage(new Message(MessagePanelColor.ORANGE, "First Test String"));
		panel.addMessage(new Message(MessagePanelColor.RED, "Second Test String"));
		panel.addMessage(new Message(MessagePanelColor.GRAY, "First Test String"));
		
		panel.setMessageCursor(1);
		
		KeyListener keyController=new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				super.keyPressed(e);
				if(e.getKeyCode()==KeyEvent.VK_UP){
					panel.setMessageCursor(panel.getMessageCursor()-1);
				}else if(e.getKeyCode()==KeyEvent.VK_DOWN){
					panel.setMessageCursor(panel.getMessageCursor()+1);
				} 
			}
		};
		
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.getContentPane().add(panel);
		frame.setTitle("Message Panel Test");
		frame.setVisible(true);
		
		frame.addKeyListener(keyController);
		panel.addKeyListener(keyController);
	}
}
