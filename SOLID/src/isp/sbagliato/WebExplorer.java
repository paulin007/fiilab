package isp.sbagliato;

public class WebExplorer {

	private IModem modem;

	public WebExplorer(IModem modem) {
		super();
		this.modem = modem;
	}
	
	public void navigate(String webAddress,String question){
		
		modem.sendMessage(question, webAddress);
		
		String answer=modem.receiveAMessage(webAddress); 
		
		if(answer!=null){
			System.out.println(webAddress+" says:"+answer);
		}else{
			System.out.println(" ERROR: Target does not answer! ");
		}
	}
}
