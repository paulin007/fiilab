package dip.applicato;

public class Pulsante implements IPulsante {
	
	private IPulsanteCLient pulsanteClient;
	private boolean accesa=false;
	
	public Pulsante(IPulsanteCLient pulsanteClient) {
		super();
		this.pulsanteClient = pulsanteClient;
	}

	/* (non-Javadoc)
	 * @see dip.applicato.IPulsante#schiaccia()
	 */
	@Override
	public void schiaccia(){
		if(accesa){
			pulsanteClient.spegni();
		}else{
			pulsanteClient.accendi();
		}
		accesa=!accesa;
	}
}
