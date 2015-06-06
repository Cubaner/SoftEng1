
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Buch implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue
	private int id;
	
	private String titel;
	private String autor;
	private Date erscheinungsjahr;
	private int anzahl;
	
	public Buch() {
		super();
	}
	
	public Buch(String titel, String autor, Date erscheinungsjahr, int anzahl) {
		this.titel = titel;
		this.autor = autor;
		this.erscheinungsjahr = erscheinungsjahr;
		this.anzahl = anzahl;
	}
	
	public String getTitel() {
		return titel;
	}
	
	public int getId() {
		return id;
	}
	
	public String getAutor() {
		return autor;
	}

	public Date getErscheinungsjahr() {
		return erscheinungsjahr;
	}
	
	public int getAnzahl() {
		return anzahl;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setTitel(String titel) {
		this.titel = titel;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void setErscheinungsjahr(Date erscheinungsjahr) {
		this.erscheinungsjahr = erscheinungsjahr;
	}
	
	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}
	
	public void anzahlVerringern() {
		this.anzahl = anzahl - 1;
	}
	
	public void anzahlErhoehen() {
		this.anzahl = anzahl + 1;
	}
}
