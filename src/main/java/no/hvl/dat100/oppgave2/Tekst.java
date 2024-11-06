package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Tekst extends Innlegg {

	// TODO: objektvariable 
	private String tekst;
	
	public Tekst () {
		//TODO 
		super();
		this.tekst ="";
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		//TODO 
		super(id,bruker,dato);
		this.tekst = tekst;
		
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		//TODO 
		super(id,bruker,dato,likes);
		this.tekst=tekst;
		
	}
	
	public String getTekst() {
		//TODO 
		return tekst;

	}

	public void setTekst(String tekst) {
		//TODO 
		this.tekst=tekst;
	}

	@Override
	public String toString() {
		//TODO
		return "TEKST\n"+super.toString()+tekst+"\n";

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		//TODO
		return super.toHTML()+"<p>"+tekst+"</p>\n";
				
	}
}
