package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Persona implements Comparable<Persona>{
	
	private String cognome;
	private String nome;
	
	public Persona(String cognome, String nome) {
		super();
		this.cognome = cognome;
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public int compareTo(Persona c) {
		return cognome.compareTo(c.cognome);
	}
	
	@Override
	public String toString() {
		return cognome+" "+nome;
	}
}

public class ClassSortWithComparable {
	
	public static void main(String[] args) {
		List<Persona> list=new LinkedList<Persona>();
		
		Collections.addAll(list,new Persona("Rossi","Paolo"),new Persona("Verdi","Giovanni"),
				new Persona("Bianchi","Marco"),new Persona("Rosa","Bianca"),
				new Persona("Rosa","Chiara"),new Persona("Neri", "Valerio"));
		
		Collections.sort(list);
		
		
		for (Persona persona : list) {
			System.out.println(persona);
		}
	}
}
