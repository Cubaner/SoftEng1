package de.bw.webservices;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import org.jboss.logging.Logger;
import org.jboss.ws.api.annotation.WebContext;

import de.bw.dao.BuecherweltDAOLocal;
import de.bw.entities.Buch;
import de.bw.entities.BuecherweltSession;
import de.bw.exception.BuecherweltException;
import de.bw.exception.NoSessionException;

/**
 * @author Jonas Brandhorst/Johann Schäfer
 * Der Webservice Buchverwaltung beinhaltet alle Methoden, welche auf die Tabelle Buch zugreifen.
 * Hierunter fallen unter anderem das Hinzufügen/Löschen von Büchern wie auch die Ausgabe aller Bücher. 
 */
@WebService
@WebContext(contextRoot="/buecherwelt")
@Stateless
public class Buchverwaltung {
	
	/**
	 * Der Logger wird verwendet, um Log-Ausgaben zu erstellen
	 */
	private static final Logger logger = Logger.getLogger(Buchverwaltung.class);
	
	/**
	 * beanName wird per Dependency-Injection geholt
	 */
	@EJB(beanName = "BuecherweltDAO", beanInterface = de.bw.dao.BuecherweltDAOLocal.class)
	private BuecherweltDAOLocal dao;
	
	/**
	 * @param sessionId
	 * @return BuecherweltSession
	 * @throws NoSessionException
	 */
	private BuecherweltSession getSession(int sessionId) throws NoSessionException {
		BuecherweltSession session = dao.findSessionById(sessionId);
		if (session==null)
			throw new NoSessionException("Bitte zunächst einen Login durchführen.");
		else
			return session;
	}
	
	/**
	 * @param id
	 * @param titel
	 * @param autor
	 * @param erscheinungsjahr
	 * @param anzahl
	 * @return Buch
	 * @throws BuecherweltException
	 * Erstellt ein neues Buch über die DAO-Klasse
	 */
	public Buch neuesBuchHinzufuegen(int id, String titel, String autor, int erscheinungsjahr, int anzahl) throws BuecherweltException {
			Buch buch = dao.createBuch(id, titel, autor, erscheinungsjahr, anzahl);
			if (buch == null) {
				logger.info("Hinzufuegen fehlgeschlagen, da das Buch " + id + " bereits existiert");
				throw new BuecherweltException("Hinzufuegen fehlgeschlagen, da das Buch bereits existiert");
			}
			logger.info("Buch mit Id: " + id + " wurde hinzugefuegt.");
			return buch;
	}
	
	/**
	 * @param id
	 * löscht ein bestimmtes Buch aus der Tabelle
	 */
	public void buchLoeschen(int id) {
		dao.deleteBuch(id);
	}
	
	/**
	 * @return List<Buch>
	 * gibt alle Bücher aus
	 */
	public List<Buch> getAllBuecher() {
		List<Buch> alleBuecher = new ArrayList<Buch>();
		alleBuecher = dao.alleBuecherAnzeigen();
		return alleBuecher;
	}
	
	/**
	 * @param id
	 * @return Buch
	 * gibt ein bestimmtes Buch aus
	 */
	public Buch buchSuchen(int id) {
		Buch buch = dao.findBuchById(id);
		return buch;
	}
	
	public Buch buchSuchenByName(String titel) {
		List<Buch> alleBuecher = new ArrayList<Buch>();
		for(Buch buch : getAllBuecher()) {
			if(buch.getTitel().equals(titel)) {
				alleBuecher.add(buch);
			}
		}
		if(alleBuecher.size() > 0) {
			Buch newBuch = alleBuecher.get(0);
			return newBuch;
		}
		else {
			return null;
		}
	}
	
	/**
	 * @param id
	 * @param titel
	 * @param autor
	 * @param erscheinungsjahr
	 * @param anzahl
	 * @throws BuecherweltException
	 * bearbeitet ein bestehendes Buch
	 */
	public void buchBearbeiten(int id, String titel, String autor, int erscheinungsjahr, int anzahl) throws BuecherweltException {
		Buch buch = dao.findBuchById(id);
		if(buch != null) {
			buch.setTitel(titel);
			buch.setAutor(autor);
			buch.setErscheinungsjahr(erscheinungsjahr);
			buch.setAnzahl(anzahl);
			logger.info("Buch mit Id: " + id + " wurde bearbeitet.");
		}
		else {
			logger.info("Buch nicht gefunden!");
			throw new BuecherweltException("Buch nicht gefunden!");
		}
	}
	
	/**
	 * @return Buch
	 * Test-Methode zur Anzeige eines Test-Buches aus der ejb-jar
	 */
	public Buch getBuchMitIdEins() {
		int id = 3;
		Buch buch = dao.findBuchById(id);
		return buch;
	}
}
