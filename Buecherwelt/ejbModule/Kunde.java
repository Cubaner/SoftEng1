
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Kunde extends Person implements Serializable {
	
	@Id @GeneratedValue
	private int id;

	private ArrayList<Ausleihe> ausleihListe;
	
	public Kunde() {
		
	}
	
	public Kunde(String name, String nachname, String plz, String ort, String strasse, int hausnummer, String email, String benutzername, String passwort) {
		super(name, nachname, plz, ort, strasse, hausnummer, email, benutzername, passwort);
		setAusleihListe(new ArrayList<Ausleihe>());
	}
	
	public void addAusleihe(Buch buch) {
		Date leihdatum = new Date();
		Timestamp currentTime = new Timestamp(leihdatum.getTime());
		Ausleihe newAusleihe = new Ausleihe(currentTime, this, buch);
	}

	public ArrayList<Ausleihe> getAusleihListe() {
		return ausleihListe;
	}

	public void setAusleihListe(ArrayList<Ausleihe> ausleihListe) {
		this.ausleihListe = ausleihListe;
	}
}
