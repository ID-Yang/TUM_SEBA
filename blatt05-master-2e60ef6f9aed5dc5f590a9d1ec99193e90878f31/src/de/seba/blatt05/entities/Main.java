package de.seba.blatt05.entities;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import de.seba.blatt05.logic.TransaktionsProzessor;

// 1 2 Konten mit starkapital geeriert 
// 2 einen beliebigen betrag [
public class Main {
	
	public static void main(String[] args) {
		Konto a = new Konto("0000"); /**0000 ist kontonummer von konto a*/
		System.out.println(a.getKontonummber() + " Konto a hat 1000 Euro als Startkapital.");
		a.fuegeBetragHinzu(1000);
		Konto b = new Konto("0001");  /**0001 ist kontonummer von konto b*/
		
		List<Konto> kontenA = new LinkedList<Konto>(); 
		kontenA.add(a);
		Date dateA = null;
		Kunde kundeA = new Kunde("a", dateA);  /**a ist name von kundeA, und dateA ist geburtsdatum von kundeA*/
		kundeA.setAccounts(kontenA);
		List<Konto> kontenB = new LinkedList<Konto>();
		kontenB.add(b);
		Date dateB = null;
		Kunde kundeB = new Kunde("b", dateB);/**b ist name von kundeB, und dateB ist geburtsdatum von kundeB*/
		kundeB.setAccounts(kontenB);				
		System.out.println(b.getKontonummber() + " Konto b hat 2000 Euro als Startkapital.");
		b.fuegeBetragHinzu(2000);
		new TransaktionsProzessor(b, a, 800);
		System.out.println(a.getKontonummber() + " hat " + a.getBetrag() + " Euro.");
		System.out.println(b.getKontonummber() + " hat " + b.getBetrag() + " Euro.");

	}

}
