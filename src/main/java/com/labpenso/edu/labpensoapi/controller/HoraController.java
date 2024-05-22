/*
package com.labpenso.edu.labpensoapi.controller;

import com.labpenso.edu.labpensoapi.model.Dia;
import com.labpenso.edu.labpensoapi.model.Hora;
import com.labpenso.edu.labpensoapi.repository.DiaRepository;
import com.labpenso.edu.labpensoapi.repository.HoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/hora")
public class HoraController {

    @Autowired
    private HoraRepository horaRepository;

    @Autowired
    private DiaRepository diaRepository;

    @GetMapping("/{dia}")
    public List<Hora> listarHoras(@PathVariable LocalDate dia) {
        return horaRepository.findByDiaData(dia);
    }

    @GetMapping("/{dia}/{inicio}")
    public Hora buscarHoraPorInicio(@PathVariable LocalDate dia, @PathVariable LocalDateTime inicio) {
        Dia diaObj = diaRepository.findByData(dia);
        return horaRepository.findByInicioAndDia(inicio, diaObj);
    }

    @GetMapping("/{dia}/entre/{inicio}/{fim}")
    public List<Hora> buscarHorasEntre(@PathVariable LocalDate dia, @PathVariable LocalDateTime inicio, @PathVariable LocalDateTime fim) {
        Dia diaObj = diaRepository.findByData(dia);
        return horaRepository.findByInicioBetweenAndDia(inicio, fim, diaObj);
    }

    @GetMapping("/{dia}/apos/{inicio}")
    public List<Hora> buscarHorasApos(@PathVariable LocalDate dia, @PathVariable LocalDateTime inicio) {
        Dia diaObj = diaRepository.findByData(dia);
        return horaRepository.findByInicioAfterAndDia(inicio, diaObj);
    }
}
*/
