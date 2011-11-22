package lsp.sbagliato;

public class Quadrato extends Rettangolo{

	public Quadrato(float l) {
		super(l, l);
	}
	
	public void setL(float l){
		super.setW(l);
		super.setH(l);
	}
	
	@Override
	public void setW(float w) {
		setL(w);
	}
	
	@Override
	public void setH(float h) {
		setL(h);
	}
	
}
