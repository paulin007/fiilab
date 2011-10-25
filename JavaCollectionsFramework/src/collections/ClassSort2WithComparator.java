package collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Persona2{
	
	private String cognome;
	private String nome;
	
	public Persona2(String cognome, String nome) {
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
	public String toString() {
		return cognome+" "+nome;
	}
}

public class ClassSort2WithComparator {
	
	public static void main(String[] args) {
		List<Persona2> list=new LinkedList<Persona2>();
		
		Collections.addAll(list,new Persona2("Rossi","Paolo"),new Persona2("Verdi","Giovanni"),
				new Persona2("Bianchi","Marco"),new Persona2("Rosa","Bianca"),
				new Persona2("Rosa","Chiara"),new Persona2("Neri", "Valerio"));
		
		Collections.sort(list,new Comparator<Persona2>() {
			@Override
			public int compare(Persona2 p1, Persona2 p2) {
				return p1.getCognome().compareTo(p2.getCognome());
			}
		});
		
		for (Persona2 persona : list) {
			System.out.println(persona);
		}
	}
}