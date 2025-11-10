package com.senai.backend.prova.services;

import java.util.List;
import java.util.Optional;

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

     public Optional<Carro> buscarPorId(Long id) {
        return carroRepository.findById(id);
    }

    public List<Carro> listarTodos() {
        return carroRepository.findAll();
    }

    public Long contar() {
        return carroRepository.count();
    }

    public void remover(Long id) {
        carroRepository.deleteById(id);
    }
}
