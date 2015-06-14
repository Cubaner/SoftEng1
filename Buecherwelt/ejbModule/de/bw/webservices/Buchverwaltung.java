package de.bw.webservices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import org.jboss.ws.api.annotation.WebContext;

import de.bw.dao.BuecherweltDAOLocal;
import de.bw.entities.Buch;
import de.bw.entities.BuecherweltSession;
import de.bw.entities.Mitarbeiter;
import de.bw.exception.BuecherweltException;
import de.bw.exception.InvalidLoginException;
import de.bw.exception.NoSessionException;
import de.bw.login.ReturncodeResponse;
import de.bw.login.UserLoginResponse;

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
	
	public UserLoginResponse login(int id, String benutzername, String passwort) {
		UserLoginResponse response = new UserLoginResponse();
		try {
			Mitarbeiter mitarbeiter = this.dao.findMitarbeiterById(id);		
			if (mitarbeiter != null && mitarbeiter.getPasswort().equals(passwort)) {
				int sessionId = dao.createSession(mitarbeiter);			
				response.setSessionId(sessionId);
			}
			else {				
				throw new InvalidLoginException("Login fehlgeschlagen, da Mitarbeiter unbekannt oder Passwort falsch. benutzername="+mitarbeiter.getBenutzername());
			}
		}
		catch (BuecherweltException e) {
			response.setReturnCode(e.getErrorCode());
			response.setMessage(e.getMessage());
		}
		return response;
	}
	
	public ReturncodeResponse logout(int sessionId) {
		dao.closeSession(sessionId);
		ReturncodeResponse response = new ReturncodeResponse();
		
		return response;
	}
	
	
	
	public void neuesBuchHinzufuegen(int id, String titel, String autor, int erscheinungsjahr, int anzahl) throws BuecherweltException {
			Buch buch = dao.createBuch(id, titel, autor, erscheinungsjahr, anzahl);
			if (buch == null) {
				throw new BuecherweltException("Hinzufuegen fehlgeschlagen, da das Buch bereits existiert");
			}
	}
	
	public void buchLoeschen(int id) {
		dao.deleteBuch(id);
	}
	
	public List<Buch> getAllBuecher() {
		List<Buch> alleBuecher = new ArrayList<Buch>();
		alleBuecher = dao.alleBuecherAnzeigen();
		return alleBuecher;
	}
	
	public Buch buchSuchen(int id) {
		Buch buch = dao.findBuchById(id);
		return buch;
	}
	
	public void buchBearbeiten(int id, String titel, String autor, int erscheinungsjahr, int anzahl) throws BuecherweltException {
		Buch buch = dao.findBuchById(id);
		buch.setTitel(titel);
		buch.setAutor(autor);
		buch.setErscheinungsjahr(erscheinungsjahr);
		buch.setAnzahl(anzahl);
	}
	
	public void anzahlErhoehen(int id) throws BuecherweltException {
		Buch buch = dao.findBuchById(id);
		int anzahlAlt = buch.getAnzahl();
		buch.setAnzahl(anzahlAlt + 1);
	}
	
	public void anzahlVerringern(int id) throws BuecherweltException {
		Buch buch = dao.findBuchById(id);
		if (buch.getAnzahl() > 0) {
			buch.setAnzahl(buch.getAnzahl() - 1);
		}
		else { 
			new BuecherweltException(40, "Buch vergriffen!");
		}
	}
	
	
	public Buch getBuchMitIdEins() {
		int id = 3;
		Buch buch = dao.findBuchById(id);
		return buch;
	}
}
