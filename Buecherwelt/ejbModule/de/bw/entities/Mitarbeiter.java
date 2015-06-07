package de.bw.entities;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Mitarbeiter implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue
	private int id;
	
	private String vorname;
	private String nachname;
	private String plz;
	private String ort;
	private String strasse;
	private String hausnummer;
	private String email;
	private String benutzername;
	private String passwort;

	public Mitarbeiter(){

	}
	
	//public Mitarbeiter(String name, String nachname, String plz, String ort, String strasse, int hausnummer, String email, String benutzername, String passwort) {
	//	super(name, nachname, plz, ort, strasse, hausnummer, email, benutzername, passwort);
	//}
	
	public Mitarbeiter(int id, String vorname, String nachname, String plz, String ort, String strasse, String hausnummer, String email, String benutzername, String passwort) {
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
	
	public Mitarbeiter(String vorname, String nachname, String plz, String ort, String strasse, String hausnummer, String email, String benutzername, String passwort) {		
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
	
	public String getHausnummer() {
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
	

	public void setVorname(String vorname) {
		this.vorname = vorname;
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
	
	public void setHausnummer(String hausnummer) {
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
