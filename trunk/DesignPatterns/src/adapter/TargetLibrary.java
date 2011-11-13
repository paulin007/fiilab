package adapter;

public class TargetLibrary {

	private TargetInterface target;
	private boolean whatShouldIDo = true;

	public TargetLibrary(TargetInterface target) {
		super();
		this.target = target;
	}

	public void execute() {
		if (whatShouldIDo) {
			target.doSomething();
		} else {
			target.doTheOtherThing();
		}
	}

	public boolean isWhatShouldIDo() {
		return whatShouldIDo;
	}

	public void setWhatShouldIDo(boolean whatShouldIDo) {
		this.whatShouldIDo = whatShouldIDo;
	}

}
