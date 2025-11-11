package com.senai.backend.prova.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.prova.models.Cliente;
import com.senai.backend.prova.services.ClienteService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
     @Autowired
    private ClienteService clienteService;

    @GetMapping("/teste")
    public String teste(){
        return "Consegui!";
    }   

    @PostMapping("/salvar")
    public Cliente salvar(@RequestBody Cliente cliente) {
        return clienteService.salvar(cliente);
    }

    // ✅ Buscar por ID (GET)
    @GetMapping("/{id}")
    public Optional<Cliente> buscarPorId(@PathVariable Integer id) {
        return clienteService.buscarPorId(id);
    }

    // ✅ Listar todos (GET)
    @GetMapping("/listar")
    public List<Cliente> listarTodos() {
        return clienteService.listarTodos();
    }

    // ✅ Contar registros (GET)
    @GetMapping("/contar")
    public Long contar() {
        return clienteService.contar();
    }

    // ✅ Remover por ID (DELETE)
    @DeleteMapping("/remover/{id}")
    public void remover(@PathVariable Integer id) {
        clienteService.remover(id);
    }
}
