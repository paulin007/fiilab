package scarpe;


public class Scarpe {
	
	public static void main(String[] args) {

		final ScarpeModel model=new ScarpeModel();
		final GestoreFile gestore=new GestoreFile(model);
		
		gestore.inizializzaFile();
		
		(new ScarpeUI()).generaUI(model);
	}
}
