package com.example.hbnt.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.example.hbnt.entity.Autor;

public class AutorM {
	private int id;
	private String nombre;
	private String nacionalidad;
	private List<LibroM> libros = new ArrayList<>();
	
	public AutorM() {
		
	}

	public AutorM(Autor autor, boolean libros) {
		this.id = autor.getId();
		this.nombre = autor.getNombre();
		this.nacionalidad = autor.getNacionalidad();
		if (libros) {
			this.libros = autor.getLibros().stream().map(libro -> new LibroM(libro)).collect(Collectors.toList());
		} else {
			this.libros = new ArrayList<>();
		}
	}
	
	public AutorM(int id, String nombre, String nacionalidad, List<LibroM> libros) { 
		this.id = id;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.libros = libros;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}
	
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	public List<LibroM> getLibros() {
		return libros;
	}
	
	public void setLibros(List<LibroM> libros) {
		this.libros = libros;
	}

	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + "]";
	}
}
