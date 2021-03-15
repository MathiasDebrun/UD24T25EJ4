package com.crud.h2.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "salas") // en caso que la tabla sea diferente
public class Salas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private Long id;

	@Column(name = "nombre") // no hace falta si se llama igual
	private String nombre;

	@ManyToOne
	@JoinColumn(name = "pelicula") // no hace falta si se llama igual
	private Peliculas pelicula;

	// Constructores
	/**
	 * 
	 */
	public Salas() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nombre
	 * @param peliculas
	 */
	public Salas(Long id, String nombre, Peliculas pelicula) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.pelicula = pelicula;
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
	 * @return the peliculas
	 */
	public Peliculas getPeliculas() {
		return pelicula;
	}

	/**
	 * @param peliculas the peliculas to set
	 */
	public void setPeliculas(Peliculas peliculas) {
		this.pelicula = peliculas;
	}

	// Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Salas [id=" + id + ", nombre=" + nombre + ", peliculas=" + pelicula + "]";
	}

}
