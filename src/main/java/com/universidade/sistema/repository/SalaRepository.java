package com.universidade.sistema.repository;

import com.universidade.sistema.model.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SalaRepository extends JpaRepository<Sala, Long> {
    List<Sala> findByAtivoTrue();
    List<Sala> findByAtivoFalse();
}
