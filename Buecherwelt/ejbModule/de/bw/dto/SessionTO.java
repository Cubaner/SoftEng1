package de.bw.dto;

import java.io.Serializable;
import java.util.Date;

public class SessionTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	int id;
	
	public SessionTO(){}
	
	public SessionTO(int id){
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
