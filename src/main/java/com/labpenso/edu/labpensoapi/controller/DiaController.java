/*
package com.labpenso.edu.labpensoapi.controller;

import com.labpenso.edu.labpensoapi.model.Dia;
import com.labpenso.edu.labpensoapi.repository.DiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/dia")
public class DiaController {

    @Autowired
    private DiaRepository diaRepository;

    @GetMapping
    public List<Dia> listarDias() {
        return diaRepository.findAll();
    }

    @GetMapping("/{data}")
    public Dia buscarDiaPorData(@PathVariable LocalDate data) {
        return diaRepository.findByData(data);
    }

    @GetMapping("/entre/{dataInicio}/{dataFim}")
    public List<Dia> buscarDiasEntre(@PathVariable LocalDate dataInicio, @PathVariable LocalDate dataFim) {
        return diaRepository.findByDataBetween(dataInicio, dataFim);
    }

    @GetMapping("/apos/{data}")
    public List<Dia> buscarDiasApos(@PathVariable LocalDate data) {
        return diaRepository.findByDataAfter(data);
    }
}*/
