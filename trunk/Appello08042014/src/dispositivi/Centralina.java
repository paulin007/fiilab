package dispositivi;

import java.util.HashMap;
import java.util.StringTokenizer;

public class Centralina {
	
	private HashMap<String, Dispositivo> luci=
		new HashMap<String, Dispositivo>();

	public String getRisposta(String richiesta){
		
		StringTokenizer tokenizer=new StringTokenizer(richiesta);
		
		String nomeDispositivo=tokenizer.nextToken();
		
		Dispositivo luce=luci.get(nomeDispositivo);
		String comando=tokenizer.nextToken();
		if(comando.equals("on")){
			luce.accendi();
		}else if(comando.equals("off")){
			luce.spegni();
		} 
		
		return nomeDispositivo+" done";
	}
	
	public void registraLuce(String name,Dispositivo luce){
		luci.put(name, luce);
	}
}
