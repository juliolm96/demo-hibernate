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

import com.example.hbnt.model.LibroM;
import com.example.hbnt.service.LibroService;

@RestController
@RequestMapping("/libros")
public class LibroRest {

	private static final Log log = LogFactory.getLog(LibroRest.class);
	
	@Autowired
	LibroService libroService;
	
	@GetMapping
	public ResponseEntity<List<LibroM>> obtenerLibros() {
		try {
			return new ResponseEntity<>(libroService.findAll(), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage());
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}