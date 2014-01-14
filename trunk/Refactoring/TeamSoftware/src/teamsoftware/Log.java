package teamsoftware;

public class Log {

	private String nome;
	private String cognome;
	private int ore;
	private String compito;
	
	public Log(String nome, String cognome, String ore, String compito) {
		super();
		setNome(cognome);
		setCognome(cognome);
		setOre(ore);
		setCompito(compito);
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
		return ore+"";
	}

	public void setOre(String ore) {
		this.ore = Integer.parseInt(ore);
	}

	public String getCompito() {
		return compito;
	}

	public void setCompito(String compito) {
		this.compito = compito;
	}

	boolean stessiDati(Log log2) {
		boolean stessiDati =  
			getNome().equalsIgnoreCase(log2.getNome()) &&
			getCognome().equalsIgnoreCase(log2.getCognome()) &&
			getCompito().equalsIgnoreCase(log2.getCompito());
		return stessiDati;
	}

	int sommaOre(Log log2) {
		return ore+log2.ore;
	}
	
	
}
