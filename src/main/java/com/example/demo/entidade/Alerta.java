package com.example.demo.entidade;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Data
public class Alerta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id_pescaria", referencedColumnName = "id")
    private Pescaria pescaria;
    @ManyToOne
    @JoinColumn(name = "id_regra", referencedColumnName = "id")
    private RegraAmbiental regraAmbiental;
    private String mensagem;
    private boolean reconhecimento;
    private Timestamp dataCriacao;

    public Alerta(Long id, Pescaria pescaria, RegraAmbiental regraAmbiental, String mensagem, boolean reconhecimento, Timestamp dataCriacao) {
        this.id = id;
        this.pescaria = pescaria;
        this.regraAmbiental = regraAmbiental;
        this.mensagem = mensagem;
        this.reconhecimento = reconhecimento;
        this.dataCriacao = dataCriacao;
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

    public RegraAmbiental getRegraAmbiental() {
        return regraAmbiental;
    }

    public void setRegraAmbiental(RegraAmbiental regraAmbiental) {
        this.regraAmbiental = regraAmbiental;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public boolean isReconhecimento() {
        return reconhecimento;
    }

    public void setReconhecimento(boolean reconhecimento) {
        this.reconhecimento = reconhecimento;
    }

    public Timestamp getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Timestamp dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
