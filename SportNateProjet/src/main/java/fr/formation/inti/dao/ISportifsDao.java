package fr.formation.inti.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.inti.entities.Sportifs;

public interface ISportifsDao  extends JpaRepository<Sportifs, Integer> {
	

}
