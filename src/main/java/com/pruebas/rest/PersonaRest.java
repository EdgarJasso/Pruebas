package com.pruebas.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.dao.PersonaDAO;
import com.pruebas.model.Persona;

@RestController
@RequestMapping("persona")
public class PersonaRest {

	@Autowired
	private PersonaDAO PersonaDAO;
	//metodo http -> solicitud al servidor
	//get, post, put, delete -> estado: 200 (correcto) / 500 (error interno) / 404 (no encontrado)
	
	@PostMapping("/guardar")
	//insertar -> post
	public void guardar(@RequestBody Persona Persona) {
		PersonaDAO.save(Persona);
	}
	
	@GetMapping("/listar")
	//select -> get
	public List<Persona> listar(){
		return PersonaDAO.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	//delete -> delete
	public void eliminar(@PathVariable("id") Integer id) {
		PersonaDAO.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	//put -> update
	public void actualizar(@RequestBody Persona Persona) {
		PersonaDAO.save(Persona);
	}
	
	
	
	
}













