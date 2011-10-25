package lsp.unbuonoverride;

import java.awt.Graphics;

public class CerchioDisegnabile extends Cerchio implements Disegnabile{

	public CerchioDisegnabile(float x, float y, float diametro) {
		super(x, y, diametro);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void disegna(Graphics graphics) {
		// TODO Auto-generated method stub
	}
	
	public void update(){
		//TODO: aggiorna la grafica
	}
	
	@Override
	public void setX(float x) {
		super.setX(x);
		update();
	}
	
	@Override
	public void setY(float y) {
		super.setY(y);
		update();
	}
}
