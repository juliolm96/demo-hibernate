package com.example.hbnt.converter;

import com.example.hbnt.entity.Autor;
import com.example.hbnt.model.AutorM;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class AutorConverter {
	
	public List<AutorM> listado(List<Autor> listado) {
		return listado.stream().map(autor -> new AutorM(autor, false)).collect(Collectors.toList());
	}
	
	public AutorM elemento(Autor autor) {
		return new AutorM(autor, true);
	}
	
}
