package com.labpenso.edu.labpensoapi.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Medicao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String idEstacao;

    @Column(nullable = false)
    private LocalDateTime timestamp;

    @Column(nullable = false)
    private int numeroMedicao;

    private float temperatura;
    private float umidade;
    private float percentualUV;
    private float nivelUV;
    private float pressao;
    private float luminosidade;
    private float mlChuva;

    @ManyToOne
    @JoinColumn(name = "hora_id", nullable = false)
    private Hora hora;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdEstacao() {
        return idEstacao;
    }

    public void setIdEstacao(String idEstacao) {
        this.idEstacao = idEstacao;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public int getNumeroMedicao() {
        return numeroMedicao;
    }

    public void setNumeroMedicao(int numeroMedicao) {
        this.numeroMedicao = numeroMedicao;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getUmidade() {
        return umidade;
    }

    public void setUmidade(float umidade) {
        this.umidade = umidade;
    }

    public float getPercentualUV() {
        return percentualUV;
    }

    public void setPercentualUV(float percentualUV) {
        this.percentualUV = percentualUV;
    }

    public float getNivelUV() {
        return nivelUV;
    }

    public void setNivelUV(float nivelUV) {
        this.nivelUV = nivelUV;
    }

    public float getPressao() {
        return pressao;
    }

    public void setPressao(float pressao) {
        this.pressao = pressao;
    }

    public float getLuminosidade() {
        return luminosidade;
    }

    public void setLuminosidade(float luminosidade) {
        this.luminosidade = luminosidade;
    }

    public float getMlChuva() {
        return mlChuva;
    }

    public void setMlChuva(float mlChuva) {
        this.mlChuva = mlChuva;
    }

    public Hora getHora() {
        return hora;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medicao medicao = (Medicao) o;
        return numeroMedicao == medicao.numeroMedicao &&
                Float.compare(medicao.temperatura, temperatura) == 0 &&
                Float.compare(medicao.umidade, umidade) == 0 &&
                Float.compare(medicao.percentualUV, percentualUV) == 0 &&
                Float.compare(medicao.nivelUV, nivelUV) == 0 &&
                Float.compare(medicao.pressao, pressao) == 0 &&
                Float.compare(medicao.luminosidade, luminosidade) == 0 &&
                Float.compare(medicao.mlChuva, mlChuva) == 0 &&
                Objects.equals(id, medicao.id) &&
                Objects.equals(idEstacao, medicao.idEstacao) &&
                Objects.equals(timestamp, medicao.timestamp) &&
                Objects.equals(hora, medicao.hora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idEstacao, timestamp, numeroMedicao, temperatura, umidade, percentualUV, nivelUV, pressao, luminosidade, mlChuva, hora);
    }
}
