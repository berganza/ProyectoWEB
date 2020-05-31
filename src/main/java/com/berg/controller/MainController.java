package com.berg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.berg.modelo.Persona;
import com.berg.repositorio.PersonaRepositorio;

//@RestController
//@RequestMapping//(path="/persona")
@Controller
public class MainController {
	
	@Autowired
	private PersonaRepositorio repo;
	
	// Para restful, probar con postman
//	@GetMapping
//	public List<Persona> getAll(){
//		return repo.findAll();
//	}
	
	// Para páginas internas, dentro de la aplicacion
	@RequestMapping("/index")
	public String getAll(Model model){
		model.addAttribute("list", repo.findAll());
		return "listado/index";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id, Model model) {
		repo.deleteById(id);
		return "redirect:/index";
	}
	
	@RequestMapping("/save")
	public String create(Persona persona) {
		repo.save(persona);
		return "listado/save";
	}
	
	@PostMapping("/save")
	public String save(Persona persona, Model model) {
		repo.save(persona);
		return "redirect:/index";
	}
	
	@GetMapping("/save/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        if (id != null && id != 0) {
            model.addAttribute("persona", repo.findById(id));
        } else {
            model.addAttribute("persona", new Persona());
        }
        return "listado/save";
    }
	
	@RequestMapping("/detail/{id}")
	public String get(@PathVariable("id") Long id, Model model) {
		model.addAttribute("persona", repo.findById(id).get());
		return "listado/detail";
	}
	
}