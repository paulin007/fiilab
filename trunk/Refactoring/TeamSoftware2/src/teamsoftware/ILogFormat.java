package teamsoftware;

import java.util.ArrayList;

/**
 * TODO : scrivere tutti i Javadoc
 * 
 * @author Alessandro
 */
public interface ILogFormat {

	public abstract String generaRapportoSinteticoDaLog(Log log);

	public abstract Log creaLogDaRapportoCompleto(String rapporto);

	public abstract Log generaLogDaRapportoSintetico(
			ArrayList<String> risultato, int i);

}