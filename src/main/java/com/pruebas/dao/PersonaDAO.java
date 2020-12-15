package com.pruebas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebas.model.Persona;

public interface PersonaDAO extends JpaRepository<Persona, Integer> {
//jpa esun conjunto de consultas 
	//aqui se armaran las consultas que sean personalizadas
}
