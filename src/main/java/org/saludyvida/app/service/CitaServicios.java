package org.saludyvida.app.service;

import org.saludyvida.app.models.Citas;
import java.util.Date;
import java.util.List;

public interface CitaServicios {
    Citas obtenerCitaPorId(Long id);
    List<Citas> obtenerCitasPorFechaHora(Date fechaInicio, Date fechaFin);
    List<Citas> obtenerCitasPorUsuario(Long usuarioId);
    Citas guardarCita(Citas cita);
    Citas actualizarCita(Citas cita, Long id);
    void eliminarCita(Long id);
}

