package de.seba.blatt05.entities;

public class Konto {
	/**
	*
	* @author Jigao Luo
	* @author Maoying Yang
	* @since 0.1
	*/
	
	public int Anzahl_KONTEN = 0;
	public String kontonummer;
	private double betrag;

	/**
	* Konto anlegen
	
	* @param kontonummer  
	* 					die kontonummer
	*/
	public Konto (String kontonummer) {

		this.kontonummer= kontonummer;
		this.betrag = 0;
		Anzahl_KONTEN++;
	}
	
	/**
	* Betrag update
	
	* @return 
	* 		liefern den Betrag zurueck
	*/
    public double getBetrag() {
    	return this.betrag;
    }
    
	/**
	* Betrag hinzufuegen
	
	* @param betrag  
	* 					betrag
	*/
    public void fuegeBetragHinzu(double betrag) {
    	this.betrag += betrag;		
   	}
    
    /**
	* Betrag entfernen
	
	* @param betrag  
	* 					betrag
	*/
    public void eintferneBetrag(double betrag) {
    	this.betrag -= betrag;  	
    }
    
    /**
	* liefern Kontonummer zurueck
	
	* @return
	* 			  kontonummber
	*/
    public String getKontonummber() {
    	return this.kontonummer;
    }
 
}



