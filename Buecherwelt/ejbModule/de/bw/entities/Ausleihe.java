package de.bw.entities;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author user
 *
 */

@Entity
public class Ausleihe {
	
	@Id @GeneratedValue
	private int id;
	
	private Date leihdatum;
	private Kunde kunde;
	private Buch buch;
	
	public Ausleihe() {
		super();
	}
	
	public Ausleihe(Date leihdatum, Kunde kunde, Buch buch) {
		this.leihdatum = leihdatum;
		this.kunde = kunde;
		this.buch = buch;
	}
	
	public Date getLeihdatum() {
		return this.leihdatum;
	}

	public Kunde getKunde() {
		return this.kunde;
	}
	
	public Buch getBuch() {
		return this.buch;
	}
	
	public void setLeihdatum(Date leihdatum) {
		this.leihdatum = leihdatum;
	}
	
	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}
	
	public void setBuch(Buch buch) {
		this.buch = buch;
	}
}
