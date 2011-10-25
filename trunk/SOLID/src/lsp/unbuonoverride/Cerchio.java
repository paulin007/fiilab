package lsp.unbuonoverride;

public class Cerchio {

	private float x,y;
	private float diametro;
	
	public Cerchio(float x, float y, float diametro) {
		super();
		this.x = x;
		this.y = y;
		this.diametro = diametro;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public float getDiametro() {
		return diametro;
	}
	public void setDiametro(float diametro) {
		this.diametro = diametro;
	}
	
	public float getRaggio(){
		return 0.5f*diametro;
	}
}
