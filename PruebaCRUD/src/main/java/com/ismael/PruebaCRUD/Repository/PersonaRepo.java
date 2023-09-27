package com.ismael.PruebaCRUD.Repository;

import org.springframework.data.repository.CrudRepository;

import com.ismael.PruebaCRUD.Entity.Persona;

public interface PersonaRepo extends CrudRepository<Persona, Integer>{
	
}
