package com.labpenso.edu.labpensoapi.model;

import java.util.ArrayList;
import java.util.List;

public class Hora {
    private int hora;
    private List<Medicao> medicoes;

    public Hora(int hora) {
        this.hora = hora;
        this.medicoes = new ArrayList<>();
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public List<Medicao> getMedicoes() {
        return medicoes;
    }

    public void addMedicao(Medicao medicao) {
        medicoes.add(medicao);
    }
}

