package teamsoftware;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class GeneratoreDiRapportiSintetici {

	public ArrayList<String> generaRapportoSintetico(
			ArrayList<String> rapportoCompleto){
		
		ArrayList<String> risultato=new ArrayList<String>();
		
		for (String rapporto : rapportoCompleto) {
			
			//"Giuseppe Verdi 4 Testing 01-03-2014",
			Log log = creaLogDaRapportoCompleto(rapporto);
			
			boolean trovato = cercaRisultato(risultato, log);
			
			if(!trovato){
				risultato.add(creaRapportoSinteticoDaLog(log));
			}
		}
		
		return risultato;
	}


	private Log creaLogDaRapportoCompleto(String rapporto) {
		StringTokenizer tokenizer=new StringTokenizer(rapporto);

		String nome=tokenizer.nextToken();
		String cognome=tokenizer.nextToken();
		String ore=tokenizer.nextToken();
		String compito=tokenizer.nextToken();
		String data=tokenizer.nextToken();
		
		Log log=new Log(nome, cognome, ore, compito);
		return log;
	}

	private String creaRapportoSinteticoDaLog(Log log) {
		return log.getNome()+" "+log.getCognome()+" "+
			log.getOre()+" "+log.getCompito()+" "+log.getOre();
	}
	
	private boolean cercaRisultato(ArrayList<String> risultato,Log log) {
		boolean trovato = false;
		for (int i = 0; i < risultato.size(); i++) {
			
			String string=risultato.get(i);
			Log log2 = creaLogDaRapportoSintetico(string);
			
			if(log.getNome().equalsIgnoreCase(log2.getNome())){
				if(log.getCognome().equalsIgnoreCase(log2.getCognome())){
					if(log.getCompito().equalsIgnoreCase(log2.getCompito())){
						trovato=true;
						risultato.remove(i);
						int sommaOre=Integer.parseInt(log.getOre())+
							Integer.parseInt(log2.getOre());
						log2.setOre(""+sommaOre);
						risultato.add(creaRapportoSinteticoDaLog(log2));
						i=risultato.size();
					}
				}
			}
		}
		return trovato;
	}

	private Log creaLogDaRapportoSintetico(String string) {
		StringTokenizer tokenizer2=new StringTokenizer(string);
		//"Giuseppe Verdi 12 Testing 12",
		
		String nome2=tokenizer2.nextToken();
		String cognome2=tokenizer2.nextToken();
		String ore2=tokenizer2.nextToken();
		String compito2=tokenizer2.nextToken();
		
		Log log2=new Log(nome2, cognome2, ore2, compito2);
		return log2;
	}
}
