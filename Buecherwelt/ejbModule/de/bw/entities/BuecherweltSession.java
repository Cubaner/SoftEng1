package de.bw.entities;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class BuecherweltSession {
	
	@Id @GeneratedValue
	private int id;
	
	private String benutzername;
	private Date creationTime;
	
	public BuecherweltSession(Kunde kunde) {
		this.benutzername = kunde.getBenutzername();
		this.creationTime = new Date();
	}
	
	public BuecherweltSession(Mitarbeiter mitarbeiter) {
		this.benutzername = mitarbeiter.getBenutzername();
		this.creationTime = new Date();
	}
	
	public BuecherweltSession() {
		this.creationTime = new Date();
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBenutzername() {
		return this.benutzername;
	}

	public void setBenutzername(String benutzername) {
		this.benutzername = benutzername;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}
}
