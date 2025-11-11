package com.senai.backend.prova.services;

import java.util.List;
import java.util.Optional;

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

    public Optional<Concessionaria> buscarPorId(Integer id) {
        return concessionariaRepository.findById(id);
    }

    public List<Concessionaria> listarTodos() {
        return concessionariaRepository.findAll();
    }

    public Long contar() {
        return concessionariaRepository.count();
    }

    public void remover(Integer id) {
        concessionariaRepository.deleteById(id);
    }
}
