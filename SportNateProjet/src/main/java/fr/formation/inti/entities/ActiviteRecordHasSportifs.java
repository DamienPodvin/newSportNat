package fr.formation.inti.entities;
// Generated 10 sept. 2019 09:21:11 by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ActiviteRecordHasSportifs generated by hbm2java
 */
@Entity
@Table(name = "activite_record_has_sportifs", catalog = "sportnat")
public class ActiviteRecordHasSportifs implements java.io.Serializable {

	private ActiviteRecordHasSportifsId id;

	public ActiviteRecordHasSportifs() {
	}

	public ActiviteRecordHasSportifs(ActiviteRecordHasSportifsId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "dateAjout", column = @Column(name = "date_ajout", length = 10)),
			@AttributeOverride(name = "sportifsSportifsId", column = @Column(name = "sportifs_sportifs_id", nullable = false)),
			@AttributeOverride(name = "activiteRecordActiviteId", column = @Column(name = "activite_record_Activite_id", nullable = false)) })
	public ActiviteRecordHasSportifsId getId() {
		return this.id;
	}

	public void setId(ActiviteRecordHasSportifsId id) {
		this.id = id;
	}

}