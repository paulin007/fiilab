package isp.sbagliato;

public interface IModem {
	/**
	 * connect to the Modem
	 */
	public boolean connect();
	/**
	 * disconnect from the Modem
	 */
	public boolean disconnect();
	/**
	 * send a message using the modem
	 * @param message The message to be sent
	 * @param target The name of the network element which the message should be send to.
	 */
	public void sendMessage(String message,String target);
	/**
	 * try to receive a message from a network element
	 * @param target The name of the network element which the message should be received from.
	 * @return the received message or null if not message is available from that target.
	 */
	public String receiveAMessage(String target);
}
