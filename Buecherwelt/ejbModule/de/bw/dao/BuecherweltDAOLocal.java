package de.bw.dao;
import javax.ejb.Local;

import de.bw.entities.BuecherweltSession;
import de.bw.entities.Kunde;
import de.bw.entities.Mitarbeiter;


@Local
public interface BuecherweltDAOLocal {
	
	public BuecherweltSession findSessionById(int id) ;

	public Kunde findKundeByName(String name);
	
	public Kunde findKundeById(int id);
	
	public int createSession(Kunde kunde);
	
	public int createSession(Mitarbeiter mitarbeiter);
	
	public void closeSession(int id);
	
	public Mitarbeiter findMitarbeiterByName(String benutzername);
	
	public Mitarbeiter findMitarbeiterById(int id);
	

}
