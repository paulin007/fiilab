package composite;

public interface Component {

	public void add(Component c);

	public void remove(Component c);
	
	public int size();
	
	public Component getChild(int index);

}
