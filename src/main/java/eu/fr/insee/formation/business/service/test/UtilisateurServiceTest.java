package eu.fr.insee.formation.business.service.test;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import eu.fr.insee.formation.business.dto.UserListDto;
import eu.fr.insee.formation.business.ecolis.exception.EcolisBusinessException;
import eu.fr.insee.formation.business.entity.Utilisateur;
import eu.fr.insee.formation.business.service.IUtilisateurService;
import eu.fr.insee.formation.business.utils.GestaConstantesBusiness;
/**
 * Classe de test Utilisateur
 */
public class UtilisateurServiceTest {

	private Service service;
	//Initialisation du serveur SOAP devant donner acces aux services exposes
	@Before
	public void initService() throws MalformedURLException{
		URL url = new URL(GestaConstantesBusiness.URL_USER_PATH);
		QName qname = new QName(GestaConstantesBusiness.TARGET_NAMESPACE,GestaConstantesBusiness.USER_SERVICE_NAME);
		this.service = Service.create(url, qname);
	}
	
	@Test
	public void testGetAllUsers(){
		IUtilisateurService userSoapService = service.getPort(IUtilisateurService.class);
		UserListDto userList = userSoapService.findAll();
		Assert.assertTrue(userList.getUsers().size() >0);
		System.out.println("List ==>"+userList);
	}
	
	@Test
	public void testGetUserById() throws EcolisBusinessException{
		//Given 
		Long foundUserId = 10L;
		String foundName = "Sarkozy";
		IUtilisateurService userSoapService = service.getPort(IUtilisateurService.class);
		Utilisateur user = userSoapService.findById(foundUserId);
		Assert.assertTrue(user != null && user.getName().equalsIgnoreCase(foundName));
		System.out.println("User  ==>"+user);
	}
	
	@Test
	public void testAddUser() throws EcolisBusinessException{
		IUtilisateurService userSoapService = service.getPort(IUtilisateurService.class);
		Utilisateur user1 = new Utilisateur("Monsieur","omb",1979,"Mbieleu","Olivier","oli_pwd");
		userSoapService.createUser(user1);
		Assert.assertNotNull(user1.getIdUtilisateur());
	}
}
