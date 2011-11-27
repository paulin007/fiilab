package mediator;

public class ColleagueA implements IColleagueType1, IColleagueType2{

	@Override
	public void onEventType1(String message) {
		System.out.println("(A) Getting message type 1:"+message);
	}
	
	@Override
	public void onEventType2(String message) {
		System.out.println("(A) Getting message type 2:"+message);
	}
	
}
