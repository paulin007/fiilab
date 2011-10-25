package srp.applicato;


public class Rettangolo {

	private int w,h;
	
	public Rettangolo(int w, int h) {
		super();
		this.w = w;
		this.h = h;
	}
	
	public float getArea(){
		return w*h;
	}

	public int getW() {
		return w;
	}

	public int getH() {
		return h;
	}
	
	
}
