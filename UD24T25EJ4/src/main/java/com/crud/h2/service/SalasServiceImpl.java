package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crud.h2.dao.ISalasDAO;
import com.crud.h2.dto.Salas;

@Service
public class SalasServiceImpl implements ISalasService {

	// Utilizamos los metodos de la interface ISalasDAO
	@Autowired
	ISalasDAO iSalassDAO;

	@Override
	public List<Salas> listarSalas() {
		// TODO Auto-generated method stub
		return iSalassDAO.findAll();
	}

	@Override
	public Salas guardarSalas(Salas sala) {
		// TODO Auto-generated method stub
		return iSalassDAO.save(sala);
	}

	@Override
	public Salas listarXId(Long id) {
		// TODO Auto-generated method stub
		return iSalassDAO.findById(id).get();
	}

	@Override
	public Salas actualizarSalas(Salas sala) {
		// TODO Auto-generated method stub
		return iSalassDAO.save(sala);
	}

	@Override
	public void eliminarSalas(Long id) {
		// TODO Auto-generated method stub
		iSalassDAO.deleteById(id);
	}

}