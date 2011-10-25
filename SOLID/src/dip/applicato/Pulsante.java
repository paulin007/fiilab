package dip.applicato;

public class Pulsante implements IPulsante {
	
	private IPulsanteCLient lampada;
	private boolean accesa=false;
	
	public Pulsante(IPulsanteCLient lampada) {
		super();
		this.lampada = lampada;
	}

	/* (non-Javadoc)
	 * @see dip.applicato.IPulsante#schiaccia()
	 */
	@Override
	public void schiaccia(){
		if(accesa){
			lampada.spegni();
		}else{
			lampada.accendi();
		}
		accesa=!accesa;
	}
}
