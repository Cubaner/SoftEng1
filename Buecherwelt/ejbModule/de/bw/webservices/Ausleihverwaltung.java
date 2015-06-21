package de.bw.webservices;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import org.jboss.logging.Logger;
import org.jboss.ws.api.annotation.WebContext;

import de.bw.dao.BuecherweltDAOLocal;
import de.bw.dto.AusleiheTO;
import de.bw.dto.ErzeugeDTOs;
import de.bw.entities.Ausleihe;
import de.bw.entities.Buch;
import de.bw.entities.BuecherweltSession;
import de.bw.entities.Kunde;
import de.bw.exception.BuecherweltException;
import de.bw.exception.NoSessionException;


/**
 * @author Jonas Brandhorst/Johann Schäfer
 * Der Webservice Ausleihverwaltung beinhaltet alle Methoden, welche auf die Tabelle Ausleihe zugreifen.
 * Hierunter fallen unter anderem das Hinzufügen/Löschen von Ausleihen wie auch die Verlängerung der Leihfrist. 
 */
@WebService
@WebContext(contextRoot="/buecherwelt")
@Stateless
public class Ausleihverwaltung {
	
	/**
	 * Der Logger wird verwendet, um Log-Ausgaben zu erstellen
	 */
	private static final Logger logger = Logger.getLogger(Ausleihverwaltung.class);
	
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
	 * @throws NoSessionException
	 * 
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
	 * @param kunde
	 * @param buch
	 * @return Ausleihe
	 * @throws BuecherweltException
	 * Erstellt eine neue Ausleihe über die DAO-Klasse mit der aktuellen Systemzeit
	 */
	public AusleiheTO neueAusleiheHinzufuegen(int id, int kundenId, int buchId) throws BuecherweltException {
		Date date = new Date();
		Date rueckgabedatum = new Date();
		Timestamp leihdatum = new Timestamp(date.getTime());
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.add(Calendar.MONTH, 1);
		rueckgabedatum = cal.getTime();		
		Ausleihe ausleihe = dao.createAusleihe(id, leihdatum, rueckgabedatum, kundenId, buchId);
		if (ausleihe == null) {
			logger.info("Hinzufuegen fehlgeschlagen, da die Ausleihe bereits existiert");
			throw new BuecherweltException("Hinzufuegen fehlgeschlagen, da die Ausleihe bereits existiert");
		}
		else {
			anzahlVerringern(buchId);
			AusleiheTO ausleiheTO = dtoErzeuger.createAusleiheDTO(ausleihe);
			logger.info("Ausleihe hinzugefügt und Anzahl um 1 verringert");
			return ausleiheTO;
		}
	}

	/**
	 * @param id
	 * @throws BuecherweltException
	 * Löscht eine Ausleihe aus der Tabelle anhand einer Id
	 */
	public void ausleiheLoeschen(int id) throws BuecherweltException {
		if(ausleiheSuchen(id) != null) {
			Ausleihe ausleihe = new Ausleihe();
			Buch buch = new Buch();
			ausleihe = dao.findAusleiheById(id);
			buch = dao.findBuchById(ausleihe.getBuchId());
			if(buch != null) {
				dao.deleteAusleihe(id);
				anzahlErhoehen(buch.getId());
				logger.info("Ausleihe: " + id + " gelöscht!");
			}
			else {
				logger.info("Buch nicht gefunden!");
				throw new BuecherweltException("Buch nicht gefunden!");
			}
		}
		else {
			logger.info("AusleihId: " + id + " nicht gefunden!");
			throw new BuecherweltException("Ausleihe nicht gefunden!");
		}
	}
	
	/**
	 * @return List<Ausleihe>
	 * gibt alle Ausleihen aus
	 */
	public List<AusleiheTO> getAllAusleihen() {
		List<Ausleihe> alleAusleihen = new ArrayList<Ausleihe>();
		alleAusleihen = dao.alleAusleihenAnzeigen();
		List<AusleiheTO> alleAusleihenTO = dtoErzeuger.createAusleiheDTO(alleAusleihen);
		return alleAusleihenTO;
	}
	
	/**
	 * @param id
	 * @return Ausleihe
	 * gibt eine bestimmte Ausleihe aus
	 */
	public AusleiheTO ausleiheSuchen(int id) {
		Ausleihe ausleihe = dao.findAusleiheById(id);
		AusleiheTO ausleiheTO = dtoErzeuger.createAusleiheDTO(ausleihe);
		return ausleiheTO;
	}
	
	/**
	 * @param id
	 * Methode zum Verlängern der Leihfrist um einen Monat
	 * @throws BuecherweltException 
	 */
	public Date leihfristVerlaengern(int id) throws BuecherweltException {
		Date rueckgabedatum = new Date();
		Ausleihe ausleihe = dao.findAusleiheById(id);
		if(ausleihe != null) {
			GregorianCalendar cal = new GregorianCalendar();
			cal.setTime(ausleihe.getRueckgabedatum());
			cal.add(Calendar.MONTH, 1);
			rueckgabedatum = cal.getTime();
			ausleihe.setRueckgabedatum(rueckgabedatum);
			logger.info("Neues Datum: " + rueckgabedatum);
			return rueckgabedatum;
		}
		else {
			logger.info("Ausleihe nicht gefunden");
			throw new BuecherweltException("Ausleihe nicht gefunden");
		}
	}
	
	/**
	 * @param id
	 * @throws BuecherweltException
	 * erhöht den Buchbestand eines Buches in der Bibliothek um 1
	 */
	public void anzahlErhoehen(int id) throws BuecherweltException {
		Buch buch = dao.findBuchById(id);
		int anzahlAlt = buch.getAnzahl();
		buch.setAnzahl(anzahlAlt + 1);
	}
	
	/**
	 * @param id
	 * @throws BuecherweltException
	 * verringert den Buchbestand eines Buches in der Bibliothek um 1
	 */
	public void anzahlVerringern(int id) throws BuecherweltException {
		Buch buch = dao.findBuchById(id);
		if (buch.getAnzahl() > 0) {
			buch.setAnzahl(buch.getAnzahl() - 1);
			logger.info("Anzahl von Buch " + id + " um 1 verringert!");
		}
		else { 
			logger.info("Buch " + id + " vergriffen");
			throw new BuecherweltException("Buch vergriffen!");
		}
	}
	
	/**
	 * @param id
	 * @return List<Ausleihe>
	 * Gibt alles Ausleihen eines bestimmten Kunden aus
	 */
	public List<AusleiheTO> getAusleihenByKundenId(int id) {
		List<Ausleihe> alleAusleihen = new ArrayList<Ausleihe>();
		List<Ausleihe> ausleihenByKundenId = new ArrayList<Ausleihe>();
		alleAusleihen = dao.alleAusleihenAnzeigen();
		for(Ausleihe ausleihe : alleAusleihen) {
			if(ausleihe.getKundenId() == id) {
				ausleihenByKundenId.add(ausleihe);
			}
		}
		List<AusleiheTO> ausleihenByKundenIdTO = dtoErzeuger.createAusleiheDTO(ausleihenByKundenId);
		return ausleihenByKundenIdTO;
	}
}
