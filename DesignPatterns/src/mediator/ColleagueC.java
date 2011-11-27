package mediator;

public class ColleagueC {

	private String name;
	private IMyMediator mediator;
	
	public ColleagueC(String name, IMyMediator mediator) {
		super();
		this.name = name;
		this.mediator = mediator;
	}

	public void describeYourSelf(){
		mediator.sendMessage("Hello, I'm "+name);
	}
	
}
