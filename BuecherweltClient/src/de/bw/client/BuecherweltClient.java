package de.bw.client;


import de.bw.exception.BuecherweltException;
import de.bw.webservices.Buchverwaltung;
import de.bw.webservices.BuchverwaltungService;
import de.bw.webservices.BuecherweltException_Exception;
import de.bw.webservices.Mitarbeiterverwaltung;
//import de.bw.webservices.MitarbeiterverwaltungService;


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
	private static Buchverwaltung rmSystem;

	/**
	 * @param args
	 * @throws BuecherweltException_Exception 
	 * @throws BuecherweltException 
	 */
	public static void main(String[] args) throws BuecherweltException_Exception {
		//MitarbeiterverwaltungService service = new MitarbeiterverwaltungService();
		BuchverwaltungService service2 = new BuchverwaltungService();
		//remoteSystem = service.getMitarbeiterverwaltungPort();
		rmSystem = service2.getBuchverwaltungPort();
		
		//szenarioJoe();
		buchAnlegen();
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
		
			//remoteSystem.neuenMitarbeiterHinzufuegen(id, vorname, nachname, plz, ort, strasse, hnr, email, benutzer, passwort);
	}
	
	public static void buchAnlegen() throws BuecherweltException_Exception{
	
		String titel = "Titel-test";
		String autor = "autor-test";		
		int erscheinungsjahr = 2012;
		int anzahl = 5;
		
		rmSystem.neuesBuchHinzufuegen(id, titel, autor, erscheinungsjahr, anzahl);
		
		}

}
