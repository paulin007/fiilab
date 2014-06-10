package multimedialist;

public class DiagonalPlacer {

	private int diagonalX=100;
	private int diagonalY=100;
	private int diagonalDeltaX=10;
	private int diagonalDeltaY=20;

	public void place(int i, int index, int[] xy) {
		xy[0]=diagonalX+diagonalDeltaX*(i-index);
		xy[1]=diagonalY+diagonalDeltaY*(i-index);
	}

}
