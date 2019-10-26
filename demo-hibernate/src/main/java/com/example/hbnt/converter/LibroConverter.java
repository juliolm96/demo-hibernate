package com.example.hbnt.converter;

import java.util.List;
import java.util.stream.Collectors;

import com.example.hbnt.entity.Libro;
import com.example.hbnt.model.LibroM;

public class LibroConverter {

	public List<LibroM> listado(List<Libro> lista) {
		return lista.stream().map(libro -> new LibroM(libro)).collect(Collectors.toList());
	}

	public LibroM elemento(Libro libro) {
		return new LibroM(libro);
	}
}
