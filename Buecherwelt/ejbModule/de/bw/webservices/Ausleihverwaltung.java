package de.bw.webservices;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebService;

import org.jboss.ws.api.annotation.WebContext;

import de.bw.entities.Ausleihe;
import de.bw.entities.Buch;


/**
 * @author user
 *
 */

@WebService
@WebContext(contextRoot="/buecherwelt")
@Stateless
public class Ausleihverwaltung {
	
	public Ausleihverwaltung() {
	}
	
	public void leihfristVerlaengern() {
		
	}
	
	public List<Ausleihe> getAusgelieheneBuecher() {
		List<Ausleihe> alleAusleihen = new ArrayList<Ausleihe>();
		return alleAusleihen;
	}
}
