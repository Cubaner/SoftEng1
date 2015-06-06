import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class Mitarbeiterverwaltung {
	
	@PersistenceContext
	private EntityManager em;
	
	public void mitarbeiterHinzufuegen(String name){
		Mitarbeiter mitarbeiter = new Mitarbeiter();
		mitarbeiter.setName(name);
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
