package de.bw.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Buch implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	
	private String titel;
	private String autor;
	private int erscheinungsjahr;
	private int anzahl;
	
	public Buch() {
		super();
	}
	
	public Buch(String titel, String autor, int erscheinungsjahr, int anzahl) {
		this.titel = titel;
		this.autor = autor;
		this.erscheinungsjahr = erscheinungsjahr;
		this.anzahl = anzahl;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitel() {
		return this.titel;
	}
	
	public String getAutor() {
		return this.autor;
	}

	public int getErscheinungsjahr() {
		return this.erscheinungsjahr;
	}
	
	public int getAnzahl() {
		return this.anzahl;
	}
	
	public void setTitel(String titel) {
		this.titel = titel;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void setErscheinungsjahr(int erscheinungsjahr) {
		this.erscheinungsjahr = erscheinungsjahr;
	}
	
	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}
}
