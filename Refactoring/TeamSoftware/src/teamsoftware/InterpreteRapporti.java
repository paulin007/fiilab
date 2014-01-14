package teamsoftware;

public interface InterpreteRapporti {

	public abstract Log creaLogDaRapportoCompleto(String rapporto);

	public abstract String creaRapportoSinteticoDaLog(Log log);

	public abstract Log creaLogDaRapportoSintetico(String string);

}