package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {

	// TODO - deklarering av objektvariable
	private int id;
	private String bruker;
	private String dato;
	private int likes;

	// Konstruktører
	public Innlegg() { // Uten parameter
		this.id = 1;
		this.bruker = "Ukjent";
		this.dato = "Ukjent";
		this.likes = 0;

	}

	public Innlegg(int id, String bruker, String dato) { // Med alle parameter (utenom likes)

		// TODO
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		likes = 0;
	}

	public Innlegg(int id, String bruker, String dato, int likes) { // Med alle parameter

		// TODO - START
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
	}

	// Get og set metoder
	public String getBruker() {

		// TODO
		return bruker;

	}

	public void setBruker(String bruker) {

		// TODO
		this.bruker = bruker;

	}

	public String getDato() {

		// TODO
		return dato;

	}

	public void setDato(String dato) {

		// TODO
		this.dato = dato;

	}

	public int getId() {

		// TODO
		return id;

	}

	public void setId(int id) {

		// TODO
		this.id = id;
	}

	public int getLikes() {

		// TODO
		return likes;

	}

	public void doLike() {

		// TODO
		likes++;

	}

	public boolean erLik(Innlegg innlegg) {

		// TODO
		if (this.id == innlegg.getId()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {

		// TODO
		return id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {

		// TODO
		return "<h2>" + bruker + "@" + dato + " [" + likes + "]</h2>\n";
	
	}
}
