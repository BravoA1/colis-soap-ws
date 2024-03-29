package eu.fr.indyli.formation.business.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import eu.fr.indyli.formation.business.dao.IAlerteDAO;
import eu.fr.indyli.formation.business.ecolis.exception.EcolisBusinessException;
import eu.fr.indyli.formation.business.entity.Alerte;

public class AlerteDAOImpl implements IAlerteDAO{

	private List<Alerte> alerteList;
	
	public AlerteDAOImpl(){
		this.alerteList = new ArrayList<Alerte>();
		Alerte a1 = new Alerte(null,"Douala-Cameroun","Paris-France", new Date());
		Alerte a2 = new Alerte(null,"Rennes-France","Nice-France", new Date());
		Alerte a3 = new Alerte(null,"Bruxelles-Belgique","Munich-Allemagne", new Date());
		Alerte a4 = new Alerte(null,"Budapest-Hongrie","New-York-USA", new Date());
		this.alerteList.add(a1);
		this.alerteList.add(a2);
		this.alerteList.add(a3);
		this.alerteList.add(a4);
	}
	@Override
	public List<Alerte> findAll() {
		return this.alerteList;
	}

	@Override
	public Alerte findById(Long id) throws EcolisBusinessException {
		for (Alerte alerte : alerteList) {
			if (alerte.getIdAlerte().equals(id)){
				return alerte;
			}
		}
		return null;
	}

	@Override
	public Long createEntity(Alerte ent) throws EcolisBusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEntityById(Long id) throws EcolisBusinessException {
		
	}

	@Override
	public List<Alerte> findByVilleDepart(String villeDep) {
		return this.alerteList;
	}

}
