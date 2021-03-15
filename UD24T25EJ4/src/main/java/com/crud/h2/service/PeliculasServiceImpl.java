package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IPeliculasDAO;
import com.crud.h2.dto.Peliculas;

@Service
public class PeliculasServiceImpl implements IPeliculasService {

	// Utilizamos los metodos de la interface IPeliculasDAO
	@Autowired
	IPeliculasDAO iPeliculasDAO;

	@Override
	public List<Peliculas> listarPeliculas() {
		// TODO Auto-generated method stub
		return iPeliculasDAO.findAll();
	}

	@Override
	public Peliculas guardarPeliculas(Peliculas peliculas) {
		// TODO Auto-generated method stub
		return iPeliculasDAO.save(peliculas);
	}

	@Override
	public Peliculas listarXId(Long id) {
		// TODO Auto-generated method stub
		return iPeliculasDAO.findById(id).get();
	}

	@Override
	public Peliculas actualizarPeliculas(Peliculas peliculas) {
		// TODO Auto-generated method stub
		return iPeliculasDAO.save(peliculas);
	}

	@Override
	public void eliminarPeliculas(Long id) {
		// TODO Auto-generated method stub
		iPeliculasDAO.deleteById(id);
	}

}