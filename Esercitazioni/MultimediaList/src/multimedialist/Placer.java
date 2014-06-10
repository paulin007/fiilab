package multimedialist;

public class Placer implements IPlacer {
	
	public static final int VERTICAL=0;
	public static final int DIAGONAL=1;
	
	private int positioning;
	
	private VerticalPlacer verticalPlacer=
		new VerticalPlacer();
	
	private DiagonalPlacer diagonalPlacer=
		new DiagonalPlacer();
	
	/* (non-Javadoc)
	 * @see multimedialist.IPlacer#place(int, int, int[])
	 */
	@Override
	public void place(int i,int index, int[] xy) {
		if(positioning==VERTICAL){
			verticalPlacer.place(i, index, xy);	
		}else if(positioning==DIAGONAL){
			diagonalPlacer.place(i, index, xy);
		}
	}
	
	public void setPositioning(int positioning) {
		this.positioning = positioning;
	}
}
