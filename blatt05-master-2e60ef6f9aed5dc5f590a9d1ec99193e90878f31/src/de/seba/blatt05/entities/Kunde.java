package de.seba.blatt05.entities;

import java.util.Date;
import java.util.List;

public class Kunde {
	protected String name;
	public Date geburtsdatum;
	public List<Konto> konten;
	
	public Kunde(String name, Date geburtsdatum) {
		this.setName(name);
		this.setGeburtsdatum(geburtsdatum);
		this.konten = null;
	}

	private void setGeburtsdatum(Date geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
		
	}
	
	public Date getGeburtsdatum() {
		return this.geburtsdatum;
	}

	private void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public List<Konto> getKonten() {
		return konten;
	}
	
	public void setAccounts(List<Konto> konten) {
		this.konten = konten;
	}
	
	
	
}
