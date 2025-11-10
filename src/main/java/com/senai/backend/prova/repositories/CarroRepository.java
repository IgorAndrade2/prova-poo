package com.senai.backend.prova.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.backend.prova.models.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Integer>{

}
