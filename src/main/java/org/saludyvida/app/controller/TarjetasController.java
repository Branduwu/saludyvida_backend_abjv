package org.saludyvida.app.controller;

import org.saludyvida.app.models.Tarjetas;
import org.saludyvida.app.service.TarjetasServicios;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tarjetas")
public class TarjetasController {

    private final TarjetasServicios tarjetasServicio;

    public TarjetasController(TarjetasServicios tarjetasServicio) {
        this.tarjetasServicio = tarjetasServicio;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tarjetas> obtenerTarjetaPorId(@PathVariable Long id) {
        Tarjetas tarjeta = tarjetasServicio.obtenerTarjetaPorId(id);
        return ResponseEntity.ok(tarjeta);
    }

    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<List<Tarjetas>> obtenerTarjetasPorUsuario(@PathVariable Long usuarioId) {
        List<Tarjetas> tarjetas = tarjetasServicio.obtenerTarjetasPorUsuario(usuarioId);
        return ResponseEntity.ok(tarjetas);
    }

    @PostMapping
    public ResponseEntity<Tarjetas> crearTarjeta(@RequestBody Tarjetas tarjeta) {
        Tarjetas tarjetaCreada = tarjetasServicio.guardarTarjeta(tarjeta);
        return ResponseEntity.status(HttpStatus.CREATED).body(tarjetaCreada);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tarjetas> actualizarTarjeta(@PathVariable Long id, @RequestBody Tarjetas tarjeta) {
        Tarjetas tarjetaActualizada = tarjetasServicio.actualizarTarjeta(tarjeta, id);
        return ResponseEntity.ok(tarjetaActualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarTarjeta(@PathVariable Long id) {
        tarjetasServicio.eliminarTarjeta(id);
        return ResponseEntity.noContent().build();
    }
}