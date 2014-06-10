package dispositiviATeatroTest;

/**
 * Un dispositivo Visualizzatore che visualizza i dati per un solo personaggio
 * 
 * @author Alessandro Martinelli
 */
public class TabletPanel extends VisualizzazionePanel {

	private static final long serialVersionUID = 0;

	private String personaggio;

	public TabletPanel(String personaggio) {
		super();
		this.personaggio = personaggio;
	}

	@Override
	public String[] personaggi() {
		String[] prs = { personaggio };
		return prs;
	}

	public String getPersonaggio() {
		return personaggio;
	}

	public void setPersonaggio(String personaggio) {
		this.personaggio = personaggio;
	}
}
