package com.br.incidentmanagement.service;

import com.br.incidentmanagement.entity.Incident;
import com.br.incidentmanagement.repository.IncidentRepository;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class IncidentServiceTest {

    private final IncidentRepository repository = mock(IncidentRepository.class);
    private final IncidentService service = new IncidentService(repository);

    @Test
    void shouldSaveIncident() {
        Incident incident = new Incident();
        incident.setName("Test Incident");

        when(repository.save(any(Incident.class))).thenReturn(incident);

        Incident saved = service.saveIncident(incident);

        assertNotNull(saved);
        assertEquals("Test Incident", saved.getName());
    }

    @Test
    void shouldUpdateIncident() {
        Incident incident = new Incident();
        incident.setName("Old Name");

        when(repository.save(any(Incident.class))).thenReturn(incident);

        Incident updated = service.updateIncident(1L, incident);

        assertEquals(1L, updated.getIdIncident());
    }

    @Test
    void shouldDeleteIncident() {
        service.deleteIncident(1L);
        verify(repository, times(1)).deleteById(1L);
    }

    @Test
    void shouldGetIncidentById() {
        Incident incident = new Incident();
        when(repository.findById(1L)).thenReturn(Optional.of(incident));

        Optional<Incident> found = service.getIncidentById(1L);

        assertTrue(found.isPresent());
    }

    @Test
    void shouldGetAllIncidents() {
        when(repository.findAll()).thenReturn(List.of(new Incident(), new Incident()));

        List<Incident> incidents = service.getAllIncidents();

        assertEquals(2, incidents.size());
    }

    @Test
    void shouldGetLast20Incidents() {
        when(repository.findTop20ByOrderByCreatedAtDesc()).thenReturn(List.of(new Incident(), new Incident()));

        List<Incident> incidents = service.getLast20Incidents();

        assertEquals(2, incidents.size());
    }
}
