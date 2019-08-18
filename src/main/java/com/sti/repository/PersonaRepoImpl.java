package com.sti.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.sti.LogisticSpApplication;

@Repository
@Qualifier("Persona1")
public class PersonaRepoImpl implements IPersonaRepo{
	private static Logger LOG = LoggerFactory.getLogger(LogisticSpApplication.class);
	
	@Override
	public void registrar(String nombre) {
		LOG.info("Se registro a: " + nombre + " en PersonaRepoImp1");	
	}

}
