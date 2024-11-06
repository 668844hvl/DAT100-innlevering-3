package no.hvl.dat100.oppgave3;

import no.hvl.dat100.oppgave1.*;
import no.hvl.dat100.oppgave2.Tekst;

public class Blogg {

	// TODO: objektvariable
	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg() {

		// TODO
		this.innleggtabell = new Innlegg[20];
		this.nesteledig = 0;

	}

	public Blogg(int lengde) {

		// TODO
		this.innleggtabell = new Innlegg[lengde];
		this.nesteledig = 0;

	}

	public int getAntall() {

		// TODO
		return nesteledig;

	}

	public Innlegg[] getSamling() {

		// TODO
		return innleggtabell;

	}

	public int finnInnlegg(Innlegg innlegg) {

		// TODO
		int pos = 0;
		while (pos < nesteledig) {
			if (innleggtabell[pos].erLik(innlegg)) {

				return pos;
			}
			pos++;
		}
		return -1;

	}

	public boolean finnes(Innlegg innlegg) {

		// TODO
		int pos = 0;
		while (pos < nesteledig) {
			if (innleggtabell[pos].erLik(innlegg)) {
				return true;
			}
			pos++;
		}
		return false;

	}

	public boolean ledigPlass() {

		// TODO
		if (nesteledig < innleggtabell.length) {
			return true;
		} else
			return false;

	}

	public boolean leggTil(Innlegg innlegg) {

		// TODO
		if (ledigPlass()) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		} else
			return false;

	}

	public String toString() {

		// TODO
		String tabell = nesteledig + "\n";
		for (int i = 0; i < nesteledig; i++) {
			tabell += innleggtabell[i].toString();
		}
		return tabell;
	}

	// valgfrie oppgaver nedenfor

	public void utvid() {

		// TODO
		Innlegg[] tabell = new Innlegg[2 * innleggtabell.length];
		for (int i = 0; i < nesteledig; i++) {
			tabell[i] = innleggtabell[i];
		}
		innleggtabell = tabell;
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		// TODO
		if (finnes(innlegg)) {
			if (!ledigPlass()) {
				utvid();

			}
			innleggtabell[nesteledig] = innlegg;
			return true;
		} else
			return false;

	}

	public boolean slett(Innlegg innlegg) {

		// TODO
		if (finnes(innlegg)) {
			int pos = finnInnlegg(innlegg);// posisjonen til innlegget
			innleggtabell[pos] = innleggtabell[nesteledig - 1]; // overskriver ønsket innlegg
			innleggtabell[nesteledig - 1] = null; // Fjerner innlegg frå original plass
			nesteledig--; // stiller tilbake nesteledig slik ein ikkje får hull i tabellen
			return true;
		} else
			return false;

	}

	public int[] search(String keyword) {
		/*
		 * Ønsker ein ein search metode med (String user, String ord) også som
		 * parameter? Ser det er det som står i oppgåve m) men ikkje det om var gjort
		 * klart i malen... (lager ein for sikkerhetsskyld (er trossalt to argumenter,
		 * så skal ikkje overskrve den som er laga under)
		 */
		// TODO
		int[] id = new int[nesteledig]; // produserer ein tabell som har plass til alle brukte plasser av tabellen
		int pos = 0;

		for (int i = 0; i < id.length; i++) {
			if (innleggtabell[i] instanceof Tekst) { // Sjekker at innlegget kan konverteres til Tekst innlegg
				Tekst a = (Tekst) innleggtabell[i];
				if (a.getTekst().contains(keyword)) { // Sjekker om innlegget inneholder ordet
					id[pos] = a.getId(); // plasserer id i tabell
					pos++;
				}
			}
		}

		return id;
	}

	// TODO
	public int[] search(String user, String ord) {
		int[] id = new int[nesteledig];
		int pos = 0;
		
		for (int i=0; i<id.length;i++) {
			if(innleggtabell[i].getBruker().equals(user)) { //Sjekker om det er same bruker
				if (innleggtabell[i] instanceof Tekst) { // Sjekker at innlegget kan konverteres til Tekst innlegg
					Tekst a = (Tekst) innleggtabell[i];
					if (a.getTekst().contains(ord)) { // Sjekker om innlegget inneholder ordet
						id[pos] = a.getId(); // plasserer id i tabell
						pos++;
					}
				}
			}
		}
		
		
		
		return id;
	}

}