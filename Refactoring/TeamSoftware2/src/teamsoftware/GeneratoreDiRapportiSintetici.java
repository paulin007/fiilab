package teamsoftware;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class GeneratoreDiRapportiSintetici {

	public ArrayList<String> generaRapportSintetico(
			ArrayList<String> rapportoCompleto){
		
		ArrayList<String> risultato=new ArrayList<String>();
		
		for (String rapporto : rapportoCompleto) {
			
			Log log = creaLogDaRapportoCompleto(rapporto);
			
			boolean trovato = cercaRisultato(
					risultato,log);
			
			if(!trovato){
				risultato.add(generaRapportoSinteticoDaLog(log));
			}
		}
		
		return risultato;
	}

	private String generaRapportoSinteticoDaLog(Log log) {
		return log.getNome()+" "+
				log.getCognome()+" "+
				log.getOre()+" "+
				log.getCompito()+" "+
				log.getOre();
	}

	private Log creaLogDaRapportoCompleto(String rapporto) {
		StringTokenizer tokenizer=new StringTokenizer(rapporto);
		
		String nome=tokenizer.nextToken();
		String cognome=tokenizer.nextToken();
		String ore=tokenizer.nextToken();
		String compito=tokenizer.nextToken();
		String data=tokenizer.nextToken();
		
		Log log=new Log(nome, cognome, compito, ore);
		return log;
	}

	private boolean cercaRisultato(ArrayList<String> risultato, 
			Log log) {

		boolean trovato = false;
		for (int i = 0; i < risultato.size(); i++) {
			
			Log log2 = generaLogDaRapportoSintetico(risultato, i);
			
			if(log.getNome().equalsIgnoreCase(log2.getNome())){
				if(log.getCognome().equalsIgnoreCase(log2.getCognome())){
					if(log.getCompito().equalsIgnoreCase(log2.getCompito())){
						trovato = true;
						risultato.remove(i);
						int sommaOre = log.getSommaOre(log2);
						risultato.add(log.getNome()+" "+log.getCognome()+" "+
								sommaOre+" "+log.getCompito()+" "+sommaOre);
						i=risultato.size();
					}
				}
			}
		}
		return trovato;
	}

	private Log generaLogDaRapportoSintetico(ArrayList<String> risultato, int i) {
		StringTokenizer tokenizer2 =new StringTokenizer(risultato.get(i));

		String nome2=tokenizer2.nextToken();
		String cognome2=tokenizer2.nextToken();
		String ore2=tokenizer2.nextToken();
		String compito2=tokenizer2.nextToken();
		
		Log log2=new Log(nome2, cognome2, compito2, ore2);
		return log2;
	}
	
}
