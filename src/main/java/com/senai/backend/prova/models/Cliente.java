package com.senai.backend.prova.models;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="nome")
    private String  nome;
    @Column(name="email")
    private String email;
    @Column(name="cpf")
    private double cpf;
    @Column(name="data_nascimento")
    private LocalDate dataNascimento;
    @ManyToMany
    @JoinTable(
        name="locacao",
        joinColumns = @JoinColumn(name="id_cliente", referencedColumnName="id"),
        inverseJoinColumns = @JoinColumn(name="id_carro", referencedColumnName="id")
    )
    private List<Carro> carros;
    
    public Cliente() {
    }

    public Cliente(Integer id, String nome, String email, double cpf, LocalDate dataNascimento,
            List<Carro> carros) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.carros = carros;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<Carro> getLista_carros() {
        return carros;
    }

    public void setLista_carros(List<Carro> lista_carros) {
        this.carros = carros;
    }   
}
