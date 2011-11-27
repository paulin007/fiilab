package mediator;

/**
 * An interface for all the Colleagues which needs to
 * be get a feedback when a message of type2 reaches 
 * the Mediator
 * 
 *  (we are using DIP 
 * to decouple MyMediator from Colleagues)
 * 
 * @author Alessandro Martinelli
 */
public interface IColleagueType2 {
	public void onEventType2(String message);
}