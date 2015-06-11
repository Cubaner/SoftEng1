package de.bw.client;
import de.bw.webservices.BuecherweltException_Exception;
import de.bw.webservices.Mitarbeiterverwaltung;
import de.bw.webservices.MitarbeiterverwaltungService;



/**
 * 
 */

/**
 * @author user
 *
 */
public class BuecherweltClient {
	
	private static int id;
	
	private static Mitarbeiterverwaltung remoteSystem;

	/**
	 * @param args
	 * @throws BuecherweltException_Exception 
	 */
	public static void main(String[] args) throws BuecherweltException_Exception {
		MitarbeiterverwaltungService service = new MitarbeiterverwaltungService();
		remoteSystem = service.getMitarbeiterverwaltungPort();
		szenarioJoe();
	}
	
	private static void szenarioJoe() throws BuecherweltException_Exception {
		String vorname = "vorname";
		String nachname = "nachname";
		String plz = "plz";
		String ort = "ort";
		String strasse = "strasse";
		String hnr = "6";
		String email = "email";
		String benutzer = "benutzer";
		String passwort = "passwort";
		
			remoteSystem.neuenMitarbeiterHinzufuegen(id, vorname, nachname, plz, ort, strasse, hnr, email, benutzer, passwort);

	}

}
