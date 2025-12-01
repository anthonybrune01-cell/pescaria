package com.example.demo.entidade;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Especie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeComum;
    private String nomeCientifico;
    private boolean protegida;
    private Double tamanhoMinimo;

    public Especie(Long id, String nomeComum) {
        this.id = id;
        this.nomeComum = nomeComum;
    }

    public Especie(Long id, String nomeComum, String nomeCientifico, boolean protegida, Double tamanhoMinimo) {
        this.id = id;
        this.nomeComum = nomeComum;
        this.nomeCientifico = nomeCientifico;
        this.protegida = protegida;
        this.tamanhoMinimo = tamanhoMinimo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeComum() {
        return nomeComum;
    }

    public void setNomeComum(String nomeComum) {
        this.nomeComum = nomeComum;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public boolean isProtegida() {
        return protegida;
    }

    public void setProtegida(boolean protegida) {
        this.protegida = protegida;
    }

    public Double getTamanhoMinimo() {
        return tamanhoMinimo;
    }

    public void setTamanhoMinimo(Double tamanhoMinimo) {
        this.tamanhoMinimo = tamanhoMinimo;
    }
}
