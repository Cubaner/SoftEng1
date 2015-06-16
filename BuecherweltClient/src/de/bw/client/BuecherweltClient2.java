package de.bw.client;


import de.bw.exception.BuecherweltException;
import de.bw.webservices.Ausleihe;
import de.bw.webservices.Ausleihverwaltung;
import de.bw.webservices.AusleihverwaltungService;
import de.bw.webservices.BuecherweltException_Exception;
import de.bw.webservices.Kundenverwaltung;
import de.bw.webservices.KundenverwaltungService;

/**
 * @author Jonas Brandhorst/Johann Schäfer
 * Der BuecherweltClient2 ist eine Test-Klasse. Hier werden die Methoden ausleihenByKundenId, kundeBearbeiten und ein Kundenlogin auf Funktion getestet.
 */
public class BuecherweltClient2 {
		
	private static Ausleihverwaltung rmSystemAu;
	private static Kundenverwaltung rmSystemKu;
	
	/**
	 * @throws BuecherweltException_Exception 
	 * Erzeugen der Webservices für die Tests und ruft die Methoden auf
	 */
	public static void main(String[] args) throws BuecherweltException_Exception {
		AusleihverwaltungService serviceAu = new AusleihverwaltungService();
		KundenverwaltungService serviceKu = new KundenverwaltungService();

		rmSystemAu = serviceAu.getAusleihverwaltungPort();
		rmSystemKu = serviceKu.getKundenverwaltungPort();
		
		szenarioAusleihenByKundenIdAnzeigen();
		szenarioKundeBearbeiten();
		szenarioKundenLogin();
	}
		
		/**
		 * @throws BuecherweltException_Exception
		 * Testet die Ausgabe aller Ausleihen eines bestimmten Kunden
		 */
		public static void szenarioAusleihenByKundenIdAnzeigen() throws BuecherweltException_Exception{
			System.out.println(rmSystemAu.getAusleihenByKundenId(2).size());
			for(Ausleihe ausleihe : rmSystemAu.getAusleihenByKundenId(2)) {
				System.out.println("AusleihId: " + ausleihe.getId() + " KundenId: " + ausleihe.getKundenId() + " BuchId: " + ausleihe.getBuchId());
			}
		}
		
		/**
		 * Testet das Bearbeiten eines in der Datenbank vorhandenen Kunden
		 */
		public static void szenarioKundeBearbeiten() {
			String vorname = "neuerVornameKunde";
			String nachname = "neuerNachnameKunde";
			String plz = "neuePLZKunde";
			String ort = "neuerOrtKunde";
			String strasse = "neueStrasseKunde";
			int hausnummer = 18;
			String email = "neueEmailAdresseKunde";
			String benutzer = "neuerBenutzerKunde";
			String passwort = "neuePasswortKunde";
			
			rmSystemKu.kundeBearbeiten(2, vorname, nachname, plz, ort, strasse, hausnummer, email, benutzer, passwort);
			
		}
		
		/**
		 * Testet das Einloggen eines Kunden
		 */
		public static void szenarioKundenLogin() {
			String benutzer = "neuerBenutzerKunde";
			String passwort = "neuePasswortKunde";
			boolean erfolgreich = rmSystemKu.loginKunde(benutzer, passwort);
			System.out.println(erfolgreich);
		}
}
