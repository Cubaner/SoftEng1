import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebService;

import org.jboss.ws.api.annotation.WebContext;


/**
 * @author user
 *
 */

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
