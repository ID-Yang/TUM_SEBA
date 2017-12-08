package de.seba.blatt05.entities;

public class Konto {
	
	public int Anzahl_KONTEN;
	public String kontonummer;
	private double betrag;
	
	Konto (String kontonummer) {
		this.kontonummer= kontonummer;
		this.betrag = 0;	
	}
	
    public double getBetrag() {
    	return this.betrag;
    }
    
    public void fuegeBetragHinzu(double betrag) {
    	this.betrag += betrag;		
   	}
    	
    public void eintferneBetrag(double betrag) {
    	this.betrag -= betrag;  	
    }
 
}



