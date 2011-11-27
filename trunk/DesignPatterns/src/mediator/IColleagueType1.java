package mediator;

/**
 * An interface for all the Colleagues which needs to
 * be get a feedback when a message of type1 reaches 
 * the Mediator
 * 
 *  (we are using DIP 
 * to decouple MyMediator from Colleagues)
 * 
 * @author Alessandro Martinelli
 */
public interface IColleagueType1 {
	public void onEventType1(String message);
}