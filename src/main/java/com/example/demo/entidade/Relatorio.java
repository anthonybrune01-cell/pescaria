package com.example.demo.entidade;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Data
public class Relatorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    private Usuario usuario;
    private String tipo;
    private String parametros;
    private Timestamp dataGeracao;

    public Relatorio(Long id, Usuario usuario, String tipo, String parametros, Timestamp dataGeracao) {
        this.id = id;
        this.usuario = usuario;
        this.tipo = tipo;
        this.parametros = parametros;
        this.dataGeracao = dataGeracao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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

    public String getParametros() {
        return parametros;
    }

    public void setParametros(String parametros) {
        this.parametros = parametros;
    }

    public Timestamp getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(Timestamp dataGeracao) {
        this.dataGeracao = dataGeracao;
    }
}
