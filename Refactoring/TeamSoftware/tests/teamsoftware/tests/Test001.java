package teamsoftware.tests;

import static org.junit.Assert.fail;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

import teamsoftware.GeneratoreDiRapportiSintetici;

public class Test001{

	@Test
	public void test01(){
		
		ArrayList<String> rapportoSintentico=new ArrayList<String>();
		
		Collections.addAll(rapportoSintentico,
			"Giuseppe Verdi 4 Testing 01-03-2014",
			"Federico Rossi 4 Documentation 01-03-2014",
			"Mario Bianchi 4 Development 01-03-2014",
			"Giuseppe Verdi 8 Testing 02-03-2014",
			"Federico Rossi 8 Documentation 02-03-2014",
			"Mario Bianchi 8 Development 02-03-2014"
		);
		
		GeneratoreDiRapportiSintetici generatore=
			new GeneratoreDiRapportiSintetici(
					new InterpreteRapportiDiTest());
		
		ArrayList<String> risultato=generatore.
			generaRapportoSintetico(rapportoSintentico);
		
		ArrayList<String> rapportoVerifica=new ArrayList<String>();
		
		Collections.addAll(rapportoVerifica,
			"Giuseppe Verdi 12 Testing 12",
			"Federico Rossi 12 Documentation 12",
			"Mario Bianchi 12 Development 12"
		);
		
		assertEquals(risultato.size(), rapportoVerifica.size());
		
		Collections.sort(risultato);
		Collections.sort(rapportoVerifica);
		
		for (int i = 0; i < risultato.size(); i++) {
			if(!(risultato.get(i).
					equalsIgnoreCase(rapportoVerifica.get(i)))){
				fail("Test Fallito su "+rapportoVerifica.get(i));
			}
		}
		
		//fail("Test Fallito");
	}
	
	

	@Test
	public void test02(){
		
		ArrayList<String> rapportoSintentico=new ArrayList<String>();
		
		Collections.addAll(rapportoSintentico,
			"Giuseppe Verdi 4 Testing 01-03-2014",
			"Giuseppe Verdi 4 Meating 01-03-2014",
			"Federico Rossi 4 Documentation 01-03-2014",
			"Federico Rossi 4 Meating 01-03-2014",
			"Mario Bianchi 4 Development 01-03-2014",
			"Mario Bianchi 4 Meating 01-03-2014",
			"Giuseppe Verdi 8 Testing 02-03-2014",
			"Federico Rossi 8 Documentation 02-03-2014",
			"Mario Bianchi 8 Development 02-03-2014",
			"Giuseppe Verdi 8 Testing 03-03-2014",
			"Federico Rossi 8 Development 03-03-2014",
			"Mario Bianchi 8 Documentation 03-03-2014"
		);
		
		GeneratoreDiRapportiSintetici generatore=
			new GeneratoreDiRapportiSintetici(
					new InterpreteRapportiDiTest());
		
		ArrayList<String> risultato=generatore.
			generaRapportoSintetico(rapportoSintentico);
		
		ArrayList<String> rapportoVerifica=new ArrayList<String>();
		
		Collections.addAll(rapportoVerifica,
			"Giuseppe Verdi 24 Testing 20",
			"Federico Rossi 24 Documentation 12",
			"Mario Bianchi 24 Development 12"

		);
		
		assertEquals(risultato.size(), rapportoVerifica.size());
		
		Collections.sort(risultato);
		Collections.sort(rapportoVerifica);
		
		for (int i = 0; i < risultato.size(); i++) {
			if(!(risultato.get(i).
					equalsIgnoreCase(rapportoVerifica.get(i)))){
				fail("Test Fallito su "+rapportoVerifica.get(i));
			}
		}
		
		//fail("Test Fallito");
	}
	

	@Test
	public void test03(){
		
		ArrayList<String> rapportoSintentico=new ArrayList<String>();
		
		Collections.addAll(rapportoSintentico,
			"Giuseppe Verdi 4 Testing 01-03-2014",
			"Giuseppe Verdi 4 Meating 01-03-2014",
			"Federico Rossi 4 Documentation 01-03-2014",
			"Federico Rossi 4 Meating 01-03-2014",
			"Mario Bianchi 4 Development 01-03-2014",
			"Mario Bianchi 4 Meating 01-03-2014",
			"Giuseppe Verdi 8 Testing 02-03-2014",
			"Federico Rossi 8 Documentation 02-03-2014",
			"Mario Bianchi 8 Development 02-03-2014",
			"Giuseppe Verdi 8 Meating 03-03-2014",
			"Federico Rossi 8 Meating 03-03-2014",
			"Mario Bianchi 8 Meating 03-03-2014"
		);
		
		GeneratoreDiRapportiSintetici generatore=
			new GeneratoreDiRapportiSintetici(
					new InterpreteRapportiDiTest());
		
		ArrayList<String> risultato=generatore.
			generaRapportoSintetico(rapportoSintentico);
		
		ArrayList<String> rapportoVerifica=new ArrayList<String>();
		
		Collections.addAll(rapportoVerifica,
			"Giuseppe Verdi 12 Meating 12",
			"Federico Rossi 12 Meating 12",
			"Mario Bianchi 12 Meating 12"
		);
		
		assertEquals(risultato.size(), rapportoVerifica.size());
		
		Collections.sort(risultato);
		Collections.sort(rapportoVerifica);
		
		for (int i = 0; i < risultato.size(); i++) {
			if(!(risultato.get(i).
					equalsIgnoreCase(rapportoVerifica.get(i)))){
				fail("Test Fallito su "+rapportoVerifica.get(i));
			}
		}
		
		//fail("Test Fallito");
	}
}
