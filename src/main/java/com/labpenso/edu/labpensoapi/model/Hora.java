package com.labpenso.edu.labpensoapi.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Hora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime inicio;

    @Column(nullable = false)
    private LocalDateTime fim;

    @ManyToOne
    @JoinColumn(name = "dia_id", nullable = false)
    private Dia dia;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }

    public Dia getDia() {
        return dia;
    }

    public void setDia(Dia dia) {
        this.dia = dia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hora hora = (Hora) o;
        return Objects.equals(id, hora.id) &&
                Objects.equals(inicio, hora.inicio) &&
                Objects.equals(fim, hora.fim) &&
                Objects.equals(dia, hora.dia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, inicio, fim, dia);
    }
}
