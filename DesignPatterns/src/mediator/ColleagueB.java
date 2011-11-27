package mediator;

public class ColleagueB implements IColleagueType1{

	private boolean state;
	private IMyMediator mediator;
	
	public ColleagueB(boolean state, IMyMediator mediator) {
		super();
		this.state = state;
		this.mediator = mediator;
	}

	public void changeSystemState(){
		if(state){
			System.out.println("Changing to STATE1");
			mediator.changeState(MyMediatorState.STATE1);
		}else{
			System.out.println("Changing to STATE2");
			mediator.changeState(MyMediatorState.STATE2);
		}
		state=!state;
	}
	
	@Override
	public void onEventType1(String message) {
		System.out.println("(B) Getting message type 1:"+message);
	}
}
