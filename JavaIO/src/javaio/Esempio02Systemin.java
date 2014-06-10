package javaio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Esempio02Systemin {

	public static void main(String[] args) {

		//nota: per accedere a System.in in eclipse bisogna aprire la console e digitarci dentro!
		InputStream input = System.in;

		BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		try {
			String s = reader.readLine();

			boolean continueIteration = true;
			while (continueIteration && s != null) {
				if (s.equalsIgnoreCase("Q")) {
					continueIteration = false;// do not use break!!!
				} else {
					System.out.println("writtenLine["+s+"]");
				}

				s = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
