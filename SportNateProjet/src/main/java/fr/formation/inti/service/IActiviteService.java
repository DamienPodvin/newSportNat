package fr.formation.inti.service;

import java.util.List;

import fr.formation.inti.dao.ActiviteDao;
import fr.formation.inti.entities.ActiviteRecord;


public interface IActiviteService  {

	public List<ActiviteRecord> findAllActivite();
}
