package builder;

public interface Builder {
	
	public void startWritingDataOnString();

	public void writeData(Data data);

	public void endWritingData();

	public ElaboratedData getElaboratedData();
}
