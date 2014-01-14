package teamsoftware;

import java.util.ArrayList;

/**
 * Classe dedicata alla generazione di Rapporti Sintetici da Rapporti Completi
 * @author Alessandro
 */
public class GeneratoreDiRapportiSintetici {
	
	private InterpreteRapporti interprete;

	public GeneratoreDiRapportiSintetici(InterpreteRapporti interprete) {
		super();
		this.interprete = interprete;
	}

	/**
	 * Generazione Rapporti Sintetici da Rapporti Completi
	 * @param rapportoCompleto una lista di Stringhe di Rapporto Completo
	 * @return una lista di Stringhe di Rapporto Sintetico
	 */
	public ArrayList<String> generaRapportoSintetico(
			ArrayList<String> rapportoCompleto){
		
		ArrayList<Log> risultato=new ArrayList<Log>();
		
		for (String rapporto : rapportoCompleto) {
			
			//"Giuseppe Verdi 4 Testing 01-03-2014",
			Log log = interprete.creaLogDaRapportoCompleto(rapporto);
			
			if(!cercaRisultato(risultato, log)){
				risultato.add(log);
			}
		}

		ArrayList<String> risultatoStringhe=new ArrayList<String>();
		for (Log log : risultato) {
			risultatoStringhe.add(interprete.creaRapportoSinteticoDaLog(log));
		}
		
		return risultatoStringhe;
	}
	
	private boolean cercaRisultato(ArrayList<Log> risultato,Log log) {
		for (int i = 0; i < risultato.size(); i++) {
			
			Log log2 = risultato.get(i);
			
			if(log.stessiDati(log2)){
				log2.setOre(""+log.sommaOre(log2));
				return true;
			}
		}
		return false;
	}

}
