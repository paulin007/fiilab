package multimedialist;

public class VerticalPlacer {

	private int verticalX=100;
	private int verticalY=100;
	private int verticalDeltaY=20;
	
	public void place(int i, int index, int[] xy) {
		xy[0]=verticalX;
		xy[1]=verticalY+verticalDeltaY*(i-index);
	}
}
