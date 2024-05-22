package com.labpenso.edu.labpensoapi.repository;

import com.labpenso.edu.labpensoapi.model.Medicao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface MedicaoRepository extends JpaRepository<Medicao, Long> {

    Medicao findTopByOrderByTimestampDesc();

    List<Medicao> findByTimestampBetween(LocalDateTime inicio, LocalDateTime fim);
}
