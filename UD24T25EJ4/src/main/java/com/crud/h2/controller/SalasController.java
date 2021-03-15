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

import com.crud.h2.dto.Salas;
import com.crud.h2.service.SalasServiceImpl;

@RestController
@RequestMapping("/api")
public class SalasController {

	@Autowired
	SalasServiceImpl SalasServiceImpl;

	@GetMapping("/salas")
	public List<Salas> listarEmpleados() {
		return SalasServiceImpl.listarSalas();
	}

	@PostMapping("/salas")
	public Salas salvarEmpleados(@RequestBody Salas sala) {
		return SalasServiceImpl.guardarSalas(sala);
	}

	@GetMapping("/salas/{id}")
	public Salas empleadoXID(@PathVariable(name = "id") Long id) {

		Salas empleado_xid = new Salas();

		empleado_xid = SalasServiceImpl.listarXId(id);

		return empleado_xid;
	}

	@PutMapping("/salas/{id}")
	public Salas actualizarEmpleado(@PathVariable(name = "id") Long id, @RequestBody Salas sala) {

		Salas sala_seleccionada = new Salas();
		Salas sala_actualizada = new Salas();

		sala_seleccionada = SalasServiceImpl.listarXId(id);

		sala_seleccionada.setNombre(sala.getNombre());
		sala_seleccionada.setPeliculas(sala.getPeliculas());

		sala_actualizada = SalasServiceImpl.actualizarSalas(sala_seleccionada);

		System.out.println("El empleado actualizado es: " + sala_actualizada);

		return sala_actualizada;
	}

	@DeleteMapping("/salas/{id}")
	public void eliminarEmpleado(@PathVariable(name = "id") Long id) {
		SalasServiceImpl.eliminarSalas(id);
	}

}