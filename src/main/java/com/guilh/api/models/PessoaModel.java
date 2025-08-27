package com.guilh.api.models;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.util.UUID;

@Entity
@Table (name = "TBL_PESSOA")
public class PessoaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
