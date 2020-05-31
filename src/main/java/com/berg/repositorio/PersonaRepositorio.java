package com.berg.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.berg.modelo.Persona;

@Repository
public interface PersonaRepositorio extends JpaRepository<Persona, Long> {

}
