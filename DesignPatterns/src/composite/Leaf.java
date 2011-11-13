package composite;

public class Leaf implements Component{

	@Override
	public void add(Component c) {
		//Do nothing
		//Sorry ISP :(
	}
	
	@Override
	public Component getChild(int index) {
		return null;
		//Sorry ISP :(
	}
	
	@Override
	public void remove(Component c) {
		//Do nothing
		//Sorry ISP :(
	}
	
	@Override
	public int size() {
		return 0;//This is ok :)
	}
	
	public Leaf() {
	
		// TODO Auto-generated constructor stub
	}
}
