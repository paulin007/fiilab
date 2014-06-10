package dispositiviATeatro;

import java.util.ArrayList;

/**
 * Una generica scena, costutuita da un elenco di personaggi e battute
 * 
 * @author Alessandro Martinelli
 */
public class Scena {
	private ArrayList<String> personaggiPrincipali = new ArrayList<String>();
	private ArrayList<Battuta> battute = new ArrayList<Battuta>();

	public ArrayList<String> getPersonaggiPrincipali() {
		return personaggiPrincipali;
	}

	public void setPersonaggiPrincipali(ArrayList<String> personaggiPrincipali) {
		this.personaggiPrincipali = personaggiPrincipali;
	}

	public ArrayList<Battuta> getBattute() {
		return battute;
	}

	public void setBattute(ArrayList<Battuta> battute) {
		this.battute = battute;
	}
}
