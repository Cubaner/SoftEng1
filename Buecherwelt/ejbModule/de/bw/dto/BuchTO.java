package de.bw.dto;

import java.io.Serializable;
import java.util.Date;

public class BuchTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	int id;
	String titel;
	String autor;
	Date erscheinungsjahr;
	int anzahl;
	
	public BuchTO(){}
	
	public BuchTO(int id, String titel, String autor, Date erscheinungsjahr, int anzahl){
		super();
		this.id = id;
		this.titel = titel;
		this.autor = autor;
		this.erscheinungsjahr = erscheinungsjahr;
		this.anzahl = anzahl;	
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Date getErscheinungsjahr() {
		return erscheinungsjahr;
	}

	public void setErscheinungsjahr(Date erscheinungsjahr) {
		this.erscheinungsjahr = erscheinungsjahr;
	}

	public int getAnzahl() {
		return anzahl;
	}

	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}

}
