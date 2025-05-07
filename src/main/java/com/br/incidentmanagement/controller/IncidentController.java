package com.br.incidentmanagement.controller;

import com.br.incidentmanagement.entity.Incident;
import com.br.incidentmanagement.service.IncidentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/incidents")
public class IncidentController {

    private final IncidentService service;

    public IncidentController(IncidentService service) {
        this.service = service;
    }

    @PostMapping
    public Incident createIncident(@RequestBody Incident incident) {
        return service.saveIncident(incident);
    }

    @PutMapping("/{id}")
    public Incident updateIncident(@PathVariable Long id, @RequestBody Incident incident) {
        return service.updateIncident(id, incident);
    }

    @DeleteMapping("/{id}")
    public void deleteIncident(@PathVariable Long id) {
        service.deleteIncident(id);
    }

    @GetMapping
    public List<Incident> getAllIncidents() {
        return service.getAllIncidents();
    }

    @GetMapping("/{id}")
    public Optional<Incident> getIncidentById(@PathVariable Long id) {
        return service.getIncidentById(id);
    }

    @GetMapping("/last20")
    public List<Incident> getLast20Incidents() {
        return service.getLast20Incidents();
    }
}
