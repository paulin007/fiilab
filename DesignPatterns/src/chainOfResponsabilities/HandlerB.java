package chainOfResponsabilities;

public class HandlerB extends Handler{

	@Override
	public boolean executeRequest(String message) {
		if(message.equalsIgnoreCase("B")){
			System.out.println("Yes, i can handle B :) ");
			return true;
		}
		return false;
	}
}
