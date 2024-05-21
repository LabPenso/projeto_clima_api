package com.labpenso.edu.labpensoapi.repository;

import com.labpenso.edu.labpensoapi.model.Medicao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicaoRepository extends JpaRepository<Medicao, Long> {

}
