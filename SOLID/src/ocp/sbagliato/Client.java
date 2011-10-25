package ocp.sbagliato;

public class Client {
	private Server server;
	
	public Client(Server server) {
		super();
		this.server = server;
	}

	public void invoke(){
		System.out.println(server.getMessage());
	}
}
