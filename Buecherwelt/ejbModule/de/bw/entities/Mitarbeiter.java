package de.bw.entities;
import java.io.Serializable;

import javax.persistence.Column;
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
	private int hausnummer;
	private String email;
	@Column(nullable=false)
	private String benutzername;
	private String passwort;

	public Mitarbeiter(){
		super();
	}
		
	public Mitarbeiter(int id, String vorname, String nachname, String plz, String ort, String strasse, int hausnummer, String email, String benutzername, String passwort) {
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
	
	public Mitarbeiter(String vorname, String nachname, String plz, String ort, String strasse, int hausnummer, String email, String benutzername, String passwort) {		
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
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getVorname() {
		return this.vorname;
	}
	
	public String getNachname() {
		return this.nachname;
	}
	
	public String getPlz() {
		return this.plz;
	}

	public String getOrt() {
		return this.ort;
	}
	
	public String getStrasse() {
		return this.strasse;
	}
	
	public int getHausnummer() {
		return this.hausnummer;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getBenutzername() {
		return this.benutzername;
	}
	
	public String getPasswort() {
		return this.passwort;
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
