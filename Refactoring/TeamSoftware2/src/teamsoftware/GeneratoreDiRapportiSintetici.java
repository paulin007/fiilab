package teamsoftware;

import java.util.ArrayList;

public class GeneratoreDiRapportiSintetici {
	
	private ILogFormat format;
	
	public GeneratoreDiRapportiSintetici(ILogFormat format) {
		super();
		this.format = format;
	}


	public ArrayList<String> generaRapportSintetico(
			ArrayList<String> rapportoCompleto){
		
		ArrayList<Log> logCompleto = rapportoToLog(rapportoCompleto);

		ArrayList<Log> risultato=new ArrayList<Log>();
		
		for (Log log : logCompleto) {
			
			boolean trovato = cercaRisultato(
					risultato,log);
			
			if(!trovato){
				risultato.add(log);
			}
		}

		return logToRapportoSintetico(risultato);
	}


	private boolean cercaRisultato(ArrayList<Log> risultato, 
			Log log) {

		boolean trovato = false;
		for (int i = 0; i < risultato.size(); i++) {
			
			Log log2 = risultato.get(i);
			
			if(log.simili(log2)){
				trovato = true;
				risultato.remove(i);
				int sommaOre = log.getSommaOre(log2);
				Log logSomma=log.clone();
				logSomma.setOre(""+sommaOre);
				risultato.add(logSomma);
				i=risultato.size();
			}
		}
		return trovato;
	}

	private ArrayList<String> logToRapportoSintetico(ArrayList<Log> risultato) {
		ArrayList<String> risultatoFormattato=new ArrayList<String>();

		for (Log log : risultato) {
			risultatoFormattato.
				add(format.generaRapportoSinteticoDaLog(log));
		}
		return risultatoFormattato;
	}


	private ArrayList<Log> rapportoToLog(ArrayList<String> rapportoCompleto) {
		ArrayList<Log> logCompleto=new ArrayList<Log>();
		for (String rapporto : rapportoCompleto) {
			logCompleto.add(format.creaLogDaRapportoCompleto(rapporto));
		}
		return logCompleto;
	}

	
}
