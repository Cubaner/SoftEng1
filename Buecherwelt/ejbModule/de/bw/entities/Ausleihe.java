package de.bw.entities;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Jonas Brandhorst/Johann Schäfer
 * Entity Ausleihe repräsentiert eine Ausleihe eines Kunden. Durch die Anbindung an die H2-Datenbank wird hier 
 * eine entsprechende Tabelle erzeugt, welche alle Ausleihen von allen Kunden hält.
 */
@Entity
public class Ausleihe {
	
	@Id @GeneratedValue
	private int id;
	
	private Date leihdatum;
	private Date rueckgabedatum;
	private int kundenId;
	private int buchId;
	
	public Ausleihe() {
		super();
	}
	
	public Ausleihe(Date leihdatum, Date rueckgabedatum, int kundenId, int buchId) {
		this.leihdatum = leihdatum;
		this.rueckgabedatum = rueckgabedatum;
		this.kundenId = kundenId;
		this.buchId = buchId;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Date getLeihdatum() {
		return this.leihdatum;
	}
	
	public void setLeihdatum(Date leihdatum) {
		this.leihdatum = leihdatum;
	}
	
	public Date getRueckgabedatum() {
		return this.rueckgabedatum;
	}
	
	public void setRueckgabedatum(Date rueckgabedatum) {
		this.rueckgabedatum = rueckgabedatum;
	}

	public int getKundenId() {
		return this.kundenId;
	}
	
	public void setKundenId(int kundenId) {
		this.kundenId = kundenId;
	}
	
	public int getBuchId() {
		return this.buchId;
	}
	
	public void setBuchId(int buchId) {
		this.buchId = buchId;
	}
}
