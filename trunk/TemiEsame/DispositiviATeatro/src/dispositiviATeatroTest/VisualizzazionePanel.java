package dispositiviATeatroTest;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JPanel;

import dispositiviATeatro.Messaggio;
import dispositiviATeatro.Visualizzatore;
import dispositiviATeatro.Messaggio.ColoreMessaggio;


/**
 * Un generico JPanel che si comporta come Visualizzatore
 * 
 * @author Alessandro Martinelli
 */
public abstract class VisualizzazionePanel extends JPanel implements
		Visualizzatore {

	private static final long serialVersionUID = 0;

	private static HashMap<ColoreMessaggio, Color> colors = new HashMap<Messaggio.ColoreMessaggio, Color>();

	static {
		colors.put(ColoreMessaggio.GRIGIO, Color.GRAY);
		colors.put(ColoreMessaggio.ROSSO, Color.RED);
		colors.put(ColoreMessaggio.BLU, Color.BLUE);
		colors.put(ColoreMessaggio.VERDE, Color.GREEN);
		colors.put(ColoreMessaggio.GIALLO, Color.YELLOW);
		colors.put(ColoreMessaggio.ARANCIONE, Color.ORANGE);
		colors.put(ColoreMessaggio.MARRONE, Color.MAGENTA.darker());
		colors.put(ColoreMessaggio.VIOLA, Color.PINK.darker());
		colors.put(ColoreMessaggio.ROSA, Color.PINK);
		colors.put(ColoreMessaggio.OCRA, Color.ORANGE.brighter());
		colors.put(ColoreMessaggio.DEFAULT, Color.GRAY);
	};

	private ArrayList<Messaggio> messaggi = new ArrayList<Messaggio>();
	private int cursore = 0;

	@Override
	public void addMessaggio(Messaggio messaggio) {
		messaggi.add(messaggio);
	}

	@Override
	public void ripulisciMessaggi() {
		// ripulisce l'elenco dei messaggi
		messaggi.clear();
	}

	@Override
	public void setCursore(int indice) {
		this.cursore = indice;
		repaint();
	}

	@Override
	protected void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);

		for (int i = -2; i <= 2; i++) {
			int index = cursore + i;
			if (index >= 0 && index < messaggi.size()) {
				ColoreMessaggio colore = messaggi.get(index).getColore();
				graphics.setColor(colors.get(colore));
				graphics.drawString(messaggi.get(index).getTesto(), 20,
						140 + 50 * i);
			}
		}
	}
}
