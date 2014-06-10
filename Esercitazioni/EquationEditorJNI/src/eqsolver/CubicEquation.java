package eqsolver;

public class CubicEquation extends Equation {

	public CubicEquation() {
		super(4);
	}
	
	public String getFormula(){
		return "ax^3 + bx^2 + cx + d = 0";
	}
	
	@Override
	public String toString() {
		return getParameter(0)+"x^3 +"+getParameter(1)+"x^2 "+getParameter(2)+"x +"+getParameter(3)+" = 0";
	}
	
}
