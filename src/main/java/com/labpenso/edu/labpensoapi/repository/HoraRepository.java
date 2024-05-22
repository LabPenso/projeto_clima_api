package com.labpenso.edu.labpensoapi.repository;

import com.labpenso.edu.labpensoapi.model.Dia;
import com.labpenso.edu.labpensoapi.model.Hora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface HoraRepository extends JpaRepository<Hora, Long> {

    List<Hora> findByDiaData(LocalDate dia);

    Hora findByInicioAndDia(LocalDateTime inicio, Dia dia);

    List<Hora> findByInicioBetweenAndDia(LocalDateTime inicio, LocalDateTime fim, Dia dia);

    List<Hora> findByInicioAfterAndDia(LocalDateTime inicio, Dia dia);
}
