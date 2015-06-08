package de.bw.entities;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class BuecherweltSession {
	
	@Id @GeneratedValue
	private int id;
	private String username;
	private Date creationTime;
	
	
	
	public BuecherweltSession(Kunde username) {
		this.username = username.getBenutzername();
		this.creationTime = new Date();
	}
	
	public BuecherweltSession(Mitarbeiter mitarbeiter) {
		this.username = mitarbeiter.getBenutzername();
		this.creationTime = new Date();
	}
	
	public BuecherweltSession() {
		this.creationTime = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}
}
