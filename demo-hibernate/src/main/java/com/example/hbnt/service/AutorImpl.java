package com.example.hbnt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hbnt.converter.AutorConverter;
import com.example.hbnt.entity.Autor;
import com.example.hbnt.model.AutorM;
import com.example.hbnt.repository.AutorRepo;

@Service
public class AutorImpl implements AutorService {
	
	@Autowired
	AutorRepo repo;
	
	@Autowired
	AutorConverter autorConverter;

	@Override
	public List<AutorM> findAll() { 
		return autorConverter.listado(repo.findAll());
	}

	@Override
	public AutorM findById(int id) {
		return autorConverter.elemento(repo.findById(id));
	}

	@Override
	public void save(Autor autor) {
		repo.save(autor);
	}

	@Override
	public void update(Autor autor) {
		//repo.
	}

}
