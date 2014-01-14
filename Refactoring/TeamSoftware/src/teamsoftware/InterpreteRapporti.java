package teamsoftware;

/**
 * Interfaccia per moduli in grado di interpretare Stringhe di testo come Log.
 * 
 * @author Alessandro
 */
public interface InterpreteRapporti {

	//TODO: non abbiamo previsto eccezioni nel caso in cui una Stringa non sia formattata correttamente
	
	/**
	 * Crea un log da una stringa che descrive un Rapporto completo.
	 * @param rapporto Il Rapporto Completo
	 * @return Il Log del Rapporto
	 */
	public abstract Log creaLogDaRapportoCompleto(String rapporto);

	/**
	 * Scrive i dati di un Log Sintetico in una Stringa
	 * @param rapporto Il Rapporto Sintetico
	 * @return
	 */
	public abstract String creaRapportoSinteticoDaLog(Log log);

	/**
	 * Crea un log da una stringa che descrive un Rapporto Sintetico.
	 * @param rapporto Il Rapporto Sintetico
	 * @return Il Log del Rapporto
	 */
	public abstract Log creaLogDaRapportoSintetico(String string);

}