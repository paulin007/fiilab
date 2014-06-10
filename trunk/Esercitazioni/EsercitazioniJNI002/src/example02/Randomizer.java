package example02;

public class Randomizer {

	static{
		System.loadLibrary("example");
	}
	
	/**
	 * riempie un vettore con numero casuale di numeri casuali
	 * (numero massimo == numero di elementi nel vettore)
	 * @param a
	 * @return
	 */
	public native int randomNumbers(float[] a);
}
