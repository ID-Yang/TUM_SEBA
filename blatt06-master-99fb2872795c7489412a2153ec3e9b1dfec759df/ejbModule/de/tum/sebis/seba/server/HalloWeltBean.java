package de.tum.sebis.seba.server;

import javax.ejb.Stateless;

/**
 * Session Bean Implementierungsklasse HalloWeltBean
 */

@Stateless
public class HalloWeltBean implements HalloWeltRemote {
	
	public HalloWeltBean() {
    }

	public String sagHallo(String name) {
		return "Hallo " + name +". Mein Name ist Wildfly, schoen dich kennenzulernen.";
	}

}
