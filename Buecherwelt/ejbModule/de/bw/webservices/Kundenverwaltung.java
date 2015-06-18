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
import de.bw.dto.KundeTO;
import de.bw.dto.MitarbeiterTO;
import de.bw.dto.SessionTO;
import de.bw.entities.Kunde;
import de.bw.exception.BuecherweltException;
import de.bw.exception.InvalidLoginException;


/**
 * @author Jonas Brandhorst/Johann Schäfer
 * Der Webservice Kundenverwaltung beinhaltet alle Methoden, welche auf die Tabelle Kunde zugreifen.
 * Hierunter fallen unter anderem das Hinzufügen/Löschen von Kunden wie auch die Login-Funktion für diese 
 * und die Logout-Funktion für die Mitarbeiter und die Kunden. 
 */
@WebService
@WebContext(contextRoot="/buecherwelt")
@Stateless
public class Kundenverwaltung {
	
	/**
	 * Der Logger wird verwendet, um Log-Ausgaben zu erstellen
	 */
	private static final Logger logger = Logger.getLogger(Kundenverwaltung.class);
	
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
	 * Login-Methode für Kunden, bei der auch eine neue Session erzeugt wird
	 * @throws InvalidLoginException 
	 */
	public SessionTO loginKunde(String benutzername, String passwort) throws InvalidLoginException {
		Kunde kunde = dao.kundenLogin(benutzername, passwort);
		if(kunde != null) {			
			int sessionId = dao.createSession(kunde);
			SessionTO sessionTO = dtoErzeuger.createSessionDTO(sessionId);
			logger.info("Session für den Kunden mit Id: " + sessionId + " wurde erzeugt.");
			return sessionTO;
		}
		else {
			logger.info("Kundenlogin fehlgeschlagen!");
			throw new InvalidLoginException("Login fehlgeschlagen, da der Benutzername unbekannt oder das Passwort falsch.");
		}
	}
	
	/**
	 * @param sessionId
	 * Logout-Methode für Kunden und Mitarbeiter
	 */
	public void logout(int sessionId) {
		dao.closeSession(sessionId);
		logger.info("Logout erfolgreich. Session=" + sessionId);
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
	 * @return Kunde
	 * @throws BuecherweltException
	 * Erzeugung eines neuen Kunden
	 */
	public KundeTO kundeHinzufuegen(int id, String vorname, String nachname, String plz, String ort, String strasse, int hausnummer, String email, String benutzername, String passwort) throws BuecherweltException {
		Kunde kunde = dao.createKunde(id, vorname, nachname, plz, ort, strasse, hausnummer, email, benutzername, passwort);
		if (kunde == null) {
			logger.info("Hinzufuegen fehlgeschlagen, da der Kunde bereits existiert");
			throw new BuecherweltException("Hinzufuegen fehlgeschlagen, da der Kunde bereits existiert");
		}
		else {
			KundeTO kundeTO = dtoErzeuger.createKundenDTO(kunde);
			logger.info("Kunde mit der Id: " + id + " wurde hinzugefuegt.");
			return kundeTO;
		}
	}
	
	/**
	 * @param id
	 * Löschen eines konkreten Kunden
	 */
	public void kundeLoeschen(int id) {
		dao.deleteKunde(id);
	}
	
	/**
	 * @return List<Kunde>
	 * Ausgabe aller Kunden
	 */
	public List<KundeTO> getAllKunden() {
		List<Kunde> alleKunden = new ArrayList<Kunde>();
		alleKunden = dao.alleKundenAnzeigen();
		List<KundeTO> alleKundenTO = dtoErzeuger.createKundenDTO(alleKunden);
		return alleKundenTO;
	}
	
	/**
	 * @param id
	 * @return Kunde
	 * gibt einen bestimmten Kunden aus
	 */
	public KundeTO kundeSuchen(int id) {
		Kunde kunde = dao.findKundeById(id);
		KundeTO kundeTO = dtoErzeuger.createKundenDTO(kunde);
		return kundeTO;
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
	 * Bearbeitet vorhandenen Kunden
	 * @throws BuecherweltException 
	 */
	public void kundeBearbeiten(int id, String vorname, String nachname, String plz, String ort, String strasse, int hausnummer, String email, String benutzername, String passwort) throws BuecherweltException { 
	Kunde kunde = dao.findKundeById(id);
	if(kunde != null) {
		kunde.setVorname(vorname);
		kunde.setNachname(nachname);
		kunde.setPlz(plz);
		kunde.setOrt(ort);
		kunde.setStrasse(strasse);
		kunde.setHausnummer(hausnummer);
		kunde.setEmail(email);
		kunde.setBenutzername(benutzername);
		kunde.setPasswort(passwort);
		logger.info("Kunde mit Id: " + id + " wurde bearbeitet.");
	}
	else {
		logger.info("Kunde nicht gefunden!");
		throw new BuecherweltException("Kunde nicht gefunden!");
	}
	}
}
