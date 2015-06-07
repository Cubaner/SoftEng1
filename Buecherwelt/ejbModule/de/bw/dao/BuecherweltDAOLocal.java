package de.bw.dao;
import javax.ejb.Local;

import de.bw.entities.Kunde;
import de.bw.entities.Mitarbeiter;


@Local
public interface BuecherweltDAOLocal {

	public Kunde findKundeByName(String name);
	
	public Kunde findKundeById(int id);
	
	public int createSession(Kunde kunde);
	
	public void closeSession(int id);
	
	public Mitarbeiter findMitarbeiterByName(String name);
	
	public Mitarbeiter findMitarbeiterById(int id);
	

}
