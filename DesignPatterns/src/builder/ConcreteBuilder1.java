package builder;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ConcreteBuilder1 implements Builder{

	private List<Data> data=new LinkedList<Data>();
	
	private static class DataComparator implements Comparator<Data>{
		@Override
		public int compare(Data data0, Data data1) {
			return data0.getData().compareTo(data1.getData());
		}
	}
	
	private static DataComparator referenceComparator=new DataComparator();
	
	@Override
	public void startWritingDataOnString() {
		data.clear();
	}

	@Override
	public void writeData(Data data) {
		this.data.add(data);
	}
	
	@Override
	public void endWritingData() {
		Collections.sort(data, referenceComparator);
	}
	
	@Override
	public ElaboratedData getElaboratedData() {
		ElaboratedData elaboratedData=new ElaboratedData();
		elaboratedData.getDataStrings().add("The following Data has been ordered:");
		for (Data data : this.data) {
			elaboratedData.getDataStrings().add(data.getData());
		}
		return elaboratedData;
	}
	
}
