package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "peliculas") // en caso que la tabla sea diferente
public class Peliculas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private Long id;

	@Column(name = "nombre") // no hace falta si se llama igual
	private String nombre;

	@Column(name = "calificacionedad") // no hace falta si se llama igual
	private int calificacionedad;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Salas> sala;

	// Constructores
	/**
	 * 
	 */
	public Peliculas() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nombre
	 * @param calificacionedad
	 * @param sala
	 */
	public Peliculas(Long id, String nombre, int calificacionedad, List<Salas> sala) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.calificacionedad = calificacionedad;
		this.sala = sala;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the calificacionedad
	 */
	public int getCalificacionedad() {
		return calificacionedad;
	}

	/**
	 * @param calificacionedad the calificacionedad to set
	 */
	public void setCalificacionedad(int calificacionedad) {
		this.calificacionedad = calificacionedad;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Sala")
	public List<Salas> getSala() {
		return sala;
	}

	/**
	 * @param sala the sala to set
	 */
	public void setSala(List<Salas> sala) {
		this.sala = sala;
	}

	// Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Peliculas [id=" + id + ", nombre=" + nombre + ", calificacionedad=" + calificacionedad + ", sala="
				+ sala + "]";
	}

}