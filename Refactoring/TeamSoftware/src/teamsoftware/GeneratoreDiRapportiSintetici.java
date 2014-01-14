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
			
			boolean trovato = false;
			
			for (int i = 0; i < risultato.size(); i++) {
				
				StringTokenizer tokenizer2=new StringTokenizer(risultato.get(i));
				//"Giuseppe Verdi 12 Testing 12",
				
				String nome2=tokenizer2.nextToken();
				String cognome2=tokenizer2.nextToken();
				String ore2=tokenizer2.nextToken();
				String compito2=tokenizer2.nextToken();
				
				if(nome.equalsIgnoreCase(nome2)){
					if(cognome.equalsIgnoreCase(cognome2)){
						if(compito.equalsIgnoreCase(compito2)){
							trovato=true;
							risultato.remove(i);
							int sommaOre=Integer.parseInt(ore)+Integer.parseInt(ore2);
							risultato.add(nome+" "+cognome+" "+
									sommaOre+" "+compito+" "+sommaOre);
							i=risultato.size();
						}
					}
				}
			}
			
			if(!trovato){
				risultato.add(nome+" "+cognome+" "+ore+" "+compito+" "+ore);
			}
		}
		
		return risultato;
	}

}
