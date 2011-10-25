package lsp.corretto;

public abstract class RettangoloAstratto implements Forma{

	protected float h;
	protected float w;

	public abstract float getArea();

	public float getW() {
		return w;
	}

	public float getH() {
		return h;
	}

}