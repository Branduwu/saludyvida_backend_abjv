package org.saludyvida.app.controller;

import org.saludyvida.app.models.Direcciones;
import org.saludyvida.app.service.DireccionesServicios;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/direcciones")
public class DireccionesController {

    private final DireccionesServicios direccionesServicio;

    public DireccionesController(DireccionesServicios direccionesServicio) {
        this.direccionesServicio = direccionesServicio;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Direcciones> obtenerDireccionPorId(@PathVariable Long id) {
        Direcciones direccion = direccionesServicio.obtenerDireccionPorId(id);
        return ResponseEntity.ok(direccion);
    }

    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<List<Direcciones>> obtenerDireccionesPorUsuario(@PathVariable Long usuarioId) {
        List<Direcciones> direcciones = direccionesServicio.obtenerDireccionesPorUsuario(usuarioId);
        return ResponseEntity.ok(direcciones);
    }

    @PostMapping
    public ResponseEntity<Direcciones> crearDireccion(@RequestBody Direcciones direccion) {
        Direcciones direccionCreada = direccionesServicio.guardarDireccion(direccion);
        return ResponseEntity.status(HttpStatus.CREATED).body(direccionCreada);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Direcciones> actualizarDireccion(@PathVariable Long id, @RequestBody Direcciones direccion) {
        Direcciones direccionActualizada = direccionesServicio.actualizarDireccion(direccion, id);
        return ResponseEntity.ok(direccionActualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarDireccion(@PathVariable Long id) {
        direccionesServicio.eliminarDireccion(id);
        return ResponseEntity.noContent().build();
    }
}