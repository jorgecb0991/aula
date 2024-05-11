package com.digital.aula.repository;

import com.digital.aula.model.Aula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AulaRepository extends JpaRepository<Aula, Long> {
}
