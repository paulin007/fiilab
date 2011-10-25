package ocp.applicato;

public class Client {
	private AbstractServer server;
	
	public Client(AbstractServer server) {
		super();
		this.server = server;
	}

	public void invoke(){
		System.out.println(server.getMessage());
	}
}
