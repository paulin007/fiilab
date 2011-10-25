package dip.applicato;

public class Lampada implements IPulsanteCLient  {

	//Una lampada è sempre composta da un pulsante
	private IPulsante pulsante;
	
	public Lampada(IPulsante pulsante) {
		super();
		this.pulsante = pulsante;
	}
	
	public void schiacciaPulsante() {
		pulsante.schiaccia();
	}

	/* (non-Javadoc)
	 * @see dip.applicato.IPulsanteCLient#accendi()
	 */
	@Override
	public void accendi(){
		System.out.println("Mi accendo!");
	}
	
	/* (non-Javadoc)
	 * @see dip.applicato.IPulsanteCLient#spegni()
	 */
	@Override
	public void spegni(){
		System.out.println("Mi spengo!");
	}
}
