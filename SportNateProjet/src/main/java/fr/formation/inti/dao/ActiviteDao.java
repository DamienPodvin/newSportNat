package fr.formation.inti.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.inti.entities.ActiviteRecord;

public interface ActiviteDao  extends JpaRepository<ActiviteRecord, Integer> {

}

