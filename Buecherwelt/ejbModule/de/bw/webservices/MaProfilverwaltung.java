package de.bw.webservices;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import org.jboss.ws.api.annotation.WebContext;

import de.bw.dao.BuecherweltDAOLocal;
import de.bw.entities.Mitarbeiter;
import de.bw.exception.BuecherweltException;

/**
 * @author user
 *
 */
@WebService
@WebContext(contextRoot="/buecherwelt")
@Stateless
public class MaProfilverwaltung {
	
	@EJB(beanName = "BuecherweltDAO", beanInterface = de.bw.dao.BuecherweltDAOLocal.class)
	private BuecherweltDAOLocal dao;
	
	/**public void vornameAendern(int id, String vorname) throws BuecherweltException {
		Mitarbeiter mitarbeiterNeu = dao.findMitarbeiterById(id);
		dao.deleteMitarbeiter(id);
		String nachname = mitarbeiterNeu.getNachname();
		String plz = mitarbeiterNeu.getPlz();
		String ort = mitarbeiterNeu.getOrt();
		String strasse = mitarbeiterNeu.getStrasse();
		int hausnummer = mitarbeiterNeu.getHausnummer();
		String email = mitarbeiterNeu.getEmail();
		String benutzername = mitarbeiterNeu.getBenutzername();
		String passwort = mitarbeiterNeu.getPasswort();
		Mitarbeiterverwaltung mitarbeiterverwaltung = new Mitarbeiterverwaltung();
		mitarbeiterverwaltung.neuenMitarbeiterHinzufuegen(vorname, nachname, plz, ort, strasse, hausnummer, email, benutzername, passwort);
	}**/
}