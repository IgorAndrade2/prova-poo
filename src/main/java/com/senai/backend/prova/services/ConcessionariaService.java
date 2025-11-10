package com.senai.backend.prova.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.prova.models.Concessionaria;
import com.senai.backend.prova.repositories.ConcessionariaRepository;

@Service
public class ConcessionariaService {
     @Autowired
    private ConcessionariaRepository concessionariaRepository;
    public Concessionaria salvar(Concessionaria concessionaria){
        return concessionariaRepository.save(concessionaria);
    }
}
