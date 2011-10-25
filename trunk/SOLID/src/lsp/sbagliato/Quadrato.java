package lsp.sbagliato;

public class Quadrato extends Rettangolo{

	public Quadrato(float l) {
		super(l, l);
	}
	
	public void setL(float l){
		setW(l);
		setH(l);
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
