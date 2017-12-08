package de.tum.sebis.seba.client;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import de.tum.sebis.seba.server.HalloWeltRemote;

public class Test {
	
	private static final String NAME = "yournamehere";

	public static void main(String[] args) {
		
		try {
			// Connection properties um den Wildfly AS zu finden
			String JBOSS_CONTEXT="org.jboss.naming.remote.client.InitialContextFactory";
			Properties props = new Properties();
			props.put(Context.INITIAL_CONTEXT_FACTORY, JBOSS_CONTEXT);
			props.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
			props.put(Context.SECURITY_PRINCIPAL, "sebauser");
			props.put(Context.SECURITY_CREDENTIALS, "sebapass");
			
			// Initial Context fuer Remote-Namensaufloesungen
			Context context = new InitialContext(props);

			// Lookup pattern: <app-name>/<bean-name>!<fully-qualified-classname-of-the-remote-interface>
			HalloWeltRemote hw = (HalloWeltRemote)context.
					lookup("blatt06/HalloWeltBean!de.tum.sebis.seba.server.HalloWeltRemote");
			
			String hallo = hw.sagHallo(NAME);
			System.out.println(hallo);
            
            // Aufraeumen
			context.close();

		} catch (NamingException e) {
			e.printStackTrace();
		} 
	}
}