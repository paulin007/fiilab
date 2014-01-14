package teamsoftware;

import java.util.ArrayList;

public class GeneratoreDiRapportiSintetici {
	
	private InterpreteRapportiDiTest interprete=new InterpreteRapportiDiTest();

	public ArrayList<String> generaRapportoSintetico(
			ArrayList<String> rapportoCompleto){
		
		ArrayList<String> risultato=new ArrayList<String>();
		
		for (String rapporto : rapportoCompleto) {
			
			//"Giuseppe Verdi 4 Testing 01-03-2014",
			Log log = interprete.creaLogDaRapportoCompleto(rapporto);
			
			boolean trovato = cercaRisultato(risultato, log);
			
			if(!trovato){
				risultato.add(interprete.creaRapportoSinteticoDaLog(log));
			}
		}
		
		return risultato;
	}
	
	private boolean cercaRisultato(ArrayList<String> risultato,Log log) {
		boolean trovato = false;
		for (int i = 0; i < risultato.size(); i++) {
			
			String string=risultato.get(i);
			Log log2 = interprete.creaLogDaRapportoSintetico(string);
			
			if(log.getNome().equalsIgnoreCase(log2.getNome())){
				if(log.getCognome().equalsIgnoreCase(log2.getCognome())){
					if(log.getCompito().equalsIgnoreCase(log2.getCompito())){
						trovato=true;
						risultato.remove(i);
						int sommaOre=Integer.parseInt(log.getOre())+
							Integer.parseInt(log2.getOre());
						log2.setOre(""+sommaOre);
						risultato.add(interprete.creaRapportoSinteticoDaLog(log2));
						i=risultato.size();
					}
				}
			}
		}
		return trovato;
	}

}
