package com.example.demo.entidade;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Data
public class Foto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id_pescaria", referencedColumnName = "id")
    private Pescaria pescaria;
    private String caminhoArquivo;
    private String descricao;
    private Timestamp dataUpload;

    public Foto(Long id, Pescaria pescaria, String caminhoArquivo, String descricao, Timestamp dataUpload) {
        this.id = id;
        this.pescaria = pescaria;
        this.caminhoArquivo = caminhoArquivo;
        this.descricao = descricao;
        this.dataUpload = dataUpload;
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

    public String getCaminhoArquivo() {
        return caminhoArquivo;
    }

    public void setCaminhoArquivo(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Timestamp getDataUpload() {
        return dataUpload;
    }

    public void setDataUpload(Timestamp dataUpload) {
        this.dataUpload = dataUpload;
    }
}
