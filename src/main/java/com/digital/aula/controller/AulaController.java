package com.digital.aula.controller;

import com.digital.aula.model.Aula;
import com.digital.aula.service.AulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/aulas")
public class AulaController {

    private final AulaService aulaService;
    private static final Logger logger = Logger.getLogger(AulaController.class.getName()); // Crea una instancia de Logger


    @Autowired
    public AulaController(AulaService aulaService) {
        this.aulaService = aulaService;
    }

    @GetMapping
    public ResponseEntity<List<Aula>> getAllAulas() {
        List<Aula> aulas = aulaService.getAllAulas();
        logger.info("controller");
        logger.info(aulas.toString());
        logger.info(aulas.isEmpty()?"true":"false");
        
        if (aulas.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(aulas, HttpStatus.OK);
    }
 }
