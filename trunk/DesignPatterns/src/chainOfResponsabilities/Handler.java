package chainOfResponsabilities;

public abstract class Handler {

	private Handler handler=null;
	
	public boolean handle(String message){
		if(executeRequest(message)){
			return true;
		}else if(handler!=null){
			return handler.handle(message);
		}
		return false;
	}
	
	public void setHandler(Handler handler) {
		this.handler = handler;
	}
	
	public abstract boolean executeRequest(String message);
}
