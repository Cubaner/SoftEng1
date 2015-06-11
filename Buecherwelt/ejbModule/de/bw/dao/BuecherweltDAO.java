package de.bw.dao;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.jboss.logging.Logger;

import de.bw.entities.Buch;
import de.bw.entities.BuecherweltSession;
import de.bw.entities.Kunde;
import de.bw.entities.Mitarbeiter;



@Stateless
public class BuecherweltDAO implements BuecherweltDAOLocal{

	@PersistenceContext
	private EntityManager em;
	
	private static final Logger logger = Logger.getLogger(BuecherweltDAO.class);
	
	public BuecherweltSession findSessionById(int id) {
		return em.find(BuecherweltSession.class, id);
	}
		
	public int createSession(Kunde kunde){
		BuecherweltSession newSession = new BuecherweltSession(kunde);
		em.persist(newSession);
		return newSession.getId();
	}
	
	public int createSession(Mitarbeiter mitarbeiter){
		BuecherweltSession newSession = new BuecherweltSession(mitarbeiter);
		em.persist(newSession);
		return newSession.getId();
	}
	
	public void closeSession(int id){
		BuecherweltSession session = em.find(BuecherweltSession.class, id);
		em.remove(session);
	}
	
	public Mitarbeiter findMitarbeiterById(int id){
		return em.find(Mitarbeiter.class, id);
	}
	
	public Mitarbeiter createMitarbeiter(int id, String vorname, String nachname, String plz, String ort, String strasse, int hausnummer, String email, String benutzername, String passwort)  {
		if(findMitarbeiterById(id) == null) {
			logger.info("ID: " + id);
			Mitarbeiter mitarbeiter = new Mitarbeiter(vorname, nachname, plz, ort, strasse, hausnummer, email, benutzername, passwort);
			em.persist(mitarbeiter);	
			return mitarbeiter;
		}
		else {
			//Return null, wenn der Benutzername bereits existiert.
			return null;
		}
	}
	
	public void deleteMitarbeiter(int id) {
		Mitarbeiter mitarbeiter = em.find(Mitarbeiter.class, id);
		em.remove(mitarbeiter);
	}

	public List<Mitarbeiter> alleMitarbeiterAnzeigen() {
		List<Mitarbeiter> alleMitarbeiter = new ArrayList<Mitarbeiter>();
		alleMitarbeiter = em.createQuery("SELECT * FROM Mitarbeiter").getResultList();
		return alleMitarbeiter;
	}
	
	public Kunde findKundeById(int id){
		return em.find(Kunde.class, id);
	}
	
	public Kunde createKunde(int id, String vorname, String nachname, String plz, String ort, String strasse, int hausnummer, String email, String benutzername, String passwort)  {
		if(findKundeById(id) == null) {
			Kunde kunde = new Kunde(vorname, nachname, plz, ort, strasse, hausnummer, email, benutzername, passwort);
			em.persist(kunde);	
			return kunde;
		}
		else {
			//Return null, wenn der Benutzername bereits existiert.
			return null;
		}
	}
	
	public void deleteKunde(int id) {
		Kunde kunde = em.find(Kunde.class, id);
		em.remove(kunde);
	}
	
	public List<Kunde> alleKundenAnzeigen() {
		List<Kunde> alleKunden = new ArrayList<Kunde>();
		alleKunden = em.createQuery("SELECT * FROM Kunde").getResultList();
		return alleKunden;
	}	
	
	public Buch findBuchById(int id){
		return em.find(Buch.class, id);
	}
	
	public Buch createBuch(int id, String titel, String autor, Date erscheinungsjahr, int anzahl) {
		if(findBuchById(id) == null) {
			Buch buch = new Buch(titel, autor, erscheinungsjahr, anzahl);
			em.persist(buch);
			return buch;
		}
		else {
			//Return null, wenn der Buchtitel bereits existiert.
			return null;
		}
	}
	
	public void deleteBuch(int id) {
		Buch buch = em.find(Buch.class, id);
		em.remove(buch);
	}
	
	public List<Buch> alleBuecherAnzeigen() {
		List<Buch> alleBuecher = new ArrayList<Buch>();
		alleBuecher = em.createQuery("SELECT * FROM Buch").getResultList();
		return alleBuecher;
	}
}
