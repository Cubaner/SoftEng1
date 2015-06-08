package de.bw.dao;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import de.bw.entities.BuecherweltSession;
import de.bw.entities.Kunde;
import de.bw.entities.Mitarbeiter;




@Stateless
public class BuecherweltDAO implements BuecherweltDAOLocal{

	@PersistenceContext
	private EntityManager em;
	
	public Kunde findKundeByName(String name){
		return em.find(Kunde.class, name);
	}
	
	public Kunde findKundeById(int id){
		return em.find(Kunde.class, id);
	}
	
	public int createSession(Kunde kunde){
		BuecherweltSession newSession = new BuecherweltSession(kunde);
		em.persist(newSession);
		return newSession.getId();
	}
	
	public void closeSession(int id){
		BuecherweltSession session = em.find(BuecherweltSession.class, id);
		em.remove(session);
	}
	
	public Mitarbeiter findMitarbeiterByName(String name){
		return em.find(Mitarbeiter.class, name);
	}
	
	public Mitarbeiter findMitarbeiterById(int id){
		return em.find(Mitarbeiter.class, id);
	}
}
