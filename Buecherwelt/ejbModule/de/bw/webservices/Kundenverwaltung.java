package de.bw.webservices;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebService;

import org.jboss.ws.api.annotation.WebContext;

import de.bw.entities.Kunde;


/**
 * @author user
 *
 */
@WebService
@WebContext(contextRoot="/buecherwelt")
@Stateless
public class Kundenverwaltung {
	
	public Kundenverwaltung() {
		
	}

	public void kundeHinzufuegen(String name, String nachname, String plz, String ort, String strasse, int hausnummer, String email, String benutzername, String passwort) {
		new Kunde(name, nachname, plz, ort, strasse, hausnummer, email, benutzername, passwort);
	}
	
	public void kundeLoeschen(String name, String nachname, String ort, String strasse, int hausnummer) {
		//Parameter zur eindeutigen Identifizierung
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
