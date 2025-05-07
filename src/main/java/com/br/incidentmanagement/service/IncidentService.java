package com.br.incidentmanagement.service;

import com.br.incidentmanagement.entity.Incident;
import com.br.incidentmanagement.repository.IncidentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class IncidentService {

    private final IncidentRepository repository;

    public IncidentService(IncidentRepository repository) {
        this.repository = repository;
    }

    public Incident saveIncident(Incident incident) {
        incident.setCreatedAt(LocalDateTime.now());
        return repository.save(incident);
    }

    public Incident updateIncident(Long id, Incident updatedIncident) {
        updatedIncident.setIdIncident(id);
        updatedIncident.setUpdatedAt(LocalDateTime.now());
        return repository.save(updatedIncident);
    }

    public void deleteIncident(Long id) {
        repository.deleteById(id);
    }

    public Optional<Incident> getIncidentById(Long id) {
        return repository.findById(id);
    }

    public List<Incident> getAllIncidents() {
        return repository.findAll();
    }

    public List<Incident> getLast20Incidents() {
        return repository.findTop20ByOrderByCreatedAtDesc();
    }
}
