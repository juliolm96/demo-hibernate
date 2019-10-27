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
import org.springframework.web.bind.annotation.RestController;

import com.example.hbnt.entity.Autor;
import com.example.hbnt.model.AutorM;
import com.example.hbnt.service.AutorService;

@RestController
@RequestMapping("/autores")
public class AutorRest {

	private static final Log log = LogFactory.getLog(AutorRest.class);
	
	@Autowired
	AutorService autorService;
	
	@GetMapping
	public ResponseEntity<List<AutorM>> findAll() {
		try {
			return new ResponseEntity<>(autorService.findAll(), HttpStatus.OK);
		} catch(Exception e) {
			e.printStackTrace();
			log.error(e.getMessage());
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<AutorM> findById(@PathVariable int id) {
		try {
			return new ResponseEntity<>(autorService.findById(id), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage());
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Void> save(@RequestBody @Valid Autor autor) {
		try {
			autorService.save(autor);
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage());
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
}
