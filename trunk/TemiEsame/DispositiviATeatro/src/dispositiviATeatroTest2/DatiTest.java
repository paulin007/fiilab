package dispositiviATeatroTest2;

import java.util.ArrayList;
import java.util.HashMap;

import dispositiviATeatro.Battuta;
import dispositiviATeatro.Cast;
import dispositiviATeatro.Scena;


/**
 * Una classe Dati contenente le informazioni relative ad una scena.
 * 
 * @author Alessandro Martinelli
 */
public class DatiTest {

	public static Scena testScena = new Scena();
	public static ArrayList<String> personaggiPrincipali = new ArrayList<String>();
	public static ArrayList<Battuta> battute = new ArrayList<Battuta>();
	public static Cast cast;
	private static int posizione = 0;

	public static void preparaDati() {

		personaggiPrincipali.add("Coccodrillo");
		personaggiPrincipali.add("OrangoTango");
		personaggiPrincipali.add("AquilaReale");
		personaggiPrincipali.add("Gatto");
		personaggiPrincipali.add("Elefante");

		battute.add(new Battuta("Coccodrillo", "Dov'è l'arca?"));
		battute.add(new Battuta("OrangoTango", "Laggiù"));
		battute.add(new Battuta("Coccodrillo", "oh, sì. Vedo. Ci siamo tutti?"));
		battute.add(new Battuta("SerpentieRoditori",
				"(vari rumuri indistinti e agitazione)"));
		battute.add(new Battuta("OrangoTango", "Io credo di sì"));
		battute.add(new Battuta("AquilaReale", "Fermi tutti"));
		battute.add(new Battuta("Coccodrillo", "(Si volta) Sì, pennuto?"));
		battute.add(new Battuta("AquilaReale", "Mancano i Leocorni"));
		battute.add(new Battuta("AquilaReale",
				"(Dopo una pausa) Dovremmo dirlo al capo"));
		battute.add(new Battuta("OrangoTango",
				"Saranno andati ad imboscarsi...come al solito."));
		battute.add(new Battuta("SerpentieRoditori",
				"(vari rumuri indistinti e agitazione)"));
		battute.add(new Battuta("AquilaReale", "Perderanno l'arca"));
		battute.add(new Battuta("Gatto", "Bene, lasciamoli qui. Non ci servono"));
		battute.add(new Battuta("AltriAnimali", "(In coro)L'arca!"));
		battute.add(new Battuta("AquilaReale",
				" (Dopo un breve volo) Ci fanno segno di salire"));
		battute.add(new Battuta("Elefante", " Andiamo dai, io sono lento"));
		battute.add(new Battuta("Gatto",
				"Lasciamo qui i Leocorni. Non ci servono."));
		battute.add(new Battuta("AquilaReale", " Va bene è deciso "));
		battute.add(new Battuta("Coccodrillo", " In marcia. "));
		battute.add(new Battuta("SerpentieRoditori",
				"(vari rumuri indistinti e agitazione)"));
		battute.add(new Battuta("OrangoTango",
				"(Rivolto al Coccodrillo) Hei, amico, c'è qualcosa che non torna.."));
		battute.add(new Battuta("Coccodrillo", "Sarebbe?"));
		battute.add(new Battuta("OrangoTango",
				"Non dovevamo insceneggiare il Sogno di una Notte di Mezza Estate"));
		battute.add(new Battuta("Coccodrillo", "Oh, sì. Vero."));

		testScena.setBattute(battute);
		testScena.setPersonaggiPrincipali(personaggiPrincipali);

		HashMap<String, String> prsPrincipali = new HashMap<String, String>();
		HashMap<String, String> comparse = new HashMap<String, String>();

		prsPrincipali.put("Coccodrillo", "M.Rossi");
		prsPrincipali.put("OrangoTango", "L.Neri");
		prsPrincipali.put("AquilaReale", "F.Bianchi");
		prsPrincipali.put("Gatto", "M.Larghi");
		prsPrincipali.put("Elefante", "E.Stretti");

		comparse.put("SerpentieRoditori", "F.lli DelColle");
		comparse.put("AltriAnimali", "Gr. DalMonte");

		cast = new Cast(prsPrincipali, comparse);
	}
	
	public static String[] personaggi() {
		ArrayList<String> prs = personaggiPrincipali;
		return prs.toArray(new String[prs.size()]);
	}

	public static int getPosizione() {
		return posizione;
	}

	public static void setPosizione(int posizione) {
		DatiTest.posizione = posizione;
	}

}
