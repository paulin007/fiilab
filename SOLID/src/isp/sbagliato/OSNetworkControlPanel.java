package isp.sbagliato;

public class OSNetworkControlPanel {

	private IModem modem;
	
	public OSNetworkControlPanel(IModem modem) {
		super();
		this.modem = modem;
	}

	public void enabledConnection(){
		modem.connect();
	}
	
	public void disableConnection(){
		modem.disconnect();
	}
}
