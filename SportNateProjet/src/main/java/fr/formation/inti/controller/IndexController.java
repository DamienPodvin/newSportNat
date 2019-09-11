package fr.formation.inti.controller;

import java.security.Principal;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.formation.inti.dao.ISportifsDao;

@Controller
public class IndexController {
	
	@Autowired
	ISportifsDao dao;
	
	@GetMapping("/index")
    public String index(Model model, Principal principal) {
        model.addAttribute("activePage", "login");
        model.addAttribute("sportifs", this.dao.findAll());
        User loginedUser = (User) ((Authentication) principal).getPrincipal();
        
        Collection<? extends GrantedAuthority> authorities = loginedUser.getAuthorities();
        boolean isAdmin = false;
       for (GrantedAuthority grantedAuthority : authorities){
    	   if (grantedAuthority.getAuthority().equals("ROLE_ADMIN")) {
               isAdmin = true;
               break;
           }
       }
        model.addAttribute("isAdmin", isAdmin);
        return "view/login/index";
    }
	
	
}
