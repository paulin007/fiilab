package isp.applicato;

public class WebExplorer {

	private IWebConnection connection;

	public WebExplorer(IWebConnection connection) {
		super();
		this.connection = connection;
	}
	
	public void navigate(String webAddress,String question){
		
		connection.sendMessage(question, webAddress);
		
		String answer=connection.receiveAMessage(webAddress); 
		
		if(answer!=null){
			System.out.println(webAddress+" says:"+answer);
		}else{
			System.out.println(" ERROR: Target does not answer! ");
		}
	}
}
