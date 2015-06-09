package de.bw.webservices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import org.jboss.ws.api.annotation.WebContext;

import de.bw.dao.BuecherweltDAOLocal;
import de.bw.entities.Buch;
import de.bw.entities.BuecherweltSession;
import de.bw.exception.BuecherweltException;
import de.bw.exception.NoSessionException;

/**
 * @author user
 *
 */

@WebService
@WebContext(contextRoot="/buecherwelt")
@Stateless
public class Buchverwaltung {
	
	@EJB(beanName = "BuecherweltDAO", beanInterface = de.bw.dao.BuecherweltDAOLocal.class)
	private BuecherweltDAOLocal dao;
	
	private BuecherweltSession getSession(int sessionId) throws NoSessionException {
		BuecherweltSession session = dao.findSessionById(sessionId);
		if (session==null)
			throw new NoSessionException("Bitte zunächst ein Login durchführen.");
		else
			return session;
	}
	
	public void neuesBuchHinzufuegen(String titel, String autor, Date erscheinungsjahr, int anzahl) throws BuecherweltException {
			Buch buch = dao.createBuch(titel, autor, erscheinungsjahr, anzahl);
			if (buch == null) {
				throw new BuecherweltException("Hinzufuegen fehlgeschlagen, da das Buch bereits existiert");
			}
	}
	
	public void buchLoeschen(int id) {
		dao.deleteBuch(id);
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
