package de.bw.webservices;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import org.jboss.ws.api.annotation.WebContext;

import de.bw.dao.BuecherweltDAOLocal;
import de.bw.entities.BuecherweltSession;
import de.bw.entities.Mitarbeiter;
import de.bw.exception.BuecherweltException;
import de.bw.exception.InvalidLoginException;
import de.bw.exception.NoSessionException;
import de.bw.login.ReturncodeResponse;
import de.bw.login.UserLoginResponse;

@WebService
@WebContext(contextRoot="/buecherwelt")
@Stateless
public class Mitarbeiterverwaltung {
	
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
	
	public void neuenMitarbeiterHinzufuegen(int id, String vorname, String nachname, String plz, String ort, String strasse, int hausnummer, String email, String benutzername, String passwort) throws BuecherweltException {
		Mitarbeiter mitarbeiter = dao.createMitarbeiter(id, vorname, nachname, plz, ort, strasse, hausnummer, email, benutzername, passwort);
			if (mitarbeiter == null) {
				throw new BuecherweltException("Hinzufuegen fehlgeschlagen, da der Benutzer bereits existiert");
			}
	}
	
	public void mitarbeiterLoeschen(int id){
		dao.deleteMitarbeiter(id);
	}
	
	public List<Mitarbeiter> getAllMitarbeiter(){
		List<Mitarbeiter> alleMitarbeiter = new ArrayList<Mitarbeiter>();
		alleMitarbeiter = dao.alleMitarbeiterAnzeigen();
		return alleMitarbeiter;
		
	}
	
	public Mitarbeiter mitarbeiterSuchen(){
		return null;
	}
}
