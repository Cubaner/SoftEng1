package de.bw.dto;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import de.bw.entities.Ausleihe;
import de.bw.entities.Buch;
import de.bw.entities.Kunde;
import de.bw.entities.Mitarbeiter;

@Stateless
public class ErzeugeDTOs {

  public MitarbeiterTO createMitarbeiterDTO(Mitarbeiter mitarbeiter) {
	  MitarbeiterTO mitarbeiterTO = new MitarbeiterTO();
	  mitarbeiterTO.setId(mitarbeiter.getId());
	  mitarbeiterTO.setVorname(mitarbeiter.getVorname());
	  mitarbeiterTO.setNachname(mitarbeiter.getNachname());
	  mitarbeiterTO.setPlz(mitarbeiter.getPlz());
	  mitarbeiterTO.setOrt(mitarbeiter.getOrt());
	  mitarbeiterTO.setStrasse(mitarbeiter.getStrasse());
	  mitarbeiterTO.setHausnummer(mitarbeiter.getHausnummer());
	  mitarbeiterTO.setEmail(mitarbeiter.getEmail());
	  mitarbeiterTO.setBenutzername(mitarbeiter.getBenutzername());
	  mitarbeiterTO.setPasswort(mitarbeiter.getPasswort());
	  return mitarbeiterTO;
  }
	
  public List<MitarbeiterTO> createMitarbeiterDTO(List<Mitarbeiter> mitarbeiter) {
	  List<MitarbeiterTO> mitarbeiterTOListe = new ArrayList<>();
	  for (Mitarbeiter newMitarbeiter : mitarbeiter) {
		  mitarbeiterTOListe.add(this.createMitarbeiterDTO(newMitarbeiter));
	  }
	  return mitarbeiterTOListe;
  }

  public KundeTO createKundenDTO(Kunde kunde) {
	  KundeTO kundeTO = new KundeTO();
	  kundeTO.setId(kunde.getId());
	  kundeTO.setVorname(kunde.getVorname());
	  kundeTO.setNachname(kunde.getNachname());
	  kundeTO.setPlz(kunde.getPlz());
	  kundeTO.setOrt(kunde.getOrt());
	  kundeTO.setStrasse(kunde.getStrasse());
	  kundeTO.setHausnummer(kunde.getHausnummer());
	  kundeTO.setEmail(kunde.getEmail());
	  kundeTO.setBenutzername(kunde.getBenutzername());
	  kundeTO.setPasswort(kunde.getPasswort());
	  return kundeTO;
  }
  
  public List<KundeTO> createKundenDTO(List<Kunde> kunden) {
	  List<KundeTO> kundenTOListe = new ArrayList<>();
	  for (Kunde newKunde : kunden) {
		  kundenTOListe.add(this.createKundenDTO(newKunde));
	  }
	  return kundenTOListe;
  }
  
  public BuchTO createBuchDTO(Buch buch) {
	  BuchTO buchTO = new BuchTO();
	  buchTO.setId(buch.getId());
	  buchTO.setTitel(buch.getTitel());
	  buchTO.setAutor(buch.getAutor());
	  buchTO.setErscheinungsjahr(buch.getErscheinungsjahr());
	  buchTO.setAnzahl(buch.getAnzahl());
	  return buchTO;
  }
  
  public List<BuchTO> createBuchDTO(List<Buch> buecher) {
	  List<BuchTO> buchTOListe = new ArrayList<>();
	  for (Buch newBuch : buecher) {
		  buchTOListe.add(this.createBuchDTO(newBuch));
	  }
	  return buchTOListe;
  }
  
  public AusleiheTO createAusleiheDTO(Ausleihe ausleihe) {
	  AusleiheTO ausleiheTO = new AusleiheTO();
	  ausleiheTO.setId(ausleihe.getId());
	  ausleiheTO.setLeihdatum(ausleihe.getLeihdatum());
	  ausleiheTO.setKundenId(ausleihe.getKundenId());
	  ausleiheTO.setBuchId(ausleihe.getBuchId());
	  return ausleiheTO;
  }
  
  public List<AusleiheTO> createAusleiheDTO(List<Ausleihe> ausleihen) {
	  List<AusleiheTO> ausleiheTOListe = new ArrayList<>();
	  for (Ausleihe newAusleihe : ausleihen) {
		  ausleiheTOListe.add(this.createAusleiheDTO(newAusleihe));
	  }
	  return ausleiheTOListe;
  }
  
  public SessionTO createSessionDTO(int id) {
	  SessionTO sessionTO = new SessionTO();
	  sessionTO.setId(id);
	  return sessionTO;
  }
}
