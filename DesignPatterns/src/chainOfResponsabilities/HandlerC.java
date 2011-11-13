package chainOfResponsabilities;

public class HandlerC extends Handler{

	@Override
	public boolean executeRequest(String message) {
		if(message.equalsIgnoreCase("C")){
			System.out.println("Yes, i can handle C :) ");
			return true;
		}
		return false;
	}
}
