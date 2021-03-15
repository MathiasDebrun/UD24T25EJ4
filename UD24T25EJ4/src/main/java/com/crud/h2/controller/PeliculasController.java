package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Peliculas;
import com.crud.h2.service.PeliculasServiceImpl;

@RestController
@RequestMapping("/api")
public class PeliculasController {

	@Autowired
	PeliculasServiceImpl peliculasServiceImpl;

	@GetMapping("/peliculas")
	public List<Peliculas> listarPeliculas() {
		return peliculasServiceImpl.listarPeliculas();
	}

	@PostMapping("/peliculas")
	public Peliculas salvarPeliculas(@RequestBody Peliculas pelicula) {
		return peliculasServiceImpl.guardarPeliculas(pelicula);
	}

	@GetMapping("/peliculas/{id}")
	public Peliculas listarXId(@PathVariable(name = "id") Long id) {
		Peliculas peliculas_xid = new Peliculas();

		peliculas_xid = peliculasServiceImpl.listarXId(id);

		System.out.println("Peliculas XID: " + peliculas_xid);

		return peliculas_xid;
	}

	@PutMapping("/peliculas/{id}")
	public Peliculas actualizarPeliculas(@PathVariable(name = "id") Long id, @RequestBody Peliculas pelicula) {

		Peliculas pelicula_seleccionada = new Peliculas();
		Peliculas pelicula_actualizada = new Peliculas();

		pelicula_seleccionada = peliculasServiceImpl.listarXId(id);

		pelicula_seleccionada.setNombre(pelicula.getNombre());
		pelicula_seleccionada.setCalificacionedad(pelicula.getCalificacionedad());

		pelicula_actualizada = peliculasServiceImpl.actualizarPeliculas(pelicula_seleccionada);

		System.out.println("El departamento actualizado es: " + pelicula_actualizada);

		return pelicula_actualizada;
	}

	@DeleteMapping("/peliculas/{id}")
	public void eliminaPeliculas(@PathVariable(name = "id") Long id) {
		peliculasServiceImpl.eliminarPeliculas(id);
	}

}
