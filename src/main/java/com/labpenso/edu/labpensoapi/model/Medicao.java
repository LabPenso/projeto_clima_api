package com.labpenso.edu.labpensoapi.model;

import java.time.LocalDateTime;
public class Medicao {
    private String idEstacao; // id da estacao que fez a medicao
    private LocalDateTime timestamp;
    private int numeroMedicao; //numero que indica a medicao dentro de uma hora
    private double temperatura;
    private double umidade;

    //depois adicionar mais props

    public Medicao(LocalDateTime timestamp, int numeroMedicao, double temperatura, double umidade, String idEstacao) {
        this.timestamp = timestamp;
        this.numeroMedicao = numeroMedicao;
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.idEstacao = idEstacao;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public int getNumero() {
        return numeroMedicao;
    }

    public void setNumero(int numeroMedicao) {
        this.numeroMedicao = numeroMedicao;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getUmidade() {
        return umidade;
    }

    public void setUmidade(double umidade) {
        this.umidade = umidade;
    }
}