package de.bw.webservices;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import org.jboss.ws.api.annotation.WebContext;

import de.bw.dao.BuecherweltDAOLocal;
import de.bw.entities.Buch;
import de.bw.entities.Kunde;
import de.bw.exception.BuecherweltException;


/**
 * @author user
 *
 */
@WebService
@WebContext(contextRoot="/buecherwelt")
@Stateless
public class Kundenverwaltung {
		
	@EJB(beanName = "BuecherweltDAO", beanInterface = de.bw.dao.BuecherweltDAOLocal.class)
	private BuecherweltDAOLocal dao;

	public void kundeHinzufuegen(int id, String vorname, String nachname, String plz, String ort, String strasse, int hausnummer, String email, String benutzername, String passwort) throws BuecherweltException {
		Kunde kunde = dao.createKunde(id, vorname, nachname, plz, ort, strasse, hausnummer, email, benutzername, passwort);
		if (kunde == null) {
			throw new BuecherweltException("Hinzufuegen fehlgeschlagen, da der Benutzer bereits existiert");
			}
	}
	
	public void kundeLoeschen(int id) {
		dao.deleteKunde(id);
	}
	
	public List<Kunde> getAllKunden() {
		List<Kunde> alleKunden = new ArrayList<Kunde>();
		alleKunden = dao.alleKundenAnzeigen();
		return alleKunden;
	}
	
	public Kunde kundeSuchen(int id) {
		Kunde kunde = dao.findKundeById(id);
		return kunde;
	}
	
	public void kundeBearbeiten(int id, String vorname, String nachname, String plz, String ort, String strasse, int hausnummer, String email, String benutzername, String passwort) {
		Kunde kunde = dao.findKundeById(id);
		kunde.setVorname(vorname);
		kunde.setNachname(nachname);
		kunde.setPlz(plz);
		kunde.setOrt(ort);
		kunde.setStrasse(strasse);
		kunde.setHausnummer(hausnummer);
		kunde.setEmail(email);
		kunde.setBenutzername(benutzername);
		kunde.setPasswort(passwort);
	}
	
	public void buchInListeEintragen(int id) {
		Buch buch = dao.findBuchById(id);
		
		
	}
	
	public void buchAusListeEntfernen(int id, String nachname, String titel) {
	}
}
