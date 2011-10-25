package isp.applicato;

public interface INetworkConnector {
	/**
	 * connect to the Modem
	 */
	public boolean connect();
	/**
	 * disconnect from the Modem
	 */
	public boolean disconnect();
}
