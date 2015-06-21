package de.bw.dao;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.jboss.logging.Logger;

import de.bw.entities.Ausleihe;
import de.bw.entities.Buch;
import de.bw.entities.BuecherweltSession;
import de.bw.entities.Kunde;
import de.bw.entities.Mitarbeiter;

/**
 * @author Jonas Brandhorst/Johann Schäfer
 * Klasse als letzte Schicht zur Persistierung
 */

@Stateless
public class BuecherweltDAO implements BuecherweltDAOLocal{

	@PersistenceContext
	private EntityManager em;
	
	private static final Logger logger = Logger.getLogger(BuecherweltDAO.class);
	
	 
	/** 
	 * @param benutzername 
	 * @param passwort
	 * Login für Mitarbeiter. Der Benutzername wird gesucht und das Passwort wird mit dem Passwort aus der Mitarbeiter-Tabelle verglichen.
	 */
	@Override
	public Mitarbeiter mitarbeiterLogin(String benutzername, String passwort){
		//Direkte DB-Abfrage um das Password nicht in dem Objekt zu haben
		List<Mitarbeiter> mitarbeiter = em.createQuery("SELECT m FROM Mitarbeiter m WHERE benutzername like ?0").setParameter(0, benutzername).getResultList();
		if(mitarbeiter.size() > 0){
			if(passwort.equals(mitarbeiter.get(0).getPasswort())){
				logger.info("Mitarbeiterlogin: " + benutzername);
				int id = mitarbeiter.get(0).getId();
				Mitarbeiter newMitarbeiter = findMitarbeiterById(id);
				return newMitarbeiter;
			}
		}
		return null;	
	}
	
	/** 
	 * @param benutzername 
	 * @param passwort
	 * Login für Kunden. Der Benutzername wird gesucht und das Passwort wird mit dem Passwort aus der Kunden-Tabelle verglichen.
	 */
	@Override
	public Kunde kundenLogin(String benutzername, String passwort){
		//Direkte DB-Abfrage um das Password nicht in dem Objekt zu haben
		List<Kunde> kunden = em.createQuery("SELECT k FROM Kunde k WHERE benutzername like ?0").setParameter(0, benutzername).getResultList();
		if(kunden.size() > 0){
			if(passwort.equals(kunden.get(0).getPasswort())){
				logger.info("Kundenlogin: " + benutzername);
				int id = kunden.get(0).getId();
				Kunde kunde = findKundeById(id);
				return kunde;
			}
		}
		return null;	
	}
	
	/** 
	 * Suche nach Session mit entsprechender Id
	 */
	public BuecherweltSession findSessionById(int id) {
		return em.find(BuecherweltSession.class, id);
	}
	
	/** 
	 * Erzeugung einer Kunden-Session
	 */
	public int createSession(Kunde kunde){
		BuecherweltSession newSession = new BuecherweltSession(kunde);
		em.persist(newSession);
		return newSession.getId();
	}
	
	/** 
	 * Erzeugung einer Mitarbeiter-Session
	 */
	public int createSession(Mitarbeiter mitarbeiter){
		BuecherweltSession newSession = new BuecherweltSession(mitarbeiter);
		em.persist(newSession);
		return newSession.getId();
	}
	
	/** 
	 * Löschen einer Session aus der Tabelle anhand einer Session-Id
	 */
	public void closeSession(int id){
		BuecherweltSession session = em.find(BuecherweltSession.class, id);
		em.remove(session);
	}
	
	/** 
	 * Suche nach einem Mitarbeiter mit einer Mitarbeiter-Id
	 */
	public Mitarbeiter findMitarbeiterById(int id){
		return em.find(Mitarbeiter.class, id);
	}

	/** 
	 * @return Mitarbeiter
	 * Erzeugung eines neuen Mitarbeiters mit allen Parametern
	 */
	public Mitarbeiter createMitarbeiter(int id, String vorname, String nachname, String plz, String ort, String strasse, int hausnummer, String email, String benutzername, String passwort)  {
		if(findMitarbeiterById(id) == null) {
			logger.info("ID: " + id);
			Mitarbeiter mitarbeiter = new Mitarbeiter(vorname, nachname, plz, ort, strasse, hausnummer, email, benutzername, passwort);
			em.persist(mitarbeiter);	
			return mitarbeiter;
		}
		else {
			//Return null, wenn der Mitarbeiter bereits existiert.
			return null;
		}
	}
	
	/** 
	 * Löschen eines Mitarbeiters aus der Tabelle
	 */
	public void deleteMitarbeiter(int id) {
		Mitarbeiter mitarbeiter = findMitarbeiterById(id);
		em.remove(mitarbeiter);
	}

