package dip.sbagliato;

public class Lampada {

	//Una lampada è sempre composta da un pulsante
	private Pulsante pulsante;
	
	public Lampada(Pulsante pulsante) {
		super();
		this.pulsante = pulsante;
	}
	
	public void schiacciaPulsante() {
		pulsante.schiaccia();
	}

	public void accendi(){
		System.out.println("Mi accendo!");
	}
	
	public void spegni(){
		System.out.println("Mi spengo!");
	}
}
