package de.bw.entities;

import java.io.Serializable;
import java.util.ArrayList;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table
public class Kunde implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=GenerationType.TABLE)
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
	
	private ArrayList<Ausleihe> ausleihListe;
	
	public Kunde(String vorname, String nachname, String plz, String ort, String strasse, int hausnummer, String email, String benutzername, String passwort) {

		this.vorname = vorname;
		this.nachname = nachname;
		this.plz = plz;
		this.ort = ort;
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.email = email;
		this.benutzername = benutzername;
		this.passwort = passwort;
		setAusleihListe(new ArrayList<Ausleihe>());
	}
		
	public Kunde() {
		super();
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	/**public void addAusleihe(Buch buch) {
		if(buch.getAnzahl() >= 1) {
		Date leihdatum = new Date();
		Timestamp currentTime = new Timestamp(leihdatum.getTime());
		Ausleihe newAusleihe = new Ausleihe(currentTime, this, buch);
		buch.anzahlVerringern();
		ausleihListe.add(newAusleihe);
		}
		else {
			System.out.println("Nicht genügend Bücher im Bestand!");
		}
	}**/

	public ArrayList<Ausleihe> getAusleihListe() {
		return this.ausleihListe;
	}

	public void setAusleihListe(ArrayList<Ausleihe> ausleihListe) {
		this.ausleihListe = ausleihListe;
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
