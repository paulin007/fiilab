package dispositiviATeatroTest;

import java.util.ArrayList;

import dispositiviATeatro.Scena;


/**
 * Un pannello di Test che simula il comportamento del Gobbo
 * 
 * @author Alessandro Martinelli
 */
public class GobboPanel extends VisualizzazionePanel {

	private static final long serialVersionUID = 0;

	private Scena scena;

	public GobboPanel(Scena scena) {
		super();
		this.scena = scena;
	}

	@Override
	public String[] personaggi() {
		ArrayList<String> prs = scena.getPersonaggiPrincipali();
		return prs.toArray(new String[prs.size()]);
	}

	public Scena getScena() {
		return scena;
	}

	public void setScena(Scena scena) {
		this.scena = scena;
	}
}
