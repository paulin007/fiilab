package tests;

import javax.swing.JFrame;

import multimedialist.MultimediaContents;
import multimedialist.MultimediaList;
import multimedialist.MultimediaListListener;
import multimedialist.MultimediaPanel;
import multimedialist.MultimediaSettings;
import multimedialist.Placer;

/**
 * 
 * Disegnare una lista di Stringhe, la Stringa
 * in Focus è rossa, le altre sono nere. 
 * La Disposizione è Verticale.
 * Rendere la lista controllabile.
 * 
 * @author Alessandro Martinelli
 */
public class Test0001 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(800, 600);
		frame.setTitle("Multimedia List Test 0001");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MultimediaList list=new MultimediaList();
		MultimediaContents contents=new MultimediaContents();
		contents.addAll("Ciao","Bravo","Studente","Promosso");
		//list.addAll("Ciao","Bravo","Studente","Promosso");
		list.setContents(contents);
		
		list.setSettings(new MultimediaSettings());
		
		Placer placer=new Placer();
		list.setPlacer(placer);//<-----------
		
		MultimediaPanel panel=new MultimediaPanel();
		panel.setList(list);
		list.setPanel(panel);
		MultimediaListListener listener=
			new MultimediaListListener(list);
		listener.setPlacer(placer);//<-----------
		panel.addKeyListener(listener);
		frame.addKeyListener(listener);
		frame.getContentPane().add(panel);
		frame.setVisible(true);
		
	}
}
