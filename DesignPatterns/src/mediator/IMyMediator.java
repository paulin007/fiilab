package mediator;

/**
 * An interface for MyMediator (we are using DIP 
 * to decouple MyMediator from Colleagues)
 * 
 * @author Alessandro Martinelli
 */
public interface IMyMediator {

	/**
	 * Change the State of MyMediator. Depending on the 
	 * state, MyMediator will behave differently
	 * @param state
	 */
	public abstract void changeState(MyMediatorState state);

	/**
	 * Send a message to MyMediator
	 * @param message
	 */
	public abstract void sendMessage(String message);

}