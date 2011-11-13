package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

	private List<Component> components=new ArrayList<Component>();
	
	@Override
	public void add(Component c) {
		components.add(c);
	}
	@Override
	public Component getChild(int index) {
		return components.get(index);
	}
	
	@Override
	public void remove(Component c) {
		components.remove(c);
	}
	
	@Override
	public int size() {
		return components.size();
	}
}
