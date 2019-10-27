package com.example.hbnt.service;

import java.util.List;

import com.example.hbnt.entity.Libro;
import com.example.hbnt.model.LibroM;


public interface LibroService {
	public List<LibroM> findAll();
	public LibroM findById(int id);
	public List<LibroM> findByTitulo(String nombre);
	public void save(Libro libro);
}
