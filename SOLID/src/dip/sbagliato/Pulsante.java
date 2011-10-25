package dip.sbagliato;

public class Pulsante {
	
	private Lampada lampada;
	private boolean accesa=false;
	
	public Pulsante(Lampada lampada) {
		super();
		this.lampada = lampada;
	}

	public void schiaccia(){
		if(accesa){
			lampada.spegni();
		}else{
			lampada.accendi();
		}
		accesa=!accesa;
	}
}
