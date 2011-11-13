package command;

public class Invoker {

	private boolean active=false;
	private Command command;
	
	public Invoker(Command command) {
		super();
		this.command = command;
	}

	public Invoker(boolean active, Command command) {
		super();
		this.active = active;
		this.command = command;
	}

	public void invokeCommand(){
		if(active){
			command.execute();
		}
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
}
