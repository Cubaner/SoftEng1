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
	private int id;
		
	@Resource
	private String vorname, nachname, plz, ort, strasse, hausnummer, email, benutzername, passwort;

	@PostConstruct
	private void init() {

		//erzeuge ein paar Beispieldaten zu Kunden und Konten, falls sie noch nicht in der DB vorhanden sind.
		Mitarbeiter administrator = em.find(Mitarbeiter.class, id);
		if (administrator == null) {
			//Kunde noch nicht vorhanden, also mit neuem Konto anlegen:
			administrator = new Mitarbeiter(id, vorname, nachname, plz, ort, strasse, hausnummer, email, benutzername, passwort);
			em.persist(administrator);
		}
	}	
}