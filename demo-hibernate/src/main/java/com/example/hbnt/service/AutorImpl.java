package com.example.hbnt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hbnt.converter.AutorConverter;
import com.example.hbnt.model.AutorM;
import com.example.hbnt.repository.AutorRepo;

@Service
public class AutorImpl implements AutorService {
	
	@Autowired
	AutorRepo repo;

	@Override
	public List<AutorM> findAll() {
		return new AutorConverter().listado(repo.findAll());
	}

}
