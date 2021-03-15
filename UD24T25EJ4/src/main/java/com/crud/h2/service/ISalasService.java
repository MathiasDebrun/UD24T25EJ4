package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Salas;

public interface ISalasService {

	//Metodos del CRUD

	List<Salas> listarSalas(); //Listar All 

	Salas guardarSalas(Salas sala); //Guarda un sala CREATE

	Salas listarXId(Long id); //Leer datos de un sala READ

	Salas actualizarSalas(Salas sala);  //Actualiza datos del sala UPDATE

	void eliminarSalas(Long id); // Elimina el sala DELETE

}