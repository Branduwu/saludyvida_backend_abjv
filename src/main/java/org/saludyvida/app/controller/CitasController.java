package org.saludyvida.app.controller;

/*import org.saludyvida.app.models.Citas;
import org.saludyvida.app.service.CitaServicios;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/citas")
public class CitasController {

    private final CitaServicios citaServicio;

    public CitasController(CitaServicios citaServicio) {
        this.citaServicio = citaServicio;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Citas> obtenerCitaPorId(@PathVariable Long id) {
        Citas cita = citaServicio.obtenerCitaPorId(id);
        return ResponseEntity.ok(cita);
    }

    @GetMapping
    public ResponseEntity<List<Citas>> obtenerCitasPorFechaHora(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date fechaInicio,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date fechaFin) {
        List<Citas> citas = citaServicio.obtenerCitasPorFechaHora(fechaInicio, fechaFin);
        return ResponseEntity.ok(citas);
    }

    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<List<Citas>> obtenerCitasPorUsuario(@PathVariable Long usuarioId) {
        List<Citas> citas = citaServicio.obtenerCitasPorUsuario(usuarioId);
        return ResponseEntity.ok(citas);
    }

    @PostMapping
    public ResponseEntity<Citas> crearCita(@RequestBody Citas cita) {
        Citas citaCreada = citaServicio.guardarCita(cita);
        return ResponseEntity.status(HttpStatus.CREATED).body(citaCreada);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Citas> actualizarCita(@PathVariable Long id, @RequestBody Citas cita) {
        Citas citaActualizada = citaServicio.actualizarCita(cita, id);
        return ResponseEntity.ok(citaActualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCita(@PathVariable Long id) {
        citaServicio.eliminarCita(id);
        return ResponseEntity.noContent().build();
    }
}*/