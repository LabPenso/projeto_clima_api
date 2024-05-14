package com.labpenso.edu.labpensoapi.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Teste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teste teste = (Teste) o;
        return Objects.equals(id, teste.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

