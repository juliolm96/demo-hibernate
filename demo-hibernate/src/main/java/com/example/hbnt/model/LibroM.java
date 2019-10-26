package com.example.hbnt.model;

import com.example.hbnt.entity.Libro;

public class LibroM {
	private int id;
	private String titulo;
	
	public LibroM() {
		
	}
	
	public LibroM(Libro libro) {
		this.id = libro.getId();
		this.titulo = libro.getTitulo();
	}
	
	public LibroM(int id, String titulo, AutorM autor) {
		this.id = id;
		this.titulo = titulo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + "]";
	}
		
}
