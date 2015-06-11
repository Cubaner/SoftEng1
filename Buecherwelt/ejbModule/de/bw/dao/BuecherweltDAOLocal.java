package de.bw.dao;
import java.util.Date;
import java.util.List;

import javax.ejb.Local;

import de.bw.entities.Buch;
import de.bw.entities.BuecherweltSession;
import de.bw.entities.Kunde;
import de.bw.entities.Mitarbeiter;


@Local
public interface BuecherweltDAOLocal {
	
	public BuecherweltSession findSessionById(int id) ;
	
	public int createSession(Kunde kunde);
	
	public int createSession(Mitarbeiter mitarbeiter);
	
	public void closeSession(int id);
	
	public Mitarbeiter findMitarbeiterByName(String benutzername);
	
	public Mitarbeiter findMitarbeiterById(int id);
	
	public Mitarbeiter createMitarbeiter(int id, String vorname, String nachname, String plz, String ort, String strasse, String hausnummer, String email, String benutzername, String passwort);
	
	public void deleteMitarbeiter(int id);
	
	public List<Mitarbeiter> alleMitarbeiterAnzeigen();
	
	public Kunde findKundeByName(String name);
	
	public Kunde findKundeById(int id);
	
	public Kunde createKunde(String vorname, String nachname, String plz, String ort, String strasse, int hausnummer, String email, String benutzername, String passwort);
	
	public void deleteKunde(int id);
	
	public List<Kunde> alleKundenAnzeigen();
	
	public Buch findBuchByName(String titel);
	
	public Buch findBuchById(int id);
	
	public Buch createBuch(String titel, String autor, Date erscheinungsjahr, int anzahl);
	
	public void deleteBuch(int id);
	
	public List<Buch> alleBuecherAnzeigen();
}
