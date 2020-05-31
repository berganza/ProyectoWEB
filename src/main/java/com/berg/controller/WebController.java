package com.berg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	
	@RequestMapping("/")
	public String home(Model model){
		return "home";
	}
	
	@RequestMapping("/conexionBBDD")
	public String conexionMySQL(Model model){
		return "admin/conexionBBDD";
	}
	@RequestMapping("/H2conexionBBDD")
	public String conexionH2(Model model){
		return "admin/H2conexionBBDD";
	}
	
	@RequestMapping("/luis")
	public String about(Model model){
		return "admin/luis";
	}
	
	@RequestMapping("/codigo2")
	public String code2(Model model){
		return "codigo/codigo2";
	}
	
	@RequestMapping("/codigo3")
	public String code3(Model model){
		return "codigo/codigo3";
	}

}
