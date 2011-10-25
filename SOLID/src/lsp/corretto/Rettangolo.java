package lsp.corretto;


public class Rettangolo extends RettangoloAstratto {

	public Rettangolo(float w, float h) {
		super();
		this.w = w;
		this.h = h;
	}
	
	@Override
	public float getArea(){
		return w*h;
	}

	public void setW(float w) {
		this.w = w;
	}

	public void setH(float h) {
		this.h = h;
	}
	
}
