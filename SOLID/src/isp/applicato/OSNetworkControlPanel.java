package isp.applicato;

public class OSNetworkControlPanel {

	private INetworkConnector connector;
	
	public OSNetworkControlPanel(INetworkConnector connector) {
		super();
		this.connector = connector;
	}

	public void enabledConnection(){
		connector.connect();
	}
	
	public void disableConnection(){
		connector.disconnect();
	}
}
