package com.example.hbnt.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hbnt.model.AutorM;
import com.example.hbnt.service.AutorService;

@RestController
@RequestMapping("/autores")
public class AutorRest {

	private static final Log log = LogFactory.getLog(AutorRest.class);
	
	@Autowired
	AutorService autorService;
	
	@GetMapping
	public ResponseEntity<List<AutorM>> obtenerAutores() {
		try {
			return new ResponseEntity<>(autorService.findAll(), HttpStatus.OK);
		} catch(Exception e) {
			e.printStackTrace();
			log.error(e.getMessage());
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
