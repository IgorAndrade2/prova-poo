package com.senai.backend.prova.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

     // ✅ Buscar por ID (GET)
    @GetMapping("/{id}")
    public Optional<Carro> buscarPorId(@PathVariable Long id) {
        return carroService.buscarPorId(id);
    }

    // ✅ Listar todos (GET)
    @GetMapping("/listar")
    public List<Carro> listarTodos() {
        return carroService.listarTodos();
    }

    // ✅ Contar registros (GET)
    @GetMapping("/contar")
    public Long contar() {
        return carroService.contar();
    }

    // ✅ Remover por ID (DELETE)
    @DeleteMapping("/remover/{id}")
    public void remover(@PathVariable Long id) {
        carroService.remover(id);
    }

}
