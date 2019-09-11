package fr.formation.inti.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.inti.entities.ActiviteRecord;
import fr.formation.inti.entities.Sportifs;

public interface ActiviteDao  extends JpaRepository<ActiviteRecord, Integer> {
	


	public List<ActiviteRecord> findByLieuLike(String lieu);
}

