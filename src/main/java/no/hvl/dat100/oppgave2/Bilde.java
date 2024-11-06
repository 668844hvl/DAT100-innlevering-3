package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;

public class Bilde extends Tekst {

	// TODO - objekt variable
	private String url;

	public Bilde(int id, String bruker, String dato, String tekst, String url) {

		// TODO
		super(id, bruker, dato, tekst);
		this.url = url;
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {

		// TODO
		super(id, bruker, dato, likes, tekst);
		this.url = url;

	}

	public String getUrl() {

		// TODO
		return url;

	}

	public void setUrl(String url) {

		// TODO
		this.url = url;
	}

	@Override
	public String toString() {

		// TODO
		return "BILDE\n"+super.toString().substring(6) + url + "\n";

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {

		//TODO
		return super.toHTML()+"iframe scr=\""+url+"\" height=600 width=800></iframe>\n";

	}
}
