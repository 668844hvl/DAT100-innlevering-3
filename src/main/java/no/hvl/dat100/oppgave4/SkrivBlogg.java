package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		boolean read = false;
		PrintWriter skriver = null;
		try {
			skriver = new PrintWriter(mappe + "/" + filnavn);
			skriver.print(samling.toString());
			read = true;

		} catch (FileNotFoundException e) {
			read = false;

		} finally {
			if (skriver != null)
				skriver.close();
		}
		return read;

	}
}
