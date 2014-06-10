package dispositiviATeatro;

import java.util.ArrayList;

import dispositiviATeatro.Messaggio.ColoreMessaggio;


/**
 * Un Mediator che implementa la logica del sistema centrale, ovvero gestisce la
 * comunicazione tra gli elementi del sistema.
 * 
 * Coordina un elenco di visualizzatori. Sceglie un colore per ogni personaggio
 * e colora i messaggi sui visualizzatori in funzione del set di personaggi che
 * ogni visualizzatore deve supportare.
 * 
 * @author Alessandro Martinelli
 */
public class BattuteMediator {

	private ArrayList<Visualizzatore> visualizzatori = new ArrayList<Visualizzatore>();
	private MappaColori mappaColoriCompleta = new MappaColori();
	private ArrayList<MappaColori> mappaColori = new ArrayList<MappaColori>();
	private Cast cast;

	/**
	 * Aggiunge un visualizzatore
	 * 
	 * @param visualizzatore
	 */
	public void addVisualizzatore(Visualizzatore visualizzatore) {
		visualizzatori.add(visualizzatore);
	}

	/**
	 * Imposta l'oggetto che contiene le informazioni relative al cast,
	 * necessario per la formattazione corretta dei messaggi
	 * 
	 * @param cast
	 */
	public void setCast(Cast cast) {
		this.cast = cast;
	}

	/**
	 * Carica un copione, aggiornando lo stato di tutti i tablet
	 * 
	 * @param scena
	 */
	public void caricaCopione(Scena scena) {
		// recupera l'elenco delle battute
		ArrayList<Battuta> copione = scena.getBattute();
		// associa ad ogni personaggio della scena un colore creando una mappa
		// di colori
		creaMappaColoriCompleta(scena.getPersonaggiPrincipali());
		// pulisce l'elenco delle mappe di colori associate ad ogni
		// visualizzatore
		mappaColori.clear();
		for (int i = 0; i < visualizzatori.size(); i++) {
			// cancella tutti i messaggi in un visualizzatore
			visualizzatori.get(i).ripulisciMessaggi();
			// crea una mappa specifica per un visualizzatore a partire dalla
			// mappa completa
			mappaColori.add(mappaColoriCompleta
					.generaMappaColoriPerPersonaggi(visualizzatori.get(i)
							.personaggi()));
		}
		// per ogni battuta
		for (int i = 0; i < copione.size(); i++) {
			Battuta battuta = copione.get(i);
			String nomePersonaggio = battuta.getNomePersonaggio();
			String nomeAttore = cast.getAttore(nomePersonaggio);
			String battuta_ = battuta.getBattuta();
			String messaggio = formattaBattuta(nomePersonaggio, nomeAttore,
					battuta_);
			for (int j = 0; j < visualizzatori.size(); j++) {
				// recupera il colore da associare alla battuta
				ColoreMessaggio colore = mappaColori.get(j).getColore(
						nomePersonaggio);
				// carica il messaggio sul visualizzatore
				visualizzatori.get(j).addMessaggio(
						new Messaggio(colore, messaggio));
			}
		}
	}

	private void creaMappaColoriCompleta(ArrayList<String> personaggiPrincipali) {

		mappaColoriCompleta.clear();
		for (int i = 0; i < personaggiPrincipali.size(); i++) {
			// Si suppone che i colori siano nell'intervallo
			// [0,NUMERO_COLORI_VALIDI-1] come è in Messaggio
			ColoreMessaggio values[] = ColoreMessaggio.values();
			ColoreMessaggio colore = values[i % values.length];
			mappaColoriCompleta.aggiungiMappatura(personaggiPrincipali.get(i),
					colore);
		}
	}

	private String formattaBattuta(String nomePersonaggio, String nomeAttore,
			String battuta) {
		return nomePersonaggio + " (" + nomeAttore + ") :" + battuta;
	}

	/**
	 * Indica qual'è la battuta della scena che deve essere letta e posta in
	 * primo piano nel visualizzatore ora.
	 * 
	 * @param indice
	 */
	public void setCursore(int indice) {
		for (int i = 0; i < visualizzatori.size(); i++) {
			visualizzatori.get(i).setCursore(indice);
		}
	}
}