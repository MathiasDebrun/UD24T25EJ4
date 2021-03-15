package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Peliculas;

public interface IPeliculasService {

	// Metodos del CRUD

	List<Peliculas> listarPeliculas(); // Listar All

	Peliculas guardarPeliculas(Peliculas peliculas); // Guarda un pelicula CREATE

	Peliculas listarXId(Long id); // Leer datos de un pelicula READ

	void eliminarPeliculas(Long id); // Actualiza datos del pelicula UPDATE

	Peliculas actualizarPeliculas(Peliculas peliculas);// Elimina el pelicula DELETE

}
