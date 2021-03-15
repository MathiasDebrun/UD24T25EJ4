package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Peliculas;
/**
 * @author Estefania
 *
 */
public interface IPeliculasDAO extends JpaRepository<Peliculas, Long>{

}
