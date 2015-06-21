package de.bw.webservices;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import org.jboss.logging.Logger;
import org.jboss.ws.api.annotation.WebContext;

import de.bw.dao.BuecherweltDAOLocal;
import de.bw.dto.BuchTO;
import de.bw.dto.ErzeugeDTOs;
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
	 * Zur Erzeugung von DataTransferObjects
	 */
	@EJB
	private ErzeugeDTOs dtoErzeuger;
	
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
	public BuchTO neuesBuchHinzufuegen(int id, String titel, String autor, int erscheinungsjahr, int anzahl) throws BuecherweltException {
			Buch buch = dao.createBuch(id, titel, autor, erscheinungsjahr, anzahl);
			if (buch == null) {
				logger.info("Hinzufuegen fehlgeschlagen, da das Buch " + buch.getId() + " bereits existiert");
				throw new BuecherweltException("Hinzufuegen fehlgeschlagen, da das Buch bereits existiert");
			}
			BuchTO buchTO = dtoErzeuger.createBuchDTO(buch);
			logger.info("Buch mit Id: " + buch.getId() + " wurde hinzugefuegt.");
			return buchTO;
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
	public List<BuchTO> getAllBuecher() {
		List<Buch> alleBuecher = new ArrayList<Buch>();
		alleBuecher = dao.alleBuecherAnzeigen();
		List<BuchTO> alleBuecherTO = dtoErzeuger.createBuchDTO(alleBuecher);
		return alleBuecherTO;
	}
	
	/**
	 * @param id
	 * @return Buch
	 * gibt ein bestimmtes Buch aus
	 */
	public BuchTO buchSuchen(int id) {
		Buch buch = dao.findBuchById(id);
		BuchTO buchTO = dtoErzeuger.createBuchDTO(buch);
		return buchTO;
	}
	
	/**
	 * @param titel
	 * @return Buch
	 * sucht ein einzelnes Buch nach dem Titel
	 */
	public BuchTO buchSuchenByName(String titel) {
		List<Buch> alleBuecher = new ArrayList<Buch>();
		for(Buch buch : dao.alleBuecherAnzeigen()) {
			if(buch.getTitel().equals(titel)) {
				alleBuecher.add(buch);
			}
		}
		if(alleBuecher.size() > 0) {
			Buch newBuch = alleBuecher.get(0);
			BuchTO newBuchTO = dtoErzeuger.createBuchDTO(newBuch);
			return newBuchTO;
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
}
