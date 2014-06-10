package dispositiviATeatro;

/**
 * Interfaccia per un dispositivo di Visualizzazione in grado di comunicare con
 * il sistema centrale.
 * 
 * @author Alessandro Martinelli
 */
public interface Visualizzatore {

	/**
	 * Fornisce l'elenco dei personaggi che questo visualizzatore è interessato
	 * a visualizzare
	 */
	public String[] personaggi();

	/**
	 * Prepara il dispositivo a ricevere tutte le informazioni della scena
	 */
	public void ripulisciMessaggi();

	/**
	 * Dice quale messaggio visualizzare ad un certo indice.
	 * 
	 * @param indice
	 * @param messaggio
	 */
	public void addMessaggio(Messaggio messaggio);

	/**
	 * Indica qual'è la battuta della scena che deve essere letta e posta in
	 * primo piano nel visualizzatore ora.
	 * 
	 * @param indice
	 */
	public void setCursore(int indice);
}
