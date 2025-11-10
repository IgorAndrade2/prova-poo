package com.senai.backend.prova.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.backend.prova.models.Concessionaria;

@Repository
public interface ConcessionariaRepository extends JpaRepository<Concessionaria, Integer>{

}

