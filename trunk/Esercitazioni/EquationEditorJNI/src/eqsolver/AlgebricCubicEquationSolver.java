package eqsolver;

public class AlgebricCubicEquationSolver implements Solver{

	static{
		System.loadLibrary("example");
	}
	
	@Override
	public double[] solveEquation(double[] parameters) throws EquationException {
		double[] radici = new double[3];
		double a=parameters[0];
		double b=parameters[1];
		double c=parameters[2];
		double d=parameters[3];
		int size=solve(radici,a,b,c,d);
		double[] risultati=new double[size];
		for (int i = 0; i < size; i++) {
			risultati[i]=radici[i];
		}
		return risultati;
	}
	
	private native int solve(double[] results,double a,double b,double c,double d);
	
}
