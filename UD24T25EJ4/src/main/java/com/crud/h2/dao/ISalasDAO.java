package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Salas;
/**
 * @author Estefania
 *
 */
public interface ISalasDAO extends JpaRepository<Salas, Long> {

}
