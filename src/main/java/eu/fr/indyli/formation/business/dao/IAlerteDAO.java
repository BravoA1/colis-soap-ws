package eu.fr.indyli.formation.business.dao;

import java.util.List;

import eu.fr.indyli.formation.business.entity.Alerte;

public interface IAlerteDAO extends ICommunDAO<Alerte>{

	public List<Alerte> findByVilleDepart(String villeDep);
	
}
