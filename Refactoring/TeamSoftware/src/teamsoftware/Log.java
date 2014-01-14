package teamsoftware;

public class Log {

	private String nome;
	private String cognome;
	private String ore;
	private String compito;
	
	public Log(String nome, String cognome, String ore, String compito) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.ore = ore;
		this.compito = compito;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getOre() {
		return ore;
	}

	public void setOre(String ore) {
		this.ore = ore;
	}

	public String getCompito() {
		return compito;
	}

	public void setCompito(String compito) {
		this.compito = compito;
	}
	
	
}
