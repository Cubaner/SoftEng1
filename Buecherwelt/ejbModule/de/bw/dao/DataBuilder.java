package de.bw.dao;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import de.bw.entities.Mitarbeiter;

/**
 * Klasse KontoRegistry als Singleton. Alle vorhandenen Konto-Objekte sollen hier registriert werden, damit die KontoRegistry
 * als zentrales Kontoverzeichnis fungieren kann.
 */
@Startup
@Singleton
public class DataBuilder {
		
	@PersistenceContext
	EntityManager em;
	
	@Resource
	private int id, id2;
		
	@Resource
	private String vorname, nachname, plz, ort, strasse, hausnummer, email, benutzername, passwort;
	
	@Resource
	private String vorname2, nachname2, plz2, ort2, strasse2, hausnummer2, email2, benutzername2, passwort2;

	
	@PostConstruct
	private void init() {

		//erzeuge ein paar Beispieldaten zu Kunden und Konten, falls sie noch nicht in der DB vorhanden sind.
		Mitarbeiter administrator = em.find(Mitarbeiter.class, id);
		if (administrator == null) {
			//Kunde noch nicht vorhanden, also mit neuem Konto anlegen:
			administrator = new Mitarbeiter(id, vorname, nachname, plz, ort, strasse, hausnummer, email, benutzername, passwort);
			em.persist(administrator);
		}
		
		//erzeuge ein paar Beispieldaten zu Kunden und Konten, falls sie noch nicht in der DB vorhanden sind.
		Mitarbeiter test = em.find(Mitarbeiter.class, id);
		if (test == null) {
			//Kunde noch nicht vorhanden, also mit neuem Konto anlegen:
			test = new Mitarbeiter(id, vorname2, nachname2, plz2, ort2, strasse2, hausnummer2, email2, benutzername2, passwort2);
			em.persist(test);
		}
	}	
}