package de.bw.webservices;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import org.jboss.ws.api.annotation.WebContext;

import de.bw.dao.BuecherweltDAOLocal;
import de.bw.entities.Kunde;
import de.bw.entities.Mitarbeiter;
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

	public void kundeHinzufuegen(String vorname, String nachname, String plz, String ort, String strasse, int hausnummer, String email, String benutzername, String passwort) throws BuecherweltException {
			Kunde kunde = dao.createKunde(vorname, nachname, plz, ort, strasse, hausnummer, email, benutzername, passwort);
			if (kunde == null) {
				throw new BuecherweltException("Hinzufuegen fehlgeschlagen, da der Benutzer bereits existiert");
			}
	}
	
	public void kundeLoeschen(int id) {
		dao.deleteKunde(id);
	}
	
	public List<Kunde> kundeSuchen(String nachname) {
		List<Kunde> kunden = new ArrayList<Kunde>();
		/*for(Kunde neuerKunde : kundenDatenbank(select * from kunden wherer nachname like nachname) {
		kunden.add(neuerKunde);
		}
		*/
		return kunden;		
	}
	
	public List<Kunde> getAllKunden() {
		List<Kunde> alleKunden = new ArrayList<Kunde>();
		/*for(Kunde neuerKunde : kundenDatenbank(select * from kunden) {
		kunden.add(neuerKunde);
		}
		*/
		return alleKunden;
	}
	
	public Kunde getVornameById(int id) {
		return null;
	}
	
	public Kunde getNachnameById(int id) {
		return null;
	}
	
	public void buchInListeEintragen(String nachname, String titel) {
		kundeSuchen(nachname);
		Buchverwaltung newBuchverwaltung = new Buchverwaltung();
		newBuchverwaltung.buchSuchen(titel);
	}
	
	public void buchAusListeEntfernen(String nachname, String titel) {
		kundeSuchen(nachname);
		Buchverwaltung newBuchverwaltung = new Buchverwaltung();
		newBuchverwaltung.buchSuchen(titel);
	}
}
