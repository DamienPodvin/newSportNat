package fr.formation.inti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.formation.inti.dao.ISportifsDao;
import fr.formation.inti.entities.Sportifs;

@Controller
public class InscriptionController {
	
	@Autowired
	ISportifsDao dao;

	@GetMapping("/inscription")
	public String inscription(Model model, Sportifs sportif) {
		model.addAttribute(sportif);
		
		return "view/login";
	}
	
}
