package teamsoftware;

/**
 * Un Log dei Rapporti
 * 
 * @author Alessandro
 */
public class Log {

	private String nome;
	private String cognome;
	private int ore;
	private String compito;
	
	public Log(String nome, String cognome, String ore, String compito) {
		super();
		setNome(nome);
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

	/**
	 * Verifica che tutti i parametri abbiano gli stessi valori, escluso il numero delle ore.
	 * @param log2 un altro log
	 * @return true, se nome, cognome e compito coincidono. 
	 */
	public boolean stessiDati(Log log2) {
		boolean stessiDati =  
			getNome().equalsIgnoreCase(log2.getNome()) &&
			getCognome().equalsIgnoreCase(log2.getCognome()) &&
			getCompito().equalsIgnoreCase(log2.getCompito());
		return stessiDati;
	}

	/**
	 * Calcola la somma delle ore di questo log con quelle di un altro log
	 * @param log2 un altro log
	 * @return la somma
	 */
	public int sommaOre(Log log2) {
		return ore+log2.ore;
	}
	
	
}
