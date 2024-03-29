package eu.fr.indyli.formation.business.entity;
// Generated 25 juin 2017 02:21:10 by Hibernate Tools 5.2.0.CR1

import java.util.Date;

/**
 * Alerte generated by hbm2java
 */
public class Alerte extends AbstractEcolisEntity {

	private Long idAlerte;
	private Utilisateur utilisateur;
	private String villeDepart;
	private String villeArrivee;
	private Date dateDepot;

	public Alerte() {
		this.dateDepot = new Date();
		this.idAlerte = System.currentTimeMillis();
	}

	public Alerte(Utilisateur utilisateur, String villeDepart, String villeArrivee, Date dateDepot) {
		this.utilisateur = utilisateur;
		this.villeDepart = villeDepart;
		this.villeArrivee = villeArrivee;
		this.dateDepot = dateDepot;
		this.idAlerte = System.currentTimeMillis();
	}

	public Long getIdAlerte() {
		return this.idAlerte;
	}

	public void setIdAlerte(Long idAlerte) {
		this.idAlerte = idAlerte;
	}

	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public String getVilleDepart() {
		return this.villeDepart;
	}

	public void setVilleDepart(String villeDepart) {
		this.villeDepart = villeDepart;
	}

	public String getVilleArrivee() {
		return this.villeArrivee;
	}

	public void setVilleArrivee(String villeArrivee) {
		this.villeArrivee = villeArrivee;
	}

	public Date getDateDepot() {
		return this.dateDepot;
	}

	public void setDateDepot(Date dateDepot) {
		this.dateDepot = dateDepot;
	}
}
