package com.example.hbnt.service;

import java.util.List;

import com.example.hbnt.entity.Autor;
import com.example.hbnt.model.AutorM;

public interface AutorService {

	public List<AutorM> findAll();
	public AutorM findById(int id);
	public void save(Autor autor);
	public void update(Autor autor);
}
