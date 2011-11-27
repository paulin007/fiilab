package mediator;

import java.util.LinkedList;
import java.util.List;

/**
 * The Mediator Class mediates between the Colleagues.
 * It must keep all the logic used to switch message between them.
 * It decouples all the collegues between them. 
 * 
 * @author Alessandro Martinelli
 */
public class MyMediator implements IMyMediator {
	
	private List<IColleagueType1> colleagues1=new LinkedList<IColleagueType1>();
	private List<IColleagueType2> colleagues2=new LinkedList<IColleagueType2>();
	private MyMediatorState state=MyMediatorState.STATE1;
	
	public void addCollegueType1(IColleagueType1 colleague){
		colleagues1.add(colleague);
	}
	
	public void addCollegueType2(IColleagueType2 colleague){
		colleagues2.add(colleague);
	}
	
	/* (non-Javadoc)
	 * @see mediator.IMyMediator#changeState(mediator.Mediator.MediatorState)
	 */
	@Override
	public void changeState(MyMediatorState state){
		this.state=state;
	}
	
	/* (non-Javadoc)
	 * @see mediator.IMyMediator#sendMessage(java.lang.String)
	 */
	@Override
	public void sendMessage(String message){
		if(state==MyMediatorState.STATE1){
			for (IColleagueType1 colleague : colleagues1) {
				colleague.onEventType1(message);
			}
		}else{
			for (IColleagueType2 colleague : colleagues2) {
				colleague.onEventType2(message);
			}
		}
	}
}
