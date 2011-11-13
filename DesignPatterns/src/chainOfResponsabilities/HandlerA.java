package chainOfResponsabilities;

public class HandlerA extends Handler{

	@Override
	public boolean executeRequest(String message) {
		if(message.equalsIgnoreCase("A")){
			System.out.println("Yes, i can handle A :) ");
			return true;
		}
		return false;
	}
}
