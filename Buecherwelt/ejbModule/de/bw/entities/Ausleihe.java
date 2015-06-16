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
	private int kundenId;
	private int buchId;
	
	public Ausleihe() {
		super();
	}
	
	public Ausleihe(Date leihdatum, int kundenId, int buchId) {
		this.leihdatum = leihdatum;
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

	public int getKundenId() {
		return this.kundenId;
	}
	
	public int getBuchId() {
		return this.buchId;
	}
	
	public void setLeihdatum(Date leihdatum) {
		this.leihdatum = leihdatum;
	}
	
	public void setKundenId(int kundenId) {
		this.kundenId = kundenId;
	}
	
	public void setBuchId(int buchId) {
		this.buchId = buchId;
	}
}
