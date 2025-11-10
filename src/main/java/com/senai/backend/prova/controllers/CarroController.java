package com.senai.backend.prova.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.prova.models.Carro;
import com.senai.backend.prova.services.CarroService;

@RestController
@RequestMapping("/carro")
public class CarroController {
    @Autowired
    public CarroService carroService; 

    @GetMapping("/teste")
    public String teste(){
        return "Estou na classe material!";
    }    

    @PostMapping("/salvar")
    public Carro salvar(@RequestBody Carro carro){
        return carroService.salvar(carro);
    }
}
