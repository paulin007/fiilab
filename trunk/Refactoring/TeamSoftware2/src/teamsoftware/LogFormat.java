package teamsoftware;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class LogFormat implements ILogFormat {

	/* (non-Javadoc)
	 * @see teamsoftware.ILogFormat#generaRapportoSinteticoDaLog(teamsoftware.Log)
	 */
	@Override
	public String generaRapportoSinteticoDaLog(Log log) {
		return log.getNome()+" "+
				log.getCognome()+" "+
				log.getOre()+" "+
				log.getCompito()+" "+
				log.getOre();
	}

	/* (non-Javadoc)
	 * @see teamsoftware.ILogFormat#creaLogDaRapportoCompleto(java.lang.String)
	 */
	@Override
	public Log creaLogDaRapportoCompleto(String rapporto) {
		StringTokenizer tokenizer=new StringTokenizer(rapporto);
		
		String nome=tokenizer.nextToken();
		String cognome=tokenizer.nextToken();
		String ore=tokenizer.nextToken();
		String compito=tokenizer.nextToken();
		String data=tokenizer.nextToken();
		
		Log log=new Log(nome, cognome, compito, ore);
		return log;
	}

	/* (non-Javadoc)
	 * @see teamsoftware.ILogFormat#generaLogDaRapportoSintetico(java.util.ArrayList, int)
	 */
	@Override
	public Log generaLogDaRapportoSintetico(ArrayList<String> risultato, int i) {
		StringTokenizer tokenizer2 =new StringTokenizer(risultato.get(i));
	
		String nome2=tokenizer2.nextToken();
		String cognome2=tokenizer2.nextToken();
		String ore2=tokenizer2.nextToken();
		String compito2=tokenizer2.nextToken();
		
		Log log2=new Log(nome2, cognome2, compito2, ore2);
		return log2;
	}

}
