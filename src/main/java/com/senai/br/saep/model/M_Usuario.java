package com.senai.br.saep.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class M_Usuario {
    @Id
    private String email;
    private String nome;

    // Construtores, getters e setters
    public M_Usuario() {}

    public M_Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
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
}
