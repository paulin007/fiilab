package dispositiviATeatro;

/**
 * Una battuta, che definisce il
 * 
 * @author Alessandro
 */
public class Battuta {

	private String nomePersonaggio;
	private String battuta;

	public Battuta(String nomePersonaggio, String battuta) {
		super();
		this.nomePersonaggio = nomePersonaggio;
		this.battuta = battuta;
	}

	public String getNomePersonaggio() {
		return nomePersonaggio;
	}

	public void setNomePersonaggio(String nomePersonaggio) {
		this.nomePersonaggio = nomePersonaggio;
	}

	public String getBattuta() {
		return battuta;
	}

	public void setBattuta(String battuta) {
		this.battuta = battuta;
	}

}