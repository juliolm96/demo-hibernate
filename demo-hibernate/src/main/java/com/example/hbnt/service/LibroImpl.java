package com.example.hbnt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hbnt.converter.LibroConverter;
import com.example.hbnt.model.LibroM;
import com.example.hbnt.repository.LibroRepo;

@Service
public class LibroImpl implements LibroService {

	@Autowired
	LibroRepo repo;

	@Override
	public List<LibroM> findAll() {
		return new LibroConverter().listado(repo.findAll());
	}

	@Override
	public LibroM findById(int id) {
		return new LibroConverter().elemento(repo.findById(id));
	}

	@Override
	public List<LibroM> findByTitulo(String nombre) { 
		return new LibroConverter().listado(repo.findByTitulo(nombre));
	}
	
}
