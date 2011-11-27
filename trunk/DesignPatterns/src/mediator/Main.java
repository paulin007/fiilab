package mediator;

public class Main {

	public static void main(String[] args) {
		
		//Setup
		MyMediator mediator=new MyMediator();
		ColleagueA colleagueA=new ColleagueA();
		ColleagueB colleagueB=new ColleagueB(true, mediator);
		ColleagueC colleagueC1=new ColleagueC("Pippo", mediator);
		ColleagueC colleagueC2=new ColleagueC("Pluto", mediator);
		mediator.addCollegueType1(colleagueB);
		mediator.addCollegueType1(colleagueA);
		mediator.addCollegueType2(colleagueA);
		
		//Not using MyMediator methods any more!
		//Phase 1
		colleagueB.changeSystemState();
		colleagueC1.describeYourSelf();
		colleagueC2.describeYourSelf();
		//Phase 2
		colleagueB.changeSystemState();
		colleagueC1.describeYourSelf();
		colleagueC2.describeYourSelf();
	}
}
