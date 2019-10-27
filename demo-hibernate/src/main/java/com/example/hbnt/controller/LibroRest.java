package com.example.hbnt.controller;

import java.util.List;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hbnt.entity.Libro;
import com.example.hbnt.model.LibroM;
import com.example.hbnt.service.LibroService;

@RestController
@RequestMapping("/libros")
public class LibroRest {

	private static final Log log = LogFactory.getLog(LibroRest.class);
	
	@Autowired
	LibroService libroService;
	
	@GetMapping
	public ResponseEntity<List<LibroM>> getLibros() {
		try {
			return new ResponseEntity<>(libroService.findAll(), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage());
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<LibroM> find(@PathVariable int id) {
		try {
			return new ResponseEntity<>(libroService.findById(id), HttpStatus.OK);
		} catch(Exception e) {
			e.printStackTrace();
			log.error(e.getMessage());
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/titulo")
	public ResponseEntity<List<LibroM>> findByTitulo(@RequestParam String titulo) {
		try {
			return new ResponseEntity<>(libroService.findByTitulo(titulo), HttpStatus.OK);
		} catch(Exception e) {
			e.printStackTrace();
			log.error(e.getMessage());
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Void> save(@RequestBody @Valid Libro libro) {
		try {
			libroService.save(libro);
		} catch(Exception e) {
			e.printStackTrace();
			log.error(e.getMessage());
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
}
