package eu.fr.indyli.formation.business.service.publisher;

/**
 * 
 * @author CHZOME
 *
 */

import javax.xml.ws.Endpoint;

import eu.fr.indyli.formation.business.utils.EcolisConstantesBusiness;
import eu.fr.insee.formation.business.service.impl.UtilisateurServiceImpl;

public class EcolisServicePublisher {

	public static void main(String[] args) {

		System.out.println("Beginning to publish Gesta Service now");
		Endpoint.publish("http://" + EcolisConstantesBusiness.SERVER_IP + ":" + EcolisConstantesBusiness.SERVER_PORT
				+ "/gestache/users", new UtilisateurServiceImpl());
		System.out.println("Users Done publishing...");
	}
}
