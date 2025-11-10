package com.senai.backend.prova.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.prova.models.Concessionaria;
import com.senai.backend.prova.services.ConcessionariaService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class ConcessionariaController {
     @Autowired
    private ConcessionariaService concessionariaService;

    @GetMapping("/teste")
    public String teste(){
        return "Consegui!";
    }   

    @PostMapping("/salvar")
    public Concessionaria salvar(@RequestBody Concessionaria concessionaria) {
        return concessionariaService.salvar(concessionaria);
    }
}
