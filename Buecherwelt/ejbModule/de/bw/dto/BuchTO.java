package de.bw.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Jonas Brandhorst/Johann Schäfer
 * Die Data-Transfer-Object-Klasse BuchtTO ist eine Schicht zwischen Webservice und Client und spiegelt Buch-Objekte wider.
 */
public class BuchTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	int id;
	String titel;
	String autor;
	int erscheinungsjahr;
	int anzahl;
	
	public BuchTO(){}
	
	public BuchTO(int id, String titel, String autor, int erscheinungsjahr, int anzahl){
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

	public int getErscheinungsjahr() {
		return erscheinungsjahr;
	}

	public void setErscheinungsjahr(int erscheinungsjahr) {
		this.erscheinungsjahr = erscheinungsjahr;
	}

	public int getAnzahl() {
		return anzahl;
	}

	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}

}
