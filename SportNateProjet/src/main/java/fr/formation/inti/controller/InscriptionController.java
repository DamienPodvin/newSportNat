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
	public String inscription(Model model) {
		model.addAttribute("sportif", new Sportifs());
		
		return "view/inscription";
	}
	
	@GetMapping("/register")
	public String saveSportif(Model model, Sportifs sportif) {
		dao.save(sportif);
		return "view/login";
	}
}
