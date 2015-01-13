package dispositivi;

import java.util.HashMap;
import java.util.StringTokenizer;

import tests.dispositivi.LuceDiTest;

public class Centralina {
	
	private HashMap<String, LuceDiTest> luci=
		new HashMap<String, LuceDiTest>();

	public String getRisposta(String richiesta){
		
		StringTokenizer tokenizer=new StringTokenizer(richiesta);
		
		String nomeDispositivo=tokenizer.nextToken();
		
		LuceDiTest luce=luci.get(nomeDispositivo);
		String comando=tokenizer.nextToken();
		if(comando.equals("on")){
			luce.accendi();
		}else if(comando.equals("off")){
			luce.spenta();
		} 
		
		return nomeDispositivo+" done";
	}
	
	public void registraLuce(String name,LuceDiTest luce){
		luci.put(name, luce);
	}
}
