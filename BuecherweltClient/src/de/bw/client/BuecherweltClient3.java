package de.bw.client;


import de.bw.webservices.BuecherweltException_Exception;
import de.bw.webservices.Kundenverwaltung;
import de.bw.webservices.KundenverwaltungService;

/**
 * @author Jonas Brandhorst/Johann Schäfer
 * Der BuecherweltClient3 ist eine Test-Klasse. Hier wird der Logout getestet.
 */
public class BuecherweltClient3 {
		
	private static Kundenverwaltung rmSystemKu;
	
	/**
	 * @param args
	 * @throws BuecherweltException_Exception 
	 * Erzeugen der Webservices für die Tests und ruft die Methode auf
	 */
	public static void main(String[] args) throws BuecherweltException_Exception {
		KundenverwaltungService serviceKu = new KundenverwaltungService();

		rmSystemKu = serviceKu.getKundenverwaltungPort();
		
		szenarioLogout();
	}
		
	/**
	 * Testet das Ausloggen eines Kunden. Kontrolle, ob die Session geschlossen wird.
	 */
	public static void szenarioLogout() {
		rmSystemKu.logout(8);
	}
}
