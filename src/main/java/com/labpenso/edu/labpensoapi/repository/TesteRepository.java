package com.labpenso.edu.labpensoapi.repository;

import com.labpenso.edu.labpensoapi.model.Teste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TesteRepository extends JpaRepository<Teste, Long> {

}
