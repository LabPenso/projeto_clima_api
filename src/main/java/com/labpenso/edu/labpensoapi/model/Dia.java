package com.labpenso.edu.labpensoapi.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Dia {

    private LocalDate data;
    private List<Hora> horas;

    public Dia(LocalDate data) {
        this.data = data;
        this.horas = new ArrayList<>();
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public List<Hora> getHoras() {
        return horas;
    }

    public void addHora(Hora hora) {
        horas.add(hora);
    }
}

