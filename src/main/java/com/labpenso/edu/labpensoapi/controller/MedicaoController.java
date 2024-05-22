package com.labpenso.edu.labpensoapi.controller;

import com.labpenso.edu.labpensoapi.model.Dia;
import com.labpenso.edu.labpensoapi.model.Hora;
import com.labpenso.edu.labpensoapi.model.Medicao;
import com.labpenso.edu.labpensoapi.repository.DiaRepository;
import com.labpenso.edu.labpensoapi.repository.HoraRepository;
import com.labpenso.edu.labpensoapi.repository.MedicaoRepository;
import com.labpenso.edu.labpensoapi.util.MedicaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MedicaoController {

    @Autowired
    private MedicaoRepository medicaoRepository;

    @Autowired
    private DiaRepository diaRepository;

    @Autowired
    private HoraRepository horaRepository;

    private MedicaoService medicaoService;

    @GetMapping("/dia/{data}/hora/{hora}/medicao/{numero}")
    public Medicao buscarPorNumero(@PathVariable LocalDate data, @PathVariable int hora, @PathVariable int numero) {
        LocalDateTime inicio = data.atTime(hora, 0);
        LocalDateTime fim = inicio.plusHours(1);
        List<Medicao> medicoes = medicaoRepository.findByTimestampBetween(inicio, fim);
        if (!medicoes.isEmpty() && numero <= medicoes.size()) {
            return medicoes.get(numero - 1);
        } else {
            return null;
        }
    }

    @GetMapping("/dia/{data}")
    public List<Medicao> listarPorDia(@PathVariable LocalDate data) {
        LocalDateTime inicio = data.atStartOfDay();
        LocalDateTime fim = data.atTime(LocalTime.MAX);
        return medicaoRepository.findByTimestampBetween(inicio, fim);
    }

    @GetMapping("/dia/{data}/hora/{hora}")
    public List<Medicao> listarPorHoraDoDia(@PathVariable LocalDate data, @PathVariable int hora) {
        LocalDateTime inicio = data.atTime(hora, 0);
        LocalDateTime fim = inicio.plusHours(1);
        return medicaoRepository.findByTimestampBetween(inicio, fim);
    }

    @PostMapping("/medicao")
    @ResponseStatus(HttpStatus.CREATED)
    public Medicao add(@RequestBody Medicao medicao) {
        // Obtém o horário de início da hora correspondente à medição
        LocalDateTime horaInicio = medicao.getTimestamp().truncatedTo(ChronoUnit.HOURS);

        // Busca ou cria a data correspondente à data da medição
        LocalDate data = medicao.getTimestamp().toLocalDate();
        Dia dia = diaRepository.findByData(data);
        if (dia == null) {
            dia = new Dia();
            dia.setData(data);
            // Salva o dia no banco de dados
            dia = diaRepository.save(dia);
        }

        // Busca a hora correspondente no banco de dados
        Hora hora = horaRepository.findByInicioAndDia(horaInicio, dia);

        // Se não encontrou, cria uma nova hora
        if (hora == null) {
            hora = new Hora();
            hora.setInicio(horaInicio);
            hora.setFim(horaInicio.plusHours(1)); // Adiciona uma hora ao início para obter o fim da hora
            hora.setDia(dia); // Associa a hora ao dia correspondente
            // Salva a hora no banco de dados
            hora = horaRepository.save(hora);
        }

        // Define a hora na medição
        medicao.setHora(hora);

        // Calcula o número de medição
        int numeroMedicao = medicaoService.calcularNumeroMedicao(horaInicio, medicao.getTimestamp());
        medicao.setNumeroMedicao(numeroMedicao);

        // Salva a medição no banco de dados
        return medicaoRepository.save(medicao);
    }

    @DeleteMapping("/medicao/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        medicaoRepository.deleteById(id);
    }
}
