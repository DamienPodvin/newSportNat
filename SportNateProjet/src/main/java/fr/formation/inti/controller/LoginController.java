package fr.formation.inti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.formation.inti.dao.ISportifsDao;
import fr.formation.inti.entities.Sportifs;

@Controller
public class LoginController {
	
	@Autowired
	ISportifsDao dao;
	
	@GetMapping(path = { "", "/","/login" })
	public String login(Model model) {
		 return "view/login";
}

}
