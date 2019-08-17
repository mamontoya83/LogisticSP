package com.sti;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sti.service.IPersonaService;

@SpringBootApplication
public class LogisticSpApplication implements CommandLineRunner{

	private static Logger LOG = LoggerFactory.getLogger(LogisticSpApplication.class);
	@Autowired
	private IPersonaService persona;
	
	public static void main(String[] args) {
		SpringApplication.run(LogisticSpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//LOG.info("Este es un mensaje informativo");
		//LOG.warn("Este es un mensaje tipo warnning");
		persona.registrar("Miguel Angel Montoya Zazueta 3ro");
	}

}
