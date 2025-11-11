package com.senai.backend.prova.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.prova.models.Cliente;
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

    // ✅ Buscar por ID (GET)
    @GetMapping("/{id}")
    public Optional<Concessionaria> buscarPorId(@PathVariable Integer id) {
        return concessionariaService.buscarPorId(id);
    }

    // ✅ Listar todos (GET)
    @GetMapping("/listar")
    public List<Concessionaria> listarTodos() {
        return concessionariaService.listarTodos();
    }

    // ✅ Contar registros (GET)
    @GetMapping("/contar")
    public Long contar() {
        return concessionariaService.contar();
    }

    // ✅ Remover por ID (DELETE)
    @DeleteMapping("/remover/{id}")
    public void remover(@PathVariable Integer id) {
        concessionariaService.remover(id);
    }
}
