package dispositiviATeatro;

import java.util.HashMap;

import dispositiviATeatro.Messaggio.ColoreMessaggio;


/**
 * Una mappa colori che fornisce il colore che un certo dispositivo
 * visualizzatore deve associare ad ogni personaggio di una scena.
 * 
 * @author Alessandro Martinelli
 */
public class MappaColori {
	private HashMap<String, ColoreMessaggio> mappaColori = new HashMap<String, ColoreMessaggio>();

	public void aggiungiMappatura(String nomePersonaggio, ColoreMessaggio colore) {
		mappaColori.put(nomePersonaggio, colore);
	}

	public void clear() {
		mappaColori.clear();
	}

	/**
	 * Fornisce il colore associato ad un personaggio
	 * 
	 * @param nomePersonaggio
	 * @return Messaggio.GRIGIO se non c'è alcuna associazione
	 */
	public ColoreMessaggio getColore(String nomePersonaggio) {
		ColoreMessaggio value = mappaColori.get(nomePersonaggio);
		if (value == null) {
			return Messaggio.ColoreMessaggio.GRIGIO;
		}
		return value;
	}

	public MappaColori generaMappaColoriPerPersonaggi(String nomiPersonaggi[]) {
		MappaColori mappa = new MappaColori();
		for (int i = 0; i < nomiPersonaggi.length; i++) {
			String nomePersonaggio = nomiPersonaggi[i];
			mappa.aggiungiMappatura(nomePersonaggio, getColore(nomePersonaggio));
		}
		return mappa;
	}
}