	/** 
	 * @return List<Mitarbeiter>
	 * Ausgabe aller Mitarbeiter
	 */
	public List<Mitarbeiter> alleMitarbeiterAnzeigen() {
		List<Mitarbeiter> alleMitarbeiter = new ArrayList<Mitarbeiter>();
		alleMitarbeiter = em.createQuery("SELECT m FROM Mitarbeiter m").getResultList();
		return alleMitarbeiter;
	}
	
	/** 
	 * Suche nach einem Kunden mit einer Kunden-Id
	 */
	public Kunde findKundeById(int id){
		return em.find(Kunde.class, id);
	}
	
	/** 
	 * @return Kunde
	 * Erzeugung eines neuen Kunden mit allen Parametern
	 */
	public Kunde createKunde(int id, String vorname, String nachname, String plz, String ort, String strasse, int hausnummer, String email, String benutzername, String passwort)  {
		if(findKundeById(id) == null) {
			Kunde kunde = new Kunde(vorname, nachname, plz, ort, strasse, hausnummer, email, benutzername, passwort);
			em.persist(kunde);	
			return kunde;
		}
		else {
			//Return null, wenn der Kunde bereits existiert.
			return null;
		}
	}
	
	/** 
	 * Löschen eines Kunden aus der Tabelle
	 */
	public void deleteKunde(int id) {
		Kunde kunde = findKundeById(id);
		em.remove(kunde);
	}
	
	/** 
	 * @return List<Kunde>
	 * Ausgabe aller Kunde
	 */
	public List<Kunde> alleKundenAnzeigen() {
		List<Kunde> alleKunden = new ArrayList<Kunde>();
		alleKunden = em.createQuery("SELECT k FROM Kunde k").getResultList();
		return alleKunden;
	}	
	
	/** 
	 * Suche nach einem Buch mit einer Buch-Id
	 */
	public Buch findBuchById(int id){
		return em.find(Buch.class, id);
	}
	
	public Buch findBuchByTitel(String titel){
		return em.find(Buch.class, titel);
	}
	
	/** 
	 * @return Buch
	 * Erzeugung eines neuen Buches mit allen Parametern
	 */
	public Buch createBuch(int id, String titel, String autor, int erscheinungsjahr, int anzahl) {
		if(findBuchById(id) == null) {
			
			Buch buch = new Buch(id, titel, autor, erscheinungsjahr, anzahl);
			em.persist(buch);
			return buch;
		}
		else {
			//Return null, wenn das Buch bereits existiert.
			return null;
		}
	}
	
	/** 
	 * Löschen eines Buches aus der Tabelle
	 */
	public void deleteBuch(int id) {
		Buch buch = findBuchById(id);
		em.remove(buch);
	}
	
	/** 
	 * @return List<Buch>
	 * Ausgabe aller Bücher
	 */
	public List<Buch> alleBuecherAnzeigen() {
		List<Buch> alleBuecher = new ArrayList<Buch>();
		alleBuecher = em.createQuery("SELECT b FROM Buch b").getResultList();
		return alleBuecher;
	}
	
	/** 
	 * Suche nach einer Ausleihe mit einer Ausleih-Id
	 */
	public Ausleihe findAusleiheById(int id) {
		return em.find(Ausleihe.class, id);
	}
	
	/** 
	 * @return Ausleihe
	 * Erzeugung einer neuen Ausleihe mit allen Parametern
	 */
	public Ausleihe createAusleihe(int id, Date leihdatum, int kundenId, int buchId) {
		if(findAusleiheById(id) == null) {
			Ausleihe ausleihe = new Ausleihe(leihdatum, kundenId, buchId);
			em.persist(ausleihe);
			return ausleihe;
		}
		else {
			//Return null, wenn die Ausleihe bereits existiert.
			return null;
		}
	}
	
	/** 
	 * Löschen einer Ausleihe aus der Tabelle
	 */
	public void deleteAusleihe(int id) {
		Ausleihe ausleihe = findAusleiheById(id);
		em.remove(ausleihe);
	}
	
	/** 
	 * @return List<Ausleihe>
	 * Ausgabe aller Ausleihen
	 */
	public List<Ausleihe> alleAusleihenAnzeigen() {
		List<Ausleihe> alleAusleihen = new ArrayList<Ausleihe>();
		alleAusleihen = em.createQuery("SELECT a FROM Ausleihe a").getResultList();
		return alleAusleihen;
	}
}
