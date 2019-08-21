package com.sti.rest;

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
import com.sti.repository.IPersonaRepo;
import com.sti.model.*;

@RestController
@RequestMapping("/Personas")
public class RestDemoController {
	@Autowired
	private IPersonaRepo repo;
	
	@GetMapping		//Metodo para obtencion de datos
	public List<Persona> listar(){
		return repo.findAll();
	}
	
	@PostMapping	//Metodo para insertar datos
	public void insertar(@RequestBody Persona per){
		repo.save(per);
	}
	 
	@PutMapping	//Metodo para una actualizacion total de datos
	public void modifucar(@RequestBody Persona per) {
		repo.save(per);
	}
	
	@DeleteMapping("/{id}")	//Metodo para eliminacion de datos
	public void eliminar(@PathVariable("id") Integer id) {
		repo.deleteById(id);
	}
	
}
