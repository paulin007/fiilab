package dispositiviATeatro;

import java.util.HashMap;

/**
 * Una mappatura completa che dato il personaggio fornisce l'attore. Contiene
 * liste separate per attori Principali e comparse.
 * 
 * @author Alessandro Martinelli
 */
public class Cast {

	private HashMap<String, String> attoriPrincipali = new HashMap<String, String>();
	private HashMap<String, String> comparse = new HashMap<String, String>();

	public Cast(HashMap<String, String> attoriPrincipali,
			HashMap<String, String> comparse) {
		super();
		this.attoriPrincipali = attoriPrincipali;
		this.comparse = comparse;
	}

	/**
	 * @param personaggio
	 *            Nome del personaggio
	 * @return il Nome dell'attore che interpreta un personaggio
	 */
	public String getAttore(String personaggio) {
		String attore = attoriPrincipali.get(personaggio);
		if (attore == null) {
			attore = comparse.get(personaggio);
		}
		return attore;
	}

	public void addAttore(String personaggio, String attore) {
		attoriPrincipali.put(personaggio, attore);
	}

	public void addComparsa(String personaggio, String attore) {
		comparse.put(personaggio, attore);
	}
}
