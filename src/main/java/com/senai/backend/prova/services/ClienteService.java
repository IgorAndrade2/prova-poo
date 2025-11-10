package com.senai.backend.prova.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.prova.models.Cliente;
import com.senai.backend.prova.repositories.ClienteRepository;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);
    }
}
