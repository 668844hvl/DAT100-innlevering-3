package no.hvl.dat100.oppgave5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;
import no.hvl.dat100.oppgave2.*;
import no.hvl.dat100.oppgave3.*;

import javax.swing.JOptionPane;

public class LesBlogg {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	public static Blogg les(String mappe, String filnavn) {
		// FileReader leser = null;
		Scanner input = null;
		Blogg blog = new Blogg();
		try {
			// leser = new FileReader(mappe + "/" + filnavn);
			input = new Scanner(new File(mappe + "/" + filnavn));

			int lengde = input.nextInt();
			blog = new Blogg(lengde);
			while (input.hasNext()) {
				String type = input.next();
				// boolean txtb=type.equals("TEKST");
				// boolean bildeb=type.equals("BILDE");
				if (type.equals("TEKST")) {
					int id = input.nextInt();
					System.out.println("id" + id);
					String navn = input.nextLine() + input.nextLine();
					System.out.println("navn" + navn);
					String dato = input.next();
					System.out.println("dato" + dato);
					String likestxt = input.next();
					int likes;
					String tekst;
					Innlegg inn;
					try { //Lagt til i tillfelle noko er galt med fila (hadde noko problem med implementeringa og dette var ein av løysingane, var ikkje dette som var problemet(så overflødig kode))
						likes = Integer.parseInt(likestxt);
						tekst = input.nextLine() + input.nextLine();
						inn = new Tekst(id, navn, dato, likes, tekst);
						System.out.println(inn.toString());
					} catch (NumberFormatException e) {

						inn = new Tekst(id, navn, dato, likestxt);
						System.out.println("catch" + likestxt);
					}
					/*
					 * int likes = input.nextInt(); System.out.println("likes"); String tekst =
					 * input.next(); System.out.println("tekst"); Tekst inn = new Tekst(id, navn,
					 * dato, likes, tekst); System.out.println("innlegg");
					 */
					blog.leggTil(inn);
				} else if (type.equals("BILDE")) {
					int id = input.nextInt();
					String navn = input.nextLine() + input.nextLine();
					String dato = input.next();
					int likes = input.nextInt();
					String tekst = input.nextLine() + input.nextLine();
					String url = input.next();
					Bilde inn = new Bilde(id, navn, dato, likes, tekst, url);
					blog.leggTil(inn);

				} else {
					System.out.print("Problem"); //Om ein får denne teksten veit ein noko har gått galt
				}
			}

		} catch (FileNotFoundException e) {

		} catch (NumberFormatException e) {

		} catch (NoSuchElementException e) {

		} finally {
			if (input != null) {
				input.close();
			}
		}
		return blog;

	}
}
