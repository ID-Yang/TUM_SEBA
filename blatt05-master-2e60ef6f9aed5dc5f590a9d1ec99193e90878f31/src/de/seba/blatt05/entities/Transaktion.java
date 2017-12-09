package de.seba.blatt05.entities;

import java.util.Date;

public class Transaktion {
	
	private double betrag;
	public Date ausfuehrungsdatum;
	private Konto zielKonto;
	private Konto quellKonto;
	
	public Transaktion(Konto zielKonto, Konto quellKonto, double betrag) {
		this.setZielkonto(zielKonto);
		this.setQuellkonto(quellKonto);
		this.setBetrag(betrag);
		this.ausfuehrungsdatum = null;
		this.quellKonto.eintferneBetrag(betrag);
		this.zielKonto.fuegeBetragHinzu(betrag);
	}
	
	public double getBetrag() {
		return this.betrag;
	}
	
	public Konto getZielkonto() {
		return this.zielKonto;
	}
	
	public Konto getQuellkonto() {
		return this.quellKonto;
	}
	
	private void setAusfuehrungsdatum(Date ausfuehrungsdatum) {
		this.ausfuehrungsdatum = ausfuehrungsdatum;		
	}

	private void setZielkonto(Konto zielKonto) {
		this.zielKonto = zielKonto;
	}

	private void setQuellkonto(Konto quellKonto) {
		this.quellKonto = quellKonto;
	}
	
	private void setBetrag(double betrag) {
		this.betrag = betrag;
	}
}
;
