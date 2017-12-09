package de.seba.blatt05.logic;

import java.util.*;

import de.seba.blatt05.entities.Konto;
import de.seba.blatt05.entities.Kunde;
import de.seba.blatt05.entities.Transaktion;

public class TransaktionsProzessor {
	
	/** 
	* this is the main entry of the class.
	* @author Jigao Luo
	* @author Maoying Yang
	* @since 0.1
	*/
	
	private Konto quellKonto;
	private Konto zielKonto;
	private double betrag;
	
	public Konto getQuellKonto() {
		return quellKonto;
	}

	public void setQuellKonto(Konto quellKonto) {
		this.quellKonto = quellKonto;
	}

	public Konto getZielKonto() {
		return zielKonto;
	}

	public void setZielKonto(Konto zielKonto) {
		this.zielKonto = zielKonto;
	}

	public double getBetrag() {
		return betrag;
	}

	public void setBetrag(double betrag) {
		this.betrag = betrag;
	}

	public TransaktionsProzessor(Konto quellKonto, Konto zielKonto, double betrag) {
		this.setQuellKonto(quellKonto);
		this.setZielKonto(zielKonto);
		this.setBetrag(betrag);
		transaktionAusfuehrung();
	}
	
	private void transaktionAusfuehrung() {
		if (betrag > quellKonto.getBetrag()) {
			System.out.println("Quellkonto hat zu wenig Geld! Transaktion abgebrochen!");
		} else {
			new Transaktion(this.zielKonto, this.quellKonto, 800);
			System.out.println(this.quellKonto.getKontonummber() + 
					" hat " + this.betrag + " Euro an " + this.zielKonto.getKontonummber()
					+ " ueberwiesen.");
		}
	}

}
