package com.ismael.PruebaCRUD.Service;

import java.util.List;

import com.ismael.PruebaCRUD.Entity.Persona;

public interface PersonaService {

	public List<Persona> consultarPersona();
	
	public Persona crearPersona(Persona persona);
	
	public Persona modificarPersona(Persona persona);
	
	public Persona buscarPersona(int id);
	
	public void eliminarPersona(int id);
	
}
