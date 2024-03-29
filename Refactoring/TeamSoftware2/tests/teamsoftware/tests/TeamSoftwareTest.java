package teamsoftware.tests;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

import teamsoftware.GeneratoreDiRapportiSintetici;
import teamsoftware.LogFormat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TeamSoftwareTest {

	@Test
	public void test01(){
		
		ArrayList<String> rapportoCompleto=new ArrayList<String>();
		
		Collections.addAll(rapportoCompleto,
				"Giuseppe Verdi 4 Testing 01-03-2014",
				"Ferico Rossi 4 Documentation 01-03-2014",
				"Mario Bianchi 4 Development 01-03-2014",
				"Giuseppe Verdi 8 Testing 02-03-2014",
				"Ferico Rossi 8 Documentation 02-03-2014",
				"Mario Bianchi 8 Development 02-03-2014"
		);
		
		ArrayList<String> rapportoVerifica=new ArrayList<String>();
		
		Collections.addAll(rapportoVerifica,
				"Giuseppe Verdi 12 Testing 12",
				"Ferico Rossi 12 Documentation 12",
				"Mario Bianchi 12 Development 12"
		);
		
		GeneratoreDiRapportiSintetici generatore=
			new GeneratoreDiRapportiSintetici(new LogFormat());
		
		ArrayList<String> risultato=generatore.
			generaRapportSintetico(rapportoCompleto);
		
		assertEquals(risultato.size(),rapportoVerifica.size());
	
		for (int i = 0; i < risultato.size(); i++) {
			if(!risultato.get(i).equalsIgnoreCase(
					rapportoVerifica.get(i))){
				fail("Test Fallito su "+rapportoVerifica.get(i));
			}
		}
	}
	

	@Test
	public void test02(){
		
		ArrayList<String> rapportoCompleto=new ArrayList<String>();
		
		Collections.addAll(rapportoCompleto,
				"Giuseppe Verdi 4 Testing 01-03-2014",
				"Ferico Rossi 4 Documentation 01-03-2014",
				"Mario Bianchi 4 Development 01-03-2014",
				"Giuseppe Verdi 8 Testing 02-03-2014",
				"Ferico Rossi 8 Documentation 02-03-2014",
				"Mario Bianchi 8 Development 02-03-2014",
				"Giuseppe Verdi 4 Meeting 03-03-2014",
				"Ferico Rossi 4 Meeting 03-03-2014",
				"Mario Bianchi 4 Meeting 03-03-2014"
		);
		
		ArrayList<String> rapportoVerifica=new ArrayList<String>();
		
		Collections.addAll(rapportoVerifica,
				"Giuseppe Verdi 16 Testing 12",
				"Ferico Rossi 16 Documentation 12",
				"Mario Bianchi 16 Development 12"
		);
		
		GeneratoreDiRapportiSintetici generatore=
			new GeneratoreDiRapportiSintetici(new LogFormat());
		
		ArrayList<String> risultato=generatore.
			generaRapportSintetico(rapportoCompleto);
		
//		for (String string : risultato) {
//			System.out.println(string);
//		}
		
		assertEquals(risultato.size(),rapportoVerifica.size());
	
		for (int i = 0; i < risultato.size(); i++) {
			if(!risultato.get(i).equalsIgnoreCase(
					rapportoVerifica.get(i))){
				fail("Test Fallito su "+rapportoVerifica.get(i));
			}
		}
	}
}
