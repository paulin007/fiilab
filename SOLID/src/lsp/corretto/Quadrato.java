package lsp.corretto;

public class Quadrato extends RettangoloAstratto{

	private float l;
	
	public Quadrato(float l) {
		setL(l);
	}
	
	@Override
	public float getArea() {
		return l*l;
	}
	
	public void setL(float l){
		this.w=l;
		this.h=l;
	}
	
}
