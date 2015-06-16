package de.bw.client;

import de.bw.exception.BuecherweltException;
import de.bw.webservices.Ausleihe;
import de.bw.webservices.Ausleihverwaltung;
import de.bw.webservices.AusleihverwaltungService;
import de.bw.webservices.Buch;
import de.bw.webservices.Buchverwaltung;
import de.bw.webservices.BuchverwaltungService;
import de.bw.webservices.BuecherweltException_Exception;
import de.bw.webservices.Kunde;
import de.bw.webservices.Kundenverwaltung;
import de.bw.webservices.KundenverwaltungService;
import de.bw.webservices.Mitarbeiterverwaltung;
import de.bw.webservices.MitarbeiterverwaltungService;

/**
 * @author Jonas Brandhorst/Johann Schäfer
 * Der BuecherweltClient ist eine Test-Klasse. Hier werden unter anderem neue Kunden, Mitarbeiter und Bücher erzeugt sowie
 * andere Methoden getestet.
 */
public class BuecherweltClient {
	
	private static int id;
	
	private static Mitarbeiterverwaltung rmSystemMa;
	private static Buchverwaltung rmSystemBu;
	private static Kundenverwaltung rmSystemKu;
	private static Ausleihverwaltung rmSystemAu;
	
	/**
	 * @throws BuecherweltException_Exception 
	 * Erzeugen der Webservices für die Tests und ruft die Methoden auf
	 */
	public static void main(String[] args) throws BuecherweltException_Exception {
		MitarbeiterverwaltungService serviceMa = new MitarbeiterverwaltungService();
		BuchverwaltungService serviceBu = new BuchverwaltungService();
		KundenverwaltungService serviceKu = new KundenverwaltungService();
		AusleihverwaltungService serviceAu = new AusleihverwaltungService();
		
		rmSystemMa = serviceMa.getMitarbeiterverwaltungPort();
		rmSystemBu = serviceBu.getBuchverwaltungPort();
		rmSystemKu = serviceKu.getKundenverwaltungPort();
		rmSystemAu = serviceAu.getAusleihverwaltungPort();
		
		szenarioMitarbeiterHinzufuegen();
		szenarioKundeHinzufuegen();
		szenarioBuchHinzufuegen();
		szenarioAusleiheHinzufuegen();
		szenarioAlleKundenAnzeigen();
	}
	
	/**
	 * @throws BuecherweltException_Exception
	 * Testet das Hinzufügen eines neuen Mitarbeiters
	 */
	private static void szenarioMitarbeiterHinzufuegen() throws BuecherweltException_Exception {
		String vorname = "MaVorname";
		String nachname = "MaNachname";
		String plz = "MaPLZ";
		String ort = "MaOrt";
		String strasse = "MaStrasse";
		int hnr = 6;
		String email = "MaEmail";
		String benutzer = "MaBenutzer";
		String passwort = "MaPasswort";
		
		rmSystemMa.neuenMitarbeiterHinzufuegen(id, vorname, nachname, plz, ort, strasse, hnr, email, benutzer, passwort);
	}
	
	/**
	 * @throws BuecherweltException_Exception
	 * Testet das Hinzufügen eines neuen Kunden
	 */
	private static void szenarioKundeHinzufuegen() throws BuecherweltException_Exception {
		String vorname = "KuVorname";
		String nachname = "KuNachname";
		String plz = "KuPLZ";
		String ort = "KuOrt";
		String strasse = "KuStrasse";
		int hnr = 7;
		String email = "KuEmail";
		String benutzer = "KuBenutzer";
		String passwort = "KuPasswort";
		
		rmSystemKu.kundeHinzufuegen(id, vorname, nachname, plz, ort, strasse, hnr, email, benutzer, passwort);
	}
	
	/**
	 * @throws BuecherweltException_Exception
	 * Testet das Hinzufügen eines neuen Buches
	 */
	public static void szenarioBuchHinzufuegen() throws BuecherweltException_Exception {
		String titel = "BuTitel";
		String autor = "BuAutor";		
		int erscheinungsjahr = 2012;
		int anzahl = 8;
		
		rmSystemBu.neuesBuchHinzufuegen(id, titel, autor, erscheinungsjahr, anzahl);
		}
	
	/**
	 * @throws BuecherweltException_Exception
	 * Testet das Hinzufügen einer neuen Ausleihe
	 */
	public static void szenarioAusleiheHinzufuegen() throws BuecherweltException_Exception {
		Kunde kunde = new Kunde();
		kunde = rmSystemKu.kundeSuchen(2);
		Buch buch = new Buch();
		buch = rmSystemBu.buchSuchen(3);
		Ausleihe ausleihe = new Ausleihe();
		ausleihe = rmSystemAu.neueAusleiheHinzufuegen(id, kunde, buch);
		if(ausleihe != null) {
		rmSystemAu.leihfristVerlaengern(ausleihe.getId());
		}
		else {
			throw new BuecherweltException_Exception("Buch wurde nicht hinzugefügt!");
		}
		}
	
	/**
	 * Testet die Anzeige aller Kunden in der Konsole
	 */
	public static void szenarioAlleKundenAnzeigen() {
		System.out.println("Anzahl in Liste: " + rmSystemKu.getAllKunden().size());
		for(Kunde kunde : rmSystemKu.getAllKunden()) {
			System.out.println("KId: " + kunde.getId() + " KVorname: " + kunde.getVorname() +
					" KNachname: " + kunde.getNachname() + " KPLZ: " + kunde.getPlz() + " KOrt: " + kunde.getOrt() + 
					" KStraße: " + kunde.getStrasse() + " KHNr: " + kunde.getHausnummer() + 
					" KEmail: " + kunde.getEmail() + " KBenutzername: " + kunde.getBenutzername() + 
					" KPasswort: " + kunde.getPasswort());
		}
	}
}
