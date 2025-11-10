package com.senai.backend.prova.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.prova.models.Carro;
import com.senai.backend.prova.repositories.CarroRepository;

@Service
public class CarroService {
     @Autowired
    private CarroRepository carroRepository;
    public Carro salvar(Carro carro){
        return carroRepository.save(carro);
    }
}
