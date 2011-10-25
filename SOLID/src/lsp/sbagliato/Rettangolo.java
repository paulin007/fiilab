package lsp.sbagliato;


public class Rettangolo implements Forma{

	private float w,h;
	
	public Rettangolo(float w, float h) {
		super();
		this.w = w;
		this.h = h;
	}
	
	public float getArea(){
		return w*h;
	}

	public float getW() {
		return w;
	}

	public void setW(float w) {
		this.w = w;
	}

	public float getH() {
		return h;
	}

	public void setH(float h) {
		this.h = h;
	}
	
}
