package de.bw.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Jonas Brandhorst/Johann Schäfer
 * Die Data-Transfer-Object-Klasse AusleiheTO ist eine Schicht zwischen Webservice und Client und spiegelt Ausleih-Objekte wider.
 */
public class AusleiheTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	int id;
	
	Date leihdatum;
	int kundenId;
	int buchId;
	
	public AusleiheTO() {}
	
	public AusleiheTO(int id, Date leihdatum, int kundenId, int buchId) {
		this.id = id;
		this.leihdatum = leihdatum;
		this.kundenId = kundenId;
		this.buchId = buchId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getLeihdatum() {
		return leihdatum;
	}

	public void setLeihdatum(Date leihdatum) {
		this.leihdatum = leihdatum;
	}

	public int getKundenId() {
		return kundenId;
	}

	public void setKundenId(int kundenId) {
		this.kundenId = kundenId;
	}

	public int getBuchId() {
		return buchId;
	}

	public void setBuchId(int buchId) {
		this.buchId = buchId;
	}
}
