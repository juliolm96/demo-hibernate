package com.example.hbnt.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="AUTORES")
public class Autor {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="nacionalidad")
	private String nacionalidad;
	
	@OneToMany(mappedBy="autor", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Libro> libros = new ArrayList<>();
	
	public Autor() {
		
	}

	public Autor(int id, String nombre, String nacionalidad) { 
		this.id = id;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
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
	
	public List<Libro> getLibros() {
		return libros;
	}
	
	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + "]";
	}
	
}
