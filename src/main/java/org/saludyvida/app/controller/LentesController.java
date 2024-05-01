package org.saludyvida.app.controller;

import org.saludyvida.app.models.Lentes;
import org.saludyvida.app.service.LentesServicios;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lentes")
public class LentesController {

    private final LentesServicios lenteServicio;
	@SuppressWarnings("unused")
	private LentesServicios lentesServicio;

    public LentesController(LentesServicios lentesServicio) {
        this.lenteServicio = null;
		this.lentesServicio = lentesServicio;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Lentes> obtenerLentePorId(@PathVariable Long id) {
        Lentes lente = lenteServicio.obtenerLentePorId(id);
        return ResponseEntity.ok(lente);
    }

    @GetMapping("/marca/{marca}")
    public ResponseEntity<List<Lentes>> obtenerLentesPorMarca(@PathVariable String marca) {
        List<Lentes> lentes = lenteServicio.obtenerLentesPorMarca(marca);
        return ResponseEntity.ok(lentes);
    }

    @GetMapping
    public ResponseEntity<List<Lentes>> obtenerLentesPorPrecio(
            @RequestParam(required = false) Double precioMin,
            @RequestParam(required = false) Double precioMax) {
        List<Lentes> lentes = lenteServicio.obtenerLentesPorPrecio(precioMin, precioMax);
        return ResponseEntity.ok(lentes);
    }

    @PostMapping
    public ResponseEntity<Lentes> crearLente(@RequestBody Lentes lente) {
        Lentes lenteCreado = lenteServicio.guardarLente(lente);
        return ResponseEntity.status(HttpStatus.CREATED).body(lenteCreado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Lentes> actualizarLente(@PathVariable Long id, @RequestBody Lentes lente) {
        Lentes lenteActualizado = lenteServicio.actualizarLente(lente, id);
        return ResponseEntity.ok(lenteActualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarLente(@PathVariable Long id) {
        lenteServicio.eliminarLente(id);
        return ResponseEntity.noContent().build();
    }
}