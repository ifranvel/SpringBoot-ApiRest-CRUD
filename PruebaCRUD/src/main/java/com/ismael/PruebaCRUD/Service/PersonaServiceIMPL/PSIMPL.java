package com.ismael.PruebaCRUD.Service.PersonaServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ismael.PruebaCRUD.Entity.Persona;
import com.ismael.PruebaCRUD.Repository.PersonaRepo;
import com.ismael.PruebaCRUD.Service.PersonaService;

@Service
public class PSIMPL implements PersonaService{
	
	@Autowired
	private PersonaRepo repo;

	@Override
	public List<Persona> consultarPersona() {
		// TODO Auto-generated method stub
		return (List<Persona>) this.repo.findAll();
	}

	@Override
	public Persona crearPersona(Persona persona) {
		persona.setEmail(persona.getEmail());
		return this.repo.save(persona);
	}

	@Override
	public Persona modificarPersona(Persona persona) {
		// TODO Auto-generated method stub
		return this.repo.save(persona);
	}

	@Override
	public Persona buscarPersona(int id) {
		return this.repo.findById(id).get();
	}

	@Override
	public void eliminarPersona(int id) {
		this.repo.deleteById(id);
	}

}
