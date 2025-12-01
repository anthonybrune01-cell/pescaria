package com.example.demo.entidade;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
public class Captura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pescaria_id", referencedColumnName = "id")
    private Pescaria pescaria;

    @ManyToOne
    @JoinColumn(name = "especie_id", referencedColumnName = "id")
    private Especie especie;

    private Double pesoTotal;

    private Double tamanhoMedio;

    private Integer quantidade;

    private String local;

    private LocalDate data;

    private LocalTime hora;

    private String metodo;

    private String isca;

    private Boolean soltura;

    @Column(length = 500)
    private String observacoes;

    public Captura(Long id, Pescaria pescaria, Especie especie, int quantidade, double pesoTotal, double tamanhoMedio, boolean soltura) {
        this.id = id;
        this.pescaria = pescaria;
        this.especie = especie;
        this.quantidade = quantidade;
        this.pesoTotal = pesoTotal;
        this.tamanhoMedio = tamanhoMedio;
        this.soltura = soltura;
    }

    public Captura(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pescaria getPescaria() {
        return pescaria;
    }

    public void setPescaria(Pescaria pescaria) {
        this.pescaria = pescaria;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public double getTamanhoMedio() {
        return tamanhoMedio;
    }

    public void setTamanhoMedio(double tamanhoMedio) {
        this.tamanhoMedio = tamanhoMedio;
    }

    public boolean isSoltura() {
        return soltura;
    }

    public void setSoltura(boolean soltura) {
        this.soltura = soltura;
    }
}
