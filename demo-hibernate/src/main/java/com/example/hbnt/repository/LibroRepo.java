package com.example.hbnt.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hbnt.entity.Libro;

@Repository
public interface LibroRepo extends JpaRepository<Libro, Serializable> {
	public abstract List<Libro> findAll();
	public abstract Libro findById(int id);
	public abstract List<Libro> findByTitulo(String nombre);
}
