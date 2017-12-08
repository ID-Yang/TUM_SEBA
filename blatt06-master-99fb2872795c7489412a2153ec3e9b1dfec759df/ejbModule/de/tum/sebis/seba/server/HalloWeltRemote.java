package de.tum.sebis.seba.server;

import javax.ejb.Remote;

/**
 * Remote Interface fuer die HelleWorld Session Bean
 */

@Remote
public interface HalloWeltRemote {
	
	public String sagHallo(String name);

}