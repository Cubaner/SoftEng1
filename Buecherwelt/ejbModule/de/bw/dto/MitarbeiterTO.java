package de.bw.dto;

import java.io.Serializable;

/**
 * @author Jonas Brandhorst/Johann Schäfer
 * Die Data-Transfer-Object-Klasse MitarbeiterTO ist eine Schicht zwischen Webservice und Client und spiegelt Mitarbeiter-Objekte wider.
 */
public class MitarbeiterTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String vorname;
	private String nachname;
	private String plz;
	private String ort;
	private String strasse;
	private int hausnummer;
	private String email;
	private String benutzername;
	private String passwort;

	public MitarbeiterTO(){}
	
	public MitarbeiterTO(int id, String vorname, String nachname, String plz, String ort, String strasse, int hausnummer, String email, String benutzername, String passwort){
		this.id = id;
		this.vorname = vorname;
		this.nachname = nachname;
		this.plz = plz;
		this.ort = ort;
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.email = email;
		this.benutzername = benutzername;
		this.passwort = passwort;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public int getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(int hausnummer) {
		this.hausnummer = hausnummer;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBenutzername() {
		return benutzername;
	}

	public void setBenutzername(String benutzername) {
		this.benutzername = benutzername;
	}

	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}
}
