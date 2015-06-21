package de.bw.dao;

import java.util.Date;
import java.util.List;

import javax.ejb.Local;

import de.bw.entities.Ausleihe;
import de.bw.entities.Buch;
import de.bw.entities.BuecherweltSession;
import de.bw.entities.Kunde;
import de.bw.entities.Mitarbeiter;


/**
 * @author Jonas Brandhorst/Johann Schäfer
 *
 */
@Local
public interface BuecherweltDAOLocal {

	public Mitarbeiter mitarbeiterLogin(String benutzername, String passwort);
	
	public Kunde kundenLogin(String benutzername, String passwort);
	
	public BuecherweltSession findSessionById(int id) ;
	
	public int createSession(Kunde kunde);
	
	public int createSession(Mitarbeiter mitarbeiter);
	
	public void closeSession(int id);
	
	public Mitarbeiter findMitarbeiterById(int id);
	
	public Mitarbeiter createMitarbeiter(int id, String vorname, String nachname, String plz, String ort, String strasse, int hausnummer, String email, String benutzername, String passwort);
	
	public void deleteMitarbeiter(int id);
	
	public List<Mitarbeiter> alleMitarbeiterAnzeigen();	
	
	public Kunde findKundeById(int id);
	
	public Kunde createKunde(int id, String vorname, String nachname, String plz, String ort, String strasse, int hausnummer, String email, String benutzername, String passwort);
	
	public void deleteKunde(int id);
	
	public List<Kunde> alleKundenAnzeigen();
	
	public Buch findBuchById(int id);
	
	public Buch createBuch(int id, String titel, String autor, int erscheinungsjahr, int anzahl);
	
	public void deleteBuch(int id);
	
	public List<Buch> alleBuecherAnzeigen();
	
	public Ausleihe findAusleiheById(int id);
	
	public Ausleihe createAusleihe(int id, Date leihdatum, Date rueckgabedatum, int kundenId, int buchId);
	
	public void deleteAusleihe(int id);
	
	public List<Ausleihe> alleAusleihenAnzeigen();
}
