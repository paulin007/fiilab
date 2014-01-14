package teamsoftware;

import java.util.StringTokenizer;

public class InterpreteRapportiDiTest {

	public Log creaLogDaRapportoCompleto(String rapporto) {
		StringTokenizer tokenizer=new StringTokenizer(rapporto);

		String nome=tokenizer.nextToken();
		String cognome=tokenizer.nextToken();
		String ore=tokenizer.nextToken();
		String compito=tokenizer.nextToken();
		String data=tokenizer.nextToken();
		
		Log log=new Log(nome, cognome, ore, compito);
		return log;
	}

	public String creaRapportoSinteticoDaLog(Log log) {
		return log.getNome()+" "+log.getCognome()+" "+
			log.getOre()+" "+log.getCompito()+" "+log.getOre();
	}
	
	public Log creaLogDaRapportoSintetico(String string) {
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
