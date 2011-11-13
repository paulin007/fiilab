package builder;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ConcreteBuilder2 implements Builder{

	private List<Data> data=new LinkedList<Data>();

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
		Collections.shuffle(data);
	}
	
	@Override
	public ElaboratedData getElaboratedData() {
		ElaboratedData elaboratedData=new ElaboratedData();
		elaboratedData.getDataStrings().add("The following Data has been shuffled:");
		for (Data data : this.data) {
			elaboratedData.getDataStrings().add(data.getData());
		}
		return elaboratedData;
	}
	
}
