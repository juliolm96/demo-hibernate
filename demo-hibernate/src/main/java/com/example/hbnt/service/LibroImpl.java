package com.example.hbnt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hbnt.converter.LibroConverter;
import com.example.hbnt.entity.Libro;
import com.example.hbnt.model.LibroM;
import com.example.hbnt.repository.AutorRepo;
import com.example.hbnt.repository.LibroRepo;

@Service
public class LibroImpl implements LibroService {

	@Autowired
	LibroRepo repo;
	
	@Autowired
	AutorRepo autorRepo;
	
	@Autowired
	LibroConverter libroConverter;

	@Override
	public List<LibroM> findAll() {
		return libroConverter.listado(repo.findAll());
	}

	@Override
	public LibroM findById(int id) {
		return libroConverter.elemento(repo.findById(id));
	}

	@Override
	public List<LibroM> findByTitulo(String nombre) { 
		return libroConverter.listado(repo.findByTitulo(nombre));
	}

	@Override
	public void save(Libro libro) {
		libro.setAutor(autorRepo.findById(libro.getAutor().getId()));
		repo.save(libro);
	}
	
}
