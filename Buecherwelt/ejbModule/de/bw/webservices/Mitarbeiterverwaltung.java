package de.bw.webservices;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import org.jboss.logging.Logger;
import org.jboss.ws.api.annotation.WebContext;

import de.bw.dao.BuecherweltDAOLocal;
import de.bw.dto.ErzeugeDTOs;
import de.bw.dto.MitarbeiterTO;
import de.bw.dto.SessionTO;
import de.bw.entities.BuecherweltSession;
import de.bw.entities.Mitarbeiter;
import de.bw.exception.BuecherweltException;
import de.bw.exception.InvalidLoginException;
import de.bw.exception.NoSessionException;

/**
 * @author Jonas Brandhorst/Johann Schäfer
 * Der Webservice Mitarbeiterverwaltung beinhaltet alle Methoden, welche auf die Tabelle Mitarbeiter zugreifen.
 * Hierunter fallen unter anderem das Hinzufügen/Löschen von Mitarbeitern wie auch die Login-Funktion für diese. 
 */
@WebService
@WebContext(contextRoot="/buecherwelt")
@Stateless
public class Mitarbeiterverwaltung {
	
	/**
	 * Der Logger wird verwendet, um Log-Ausgaben zu erstellen
	 */
	private static final Logger logger = Logger.getLogger(Mitarbeiterverwaltung.class);
	
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
	 * @param benutzername
	 * @param passwort
	 * @return boolean
	 * Login-Methode für die Mitarbeiter
	 */
	public SessionTO loginMitarbeiter(String benutzername, String passwort) throws InvalidLoginException {
		Mitarbeiter mitarbeiter = dao.mitarbeiterLogin(benutzername, passwort);
		if(mitarbeiter != null) {			
			int sessionId = dao.createSession(mitarbeiter);
			SessionTO sessionTO = dtoErzeuger.createSessionDTO(sessionId);
			logger.info("Session für den Mitarbeiter mit Id: " + sessionId + " wurde erzeugt.");
			return sessionTO;
		}
		else {
			logger.info("Mitarbeiterlogin fehlgeschlagen!");
			throw new InvalidLoginException("Login fehlgeschlagen, da der Benutzername unbekannt oder das Passwort falsch.");
		}
	}
	
	/**
	 * @param sessionId
	 * @return BuecherweltSession
	 * @throws NoSessionException
	 * Ausgabe einer bestimmten Session
	 */
	private BuecherweltSession getSession(int sessionId) throws NoSessionException {
		BuecherweltSession session = dao.findSessionById(sessionId);
		if (session==null)
			throw new NoSessionException("Bitte zunächst ein Login durchführen.");
		else
			return session;
	}
	
	/**
	 * @param id
	 * @param vorname
	 * @param nachname
	 * @param plz
	 * @param ort
	 * @param strasse
	 * @param hausnummer
	 * @param email
	 * @param benutzername
	 * @param passwort
	 * @throws BuecherweltException
	 * Fügt einen neuen Mitarbeiter hinzu
	 */
	public MitarbeiterTO neuenMitarbeiterHinzufuegen(int id, String vorname, String nachname, String plz, String ort, String strasse, int hausnummer, String email, String benutzername, String passwort) throws BuecherweltException {
		Mitarbeiter mitarbeiter = dao.createMitarbeiter(id, vorname, nachname, plz, ort, strasse, hausnummer, email, benutzername, passwort);
			if (mitarbeiter == null) {
				logger.info("Hinzufuegen fehlgeschlagen, da der Mitarbeiter bereits existiert");
				throw new BuecherweltException("Hinzufuegen fehlgeschlagen, da der Mitarbeiter bereits existiert");
			}
			else {
				MitarbeiterTO mitarbeiterTO = dtoErzeuger.createMitarbeiterDTO(mitarbeiter);
				logger.info("Mitarbeiter mit der Id: " + id + " wurde hinzugefuegt.");
				return mitarbeiterTO;
			}
	}
	
	/**
	 * @param id
	 * Löscht einen Mitarbeiter anhand einer Id
	 */
	public void mitarbeiterLoeschen(int id){
		dao.deleteMitarbeiter(id);
	}
	
	/**
	 * @return List<Mitarbeiter>
	 * Gibt alle Mitarbeiter aus
	 */
	public List<MitarbeiterTO> getAllMitarbeiter(){
		List<Mitarbeiter> alleMitarbeiter = new ArrayList<Mitarbeiter>();
		alleMitarbeiter = dao.alleMitarbeiterAnzeigen();
		List<MitarbeiterTO> alleMitarbeiterTO = dtoErzeuger.createMitarbeiterDTO(alleMitarbeiter);
		return alleMitarbeiterTO;	
	}
	
	/**
	 * @param id
	 * @return Mitarbeiter
	 * Gibt einen bestimmten Mitarbeiter aus
	 */
	public MitarbeiterTO mitarbeiterSuchen(int id){
		Mitarbeiter mitarbeiter = dao.findMitarbeiterById(id);
		MitarbeiterTO mitarbeiterTO = dtoErzeuger.createMitarbeiterDTO(mitarbeiter);
		return mitarbeiterTO;
	}
	
	/**
	 * @param id
	 * @param vorname
	 * @param nachname
	 * @param plz
	 * @param ort
	 * @param strasse
	 * @param hausnummer
	 * @param email
	 * @param benutzername
	 * @param passwort
	 * Bearbeitet einen vorhandenen Mitarbeiter aus der Tabelle Mitarbeiter
	 * @throws BuecherweltException 
	 */
	public void mitarbeiterBearbeiten(int id, String vorname, String nachname, String plz, String ort, String strasse, int hausnummer, String email, String benutzername, String passwort) throws BuecherweltException {
		Mitarbeiter mitarbeiter = dao.findMitarbeiterById(id);
		if(mitarbeiter != null) {
		mitarbeiter.setVorname(vorname);
		mitarbeiter.setNachname(nachname);
		mitarbeiter.setPlz(plz);
		mitarbeiter.setOrt(ort);
		mitarbeiter.setStrasse(strasse);
		mitarbeiter.setHausnummer(hausnummer);
		mitarbeiter.setEmail(email);
		mitarbeiter.setBenutzername(benutzername);
		mitarbeiter.setPasswort(passwort);
		logger.info("Mitarbeiter mit Id: " + id + " wurde bearbeitet.");
		}
		else {
			logger.info("Mitarbeiter nicht gefunden!");
			throw new BuecherweltException("Mitarbeiter nicht gefunden!");
		}
	}
}
