package builder;

import java.util.List;

public class Director {

	private Builder builder;
	
	public Director(Builder builder) {
		super();
		this.builder = builder;
	}

	public ElaboratedData generateInformations(List<Data> data){
		
		//The Director controls the instance-building algorithm
		builder.startWritingDataOnString();
		
		for (Data data2 : data) {
			builder.writeData(data2);
		}
		
		builder.endWritingData();
		
		return builder.getElaboratedData();
	}

}