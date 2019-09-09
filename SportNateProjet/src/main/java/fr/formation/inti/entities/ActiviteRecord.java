package fr.formation.inti.entities;
// Generated 9 sept. 2019 11:09:20 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ActiviteRecord generated by hbm2java
 */
@Entity
@Table(name = "activite_record", catalog = "sportnat")
public class ActiviteRecord implements java.io.Serializable {

	private int activiteId;
	private String nameActivity;
	private String lieu;
	private String timeofActivity;
	private Integer nbrePers;
	private Integer nbreKm;
	private String description;

	public ActiviteRecord() {
	}


	public ActiviteRecord(int activiteId, String nameActivity, String lieu, String timeofActivity, Integer nbrePers,
			Integer nbreKm, int commentaireCommentaireId, String description) {
		this.activiteId = activiteId;
		this.nameActivity = nameActivity;
		this.lieu = lieu;
		this.timeofActivity = timeofActivity;
		this.nbrePers = nbrePers;
		this.nbreKm = nbreKm;

		this.description = description;
	}

	@Id

	@Column(name = "Activite_id", unique = true, nullable = false)
	public int getActiviteId() {
		return this.activiteId;
	}

	public void setActiviteId(int activiteId) {
		this.activiteId = activiteId;
	}

	@Column(name = "nameActivity", length = 50)
	public String getNameActivity() {
		return this.nameActivity;
	}

	public void setNameActivity(String nameActivity) {
		this.nameActivity = nameActivity;
	}

	@Column(name = "Lieu", length = 50)
	public String getLieu() {
		return this.lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	@Column(name = "TimeofActivity", length = 50)
	public String getTimeofActivity() {
		return this.timeofActivity;
	}

	public void setTimeofActivity(String timeofActivity) {
		this.timeofActivity = timeofActivity;
	}

	@Column(name = "NbrePers")
	public Integer getNbrePers() {
		return this.nbrePers;
	}

	public void setNbrePers(Integer nbrePers) {
		this.nbrePers = nbrePers;
	}

	@Column(name = "NbreKm")
	public Integer getNbreKm() {
		return this.nbreKm;
	}

	public void setNbreKm(Integer nbreKm) {
		this.nbreKm = nbreKm;
	}


	@Column(name = "Description", length = 500)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
