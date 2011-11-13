package builder;

import java.util.ArrayList;
import java.util.List;

public class ElaboratedData {
	private List<String> dataStrings=new ArrayList<String>();

	public List<String> getDataStrings() {
		return dataStrings;
	}

	@Override
	public String toString() {
		String tmp="";
		for (String data : dataStrings) {
			tmp+=data+" \n";
		}
		return tmp;
	}
}
