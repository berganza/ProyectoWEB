package com.berg.service;

import java.util.List;

import com.berg.modelo.Persona;

public interface PersonaService {

	Persona create(Persona persona);
	Persona save (Persona persona);
	void delete(Long id);
	Persona get(Long id);
	Persona edit(Long id);
	List<Persona> getAll();
}
