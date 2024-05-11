package com.digital.aula.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digital.aula.model.Aula;
import com.digital.aula.repository.AulaRepository;
import java.util.logging.Logger; // Importa la clase Logger

@Service
public class AulaService {

	private static final Logger logger = Logger.getLogger(AulaService.class.getName()); // Crea una instancia de Logger


    private final AulaRepository aulaRepository;

    @Autowired
    public AulaService(AulaRepository aulaRepository) {
        this.aulaRepository = aulaRepository;
    }

    public List<Aula> getAllAulas() {
    	logger.info("Obteniendo todas las aulas");
    	logger.info(aulaRepository.findAll().toString());
        return aulaRepository.findAll();
    }
}
