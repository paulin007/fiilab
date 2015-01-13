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
		
		ArrayList<String> risultato=new ArrayList<String>();
		
		for (String rapporto : rapportoCompleto) {
			
			Log log = format.creaLogDaRapportoCompleto(rapporto);
			
			boolean trovato = cercaRisultato(
					risultato,log);
			
			if(!trovato){
				risultato.add(format.generaRapportoSinteticoDaLog(log));
			}
		}
		
		return risultato;
	}


	private boolean cercaRisultato(ArrayList<String> risultato, 
			Log log) {

		boolean trovato = false;
		for (int i = 0; i < risultato.size(); i++) {
			
			Log log2 = format.generaLogDaRapportoSintetico(risultato, i);
			
			if(log.simili(log2)){
				trovato = true;
				risultato.remove(i);
				int sommaOre = log.getSommaOre(log2);
				Log logSomma=log.clone();
				logSomma.setOre(""+sommaOre);
				risultato.add(format.generaRapportoSinteticoDaLog(logSomma));
				i=risultato.size();
			}
		}
		return trovato;
	}
	
}
