package de.bw.webservices;

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
	
	public UserLoginResponse login(String benutzername, String passwort) {
		UserLoginResponse response = new UserLoginResponse();
		try {
			Mitarbeiter mitarbeiter = this.dao.findMitarbeiterByName(benutzername);		
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
	
	public void mitarbeiterLoeschen(){
		
	}
	
	public Mitarbeiter mitarbeiterSuchen(){
		return null;
	}
	
	public List<Mitarbeiter> getAllMitarbeiter(){
		return null;
		
	}

}
