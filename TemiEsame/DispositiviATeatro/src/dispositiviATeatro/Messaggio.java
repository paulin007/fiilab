package dispositiviATeatro;

/**
 * Un messaggio mandato o da mandare ad uno dei dispositivi Visualizzatori Ha un
 * colore ed una stringa di testo
 * 
 * @author Alessandro Martinelli
 */
public class Messaggio {

	public enum ColoreMessaggio {
		GRIGIO, ROSSO, BLU, VERDE, GIALLO, ARANCIONE, VIOLA, ROSA, MARRONE, OCRA, DEFAULT
	}

	private ColoreMessaggio colore;
	private String testo;

	public Messaggio(ColoreMessaggio colore, String testo) {
		super();
		this.colore = colore;
		this.testo = testo;
	}

	public ColoreMessaggio getColore() {
		return colore;
	}

	public void setColore(ColoreMessaggio colore) {
		this.colore = colore;
	}

	public String getTesto() {
		return testo;
	}

	public void setTesto(String testo) {
		this.testo = testo;
	}
}
