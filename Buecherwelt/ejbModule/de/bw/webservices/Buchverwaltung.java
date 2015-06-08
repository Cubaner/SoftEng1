package de.bw.webservices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebService;

import org.jboss.ws.api.annotation.WebContext;

import de.bw.entities.Buch;

/**
 * @author user
 *
 */

@WebService
@WebContext(contextRoot="/buecherwelt")
@Stateless
public class Buchverwaltung {
	
	public Buchverwaltung() {
		super();
	}
	
	public void neuesBuchHinzufuegen(String titel, String autor, Date erscheinungsjahr, int anzahl) {
		new Buch(titel, autor, erscheinungsjahr, anzahl);
	}
	
	public void buchLoeschen(String titel, String autor) {
		/* Wenn Titel und Autor gleich dem Titel und Autor von der Datenbank sind, dann ...
		//if((titel == titel)&&(autor == autor)) {
			dann aus Datenbank entfernen 
		} */
	}
	
	public List<Buch> getAllBuecher() {
		List<Buch> buecher = new ArrayList<Buch>();
		return buecher;
	}
	
	public List<Buch> buchSuchen(String titel) {
		//mit for-Schleife über jpa füllen
		List<Buch> buecher = new ArrayList<Buch>();
		//Alles aus der Datenbank holen und anschließend mit titel vergleichen, es sei denn es funktioniert,
		//dass man direkt in der Datenbank sucht (select * from Buch where titel = titel;
		return buecher;
	}
	
	public void titelBearbeiten(String titel, String autor) {
		//einfach mit SQL-Befehlen?
	}
	
	public void autorBearbeiten(String titel, String autor) {
		//einfach mit SQL-Befehlen?
	}
	
	public void erscheinungsjahrBearbeiten(String titel, String autor, Date erscheinungsjahr) {
		//einfach mit SQL-Befehlen?
	}
	
	public void anzahlBearbeiten(String titel, String autor, int anzahl) {
		//einfach mit SQL-Befehlen?
	}
	
	public void anzahlErhoehen() {
		//anzahl = anzahl + 1;
	}
	
	public void anzahlVerringern() {
		//anzahl = anzahl - 1;
	}
}
