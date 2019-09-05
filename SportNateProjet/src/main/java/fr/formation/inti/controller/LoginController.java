package fr.formation.inti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
@RequestMapping("/")
	public String login(Model model) {
		 return "view/login";
}

@RequestMapping("/accueil")
public String accueil(Model model) {
	 return "view/accueil";
}

@RequestMapping("/index")
public String index(Model model) {
	 return "view/index";
}	

@RequestMapping("/agenda")
public String agenda(Model model) {
	 return "view/agenda";
}

@RequestMapping("/moncompte")
public String moncompte(Model model) {
	 return "view/moncompte";
}

@RequestMapping("/rechercherAct")
public String rechercherAct(Model model) {
	 return "view/rechercherAct";
}
@RequestMapping("/proposerAct")
public String proposerAct(Model model) {
	 return "view/proposeAct";
}
@RequestMapping("/statistiques")
public String statistiques(Model model) {
	 return "view/statistiques";
}

@RequestMapping("/inscription")
public String inscription(Model model) {
	 return "view/inscription";
}
}
