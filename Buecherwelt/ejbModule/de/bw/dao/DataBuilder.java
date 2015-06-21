package de.bw.dao;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.jboss.logging.Logger;

import de.bw.entities.Buch;
import de.bw.entities.Kunde;
import de.bw.entities.Mitarbeiter;

/**
 * @author Jonas Brandhorst/Johann Schäfer
 * Klasse zum Erzeugen von Testdaten beim Start des Severs mit Hilfe der ejb-jar-Datei
 */
@Startup
@Singleton
public class DataBuilder {
	
	/**
	 * Der Logger wird verwendet, um Log-Ausgaben zu erstellen
	 */
	private static final Logger logger = Logger.getLogger(DataBuilder.class);
		
	@PersistenceContext
	EntityManager em;
	
	@Resource
	private int id, erscheinungsjahr, anzahl;
	
	@Resource
	private int hausnummer, hausnummer2;
	
	@Resource
	private String vorname, nachname, plz, ort, strasse, email, benutzername, passwort;
	
	@Resource
	private String vorname2, nachname2, plz2, ort2, strasse2, email2, benutzername2, passwort2;

	@Resource
	private String titel, autor;
	
	
	/**
	 * erzeugt Beispiel-Daten anhand von der ejb-jar-Datei
	 */
	
	@PostConstruct
	private void init() {
		
		Mitarbeiter administrator = em.find(Mitarbeiter.class, id);
		if (administrator == null) {
			administrator = new Mitarbeiter(vorname, nachname, plz, ort, strasse, hausnummer, email, benutzername, passwort);
			em.persist(administrator);
			logger.info("Initial Administrator wurde als Mitarbeiter erzeugt.");
		}
		
		Kunde kunde = em.find(Kunde.class, id);
			if (kunde == null) {
				kunde = new Kunde(vorname2, nachname2, plz2, ort2, strasse2, hausnummer2, email2, benutzername2, passwort2);
				em.persist(kunde);
				logger.info("Initial Test-Kunde wurde erzeugt.");
			}
			
		Buch buch = em.find(Buch.class, id);
			if (buch == null) {
				buch = new Buch(id, titel, autor, erscheinungsjahr, anzahl);
				em.persist(buch);
				logger.info("Initial Test-Buch wurde erzeugt.");
		}
	}
}