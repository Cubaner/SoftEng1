package de.bw.entities;
import java.io.Serializable;

public abstract class Person implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String name;
	private String nachname;
	private String plz;
	private String ort;
	private String strasse;
	private int hausnummer;
	private String email;
	private String benutzername;
	private String passwort;
	
	public Person(String name, String nachname, String plz, String ort, String strasse, int hausnummer, String email, String benutzername, String passwort) {

		this.name = name;
		this.nachname = nachname;
		this.plz = plz;
		this.ort = ort;
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.email = email;
		this.benutzername = benutzername;
		this.passwort = passwort;
	}
	
	public Person() {
			
	}
	
	public String getName() {
		return name;
	}
	
	public String getNachname() {
		return nachname;
	}
	
	public String getPlz() {
		return plz;
	}

	public String getOrt() {
		return ort;
	}
	
	public String getStrasse() {
		return strasse;
	}
	
	public int getHausnummer() {
		return hausnummer;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getBenutzername() {
		return benutzername;
	}
	
	public String getPasswort() {
		return passwort;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	
	public void setPlz(String plz) {
		this.plz = plz;
	}
	
	public void setOrt(String ort) {
		this.ort = ort;
	}
	
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	
	public void setHausnummer(int hausnummer) {
		this.hausnummer = hausnummer;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setBenutzername(String benutzername) {
		this.benutzername = benutzername;
	}
	
	public void setPasswort(String passwort) {
		this.passwort = passwort;

	}
}
