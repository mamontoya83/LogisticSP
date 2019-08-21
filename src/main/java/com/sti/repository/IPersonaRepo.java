package com.sti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sti.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{
	//public void registrar(String nombre);
	
}
