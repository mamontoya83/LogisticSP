package com.sti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sti.model.Persona;
import com.sti.repository.IPersonaRepo;

@Controller
public class GreetingController {
	
	@Autowired
	private IPersonaRepo repo; 
	
	@GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        //model.addAttribute("name", name);
		Persona p = new Persona();
		p.setIdPersona(10);
		p.setNombre("Miguel Angel Montoya Del Campo");
		repo.save(p);
		
		model.addAttribute("name",name);
        return "greeting";
    }
	
	@GetMapping("/listar")
    public String greeting(Model model) {
        model.addAttribute("persona", repo.findAll());
        return "greeting";
    }
}
