package com.example.hbnt.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hbnt.entity.Autor;

public interface AutorRepo extends JpaRepository<Autor, Serializable>{
	public abstract List<Autor> findAll();
	public abstract Autor findById(int id);
}
