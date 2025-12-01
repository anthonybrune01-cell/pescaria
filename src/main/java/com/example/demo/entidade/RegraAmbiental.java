package com.example.demo.entidade;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;

@Entity
@Data
public class RegraAmbiental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;
    private String regiao;
    private Instant data_inicio;
    private Instant data_fim;
    private String descricao;
    @ManyToOne
    @JoinColumn(name = "id_especie", referencedColumnName = "id")
    private Especie especie;

    public RegraAmbiental(Long id, String tipo, String regiao, Instant data_inicio, Instant data_fim, String descricao, Especie especie) {
        this.id = id;
        this.tipo = tipo;
        this.regiao = regiao;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.descricao = descricao;
        this.especie = especie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public Instant getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Instant data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Instant getData_fim() {
        return data_fim;
    }

    public void setData_fim(Instant data_fim) {
        this.data_fim = data_fim;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }
}
