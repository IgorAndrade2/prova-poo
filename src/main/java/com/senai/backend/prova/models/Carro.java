package com.senai.backend.prova.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="carro")
public class Carro {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="modeolo")
    private String modelo;
    @Column(name="marca")
    private String marca;
    @Column(name="preco")
    private double preco;
    @Column(name="concessionaria")
    private int concessionaria;

    public Carro() {
    }

    public Carro(Integer id, String modelo, String marca, double preco, int concessionaria) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
        this.concessionaria = concessionaria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getConcessionaria() {
        return concessionaria;
    }

    public void setConcessionaria(int concessionaria) {
        this.concessionaria = concessionaria;
    }

    

}
