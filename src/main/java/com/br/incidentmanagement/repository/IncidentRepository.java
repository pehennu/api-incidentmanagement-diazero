package com.br.incidentmanagement.repository;

import com.br.incidentmanagement.entity.Incident;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IncidentRepository extends JpaRepository<Incident, Long> {
    List<Incident> findTop20ByOrderByCreatedAtDesc();
}
