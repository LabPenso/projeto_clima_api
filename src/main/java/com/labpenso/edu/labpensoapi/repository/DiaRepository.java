package com.labpenso.edu.labpensoapi.repository;

import com.labpenso.edu.labpensoapi.model.Dia;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface DiaRepository extends JpaRepository<Dia, Long> {
    Dia findByData(LocalDate data);
    List<Dia> findByDataBetween(LocalDate dataInicio, LocalDate dataFim);
    List<Dia> findByDataAfter(LocalDate data);
}
