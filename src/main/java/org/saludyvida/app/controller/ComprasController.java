package org.saludyvida.app.controller;

import org.saludyvida.app.models.Compras;
import org.saludyvida.app.service.ComprasServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/compras")
public class ComprasController {

    @Autowired
    private ComprasServicios comprasServicio;

    @GetMapping
    public List<Compras> listarCompras() {
        return comprasServicio.obtenerTodasLasCompras();
    }

    @GetMapping("/{id}")
    public Compras obtenerCompraPorId(@PathVariable Long id) {
        return comprasServicio.obtenerCompraPorId(id);
    }

    @GetMapping("/usuario/{usuarioId}")
    public List<Compras> obtenerComprasPorUsuario(@PathVariable Long usuarioId) {
        return comprasServicio.obtenerComprasPorUsuario(usuarioId);
    }

    @GetMapping("/fecha")
    public List<Compras> obtenerComprasPorFechaCompra(
            @RequestParam("fechaInicio") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fechaInicio,
            @RequestParam("fechaFin") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fechaFin) {
        return comprasServicio.obtenerComprasPorFechaCompra(fechaInicio, fechaFin);
    }

    @PostMapping
    public Compras guardarCompra(@RequestBody Compras compra) {
        return comprasServicio.guardarCompra(compra);
    }

    @PutMapping("/{id}")
    public Compras actualizarCompra(@RequestBody Compras compra, @PathVariable Long id) {
        return comprasServicio.actualizarCompra(compra, id);
    }

    @DeleteMapping("/{id}")
    public void eliminarCompra(@PathVariable Long id) {
        comprasServicio.eliminarCompra(id);
    }
}