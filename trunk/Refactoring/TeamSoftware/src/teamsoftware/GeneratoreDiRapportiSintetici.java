package teamsoftware;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class GeneratoreDiRapportiSintetici {

	public ArrayList<String> generaRapportoSintetico(
			ArrayList<String> rapportoCompleto){
		
		ArrayList<String> risultato=new ArrayList<String>();
		
		for (String rapporto : rapportoCompleto) {
			
			//"Giuseppe Verdi 4 Testing 01-03-2014",
			StringTokenizer tokenizer=new StringTokenizer(rapporto);
		
			String nome=tokenizer.nextToken();
			String cognome=tokenizer.nextToken();
			String ore=tokenizer.nextToken();
			String compito=tokenizer.nextToken();
			String data=tokenizer.nextToken();
			
			Log log=new Log(nome, cognome, ore, compito);
			
			boolean trovato = false;
			trovato = cercaRisultato(risultato, log,
					trovato);
			
			if(!trovato){
				risultato.add(nome+" "+cognome+" "+ore+" "+compito+" "+ore);
			}
		}
		
		return risultato;
	}

	private boolean cercaRisultato(ArrayList<String> risultato,
			Log log, boolean trovato) {
		for (int i = 0; i < risultato.size(); i++) {
			
			StringTokenizer tokenizer2=new StringTokenizer(risultato.get(i));
			//"Giuseppe Verdi 12 Testing 12",
			
			String nome2=tokenizer2.nextToken();
			String cognome2=tokenizer2.nextToken();
			String ore2=tokenizer2.nextToken();
			String compito2=tokenizer2.nextToken();
			
			if(log.getNome().equalsIgnoreCase(nome2)){
				if(log.getCognome().equalsIgnoreCase(cognome2)){
					if(log.getCompito().equalsIgnoreCase(compito2)){
						trovato=true;
						risultato.remove(i);
						int sommaOre=Integer.parseInt(log.getOre())+Integer.parseInt(ore2);
						risultato.add(log.getNome()+" "+log.getCognome()+" "+
								sommaOre+" "+log.getCompito()+" "+sommaOre);
						i=risultato.size();
					}
				}
			}
		}
		return trovato;
	}
}
