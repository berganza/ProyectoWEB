package com.berg.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.berg.modelo.Persona;
import com.berg.repositorio.PersonaRepositorio;

@Service
public class PersonaServiceImpl implements PersonaService {
	
	@Autowired
	private PersonaRepositorio repo;
	
	@Override
	public Persona create(Persona persona) {
		return repo.save(persona);
	}

	@Override
	public Persona save(Persona persona) {
		return repo.save(persona);
	}

	@Override
	public void delete(Long id) {
		repo.deleteById(id);
	}

	@Override
	public Persona get(Long id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Persona> getAll() {
		return repo.findAll();
	}

	@Override
	public Persona edit(Long id) {
		return repo.getOne(id);
	}
}