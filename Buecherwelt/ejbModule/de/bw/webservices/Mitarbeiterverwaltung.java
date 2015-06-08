package de.bw.webservices;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import de.bw.entities.Mitarbeiter;

@Stateless
public class Mitarbeiterverwaltung {
	
	@PersistenceContext
	private EntityManager em;
	
	public void mitarbeiterHinzufuegen(String vorname){
		Mitarbeiter mitarbeiter = new Mitarbeiter();
		mitarbeiter.setVorname(vorname);
		em.persist(mitarbeiter);
		
	}
	
	public void mitarbeiterLoeschen(){
		
	}
	
	public Mitarbeiter mitarbeiterSuchen(){
		return null;
	}
	
	public List<Mitarbeiter> getAllMitarbeiter(){
		return null;
		
	}

}
