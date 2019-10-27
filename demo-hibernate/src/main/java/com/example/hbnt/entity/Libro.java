package com.example.hbnt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="LIBROS")
public class Libro {

	@Id 
	@Column(name="id")
	@GeneratedValue
	private int id;
	
	@Column(name="titulo")
	private String titulo;

	@ManyToOne(optional=false, fetch=FetchType.LAZY)
	@JoinColumn(name="autor_id")
	private Autor autor;
	
	public Libro() {
		
	}
	
	public Libro(int id, String titulo, Autor autor) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
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

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", Autor=" + autor + "]";
	}
		
}
