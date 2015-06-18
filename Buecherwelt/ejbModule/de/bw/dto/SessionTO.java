package de.bw.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Jonas Brandhorst/Johann Schäfer
 * Die Data-Transfer-Object-Klasse SessionTO ist eine Schicht zwischen Webservice und Client und spiegelt Session-Objekte wider.
 */
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
