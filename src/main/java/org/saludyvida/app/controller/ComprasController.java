package org.saludyvida.app.controller;

import org.saludyvida.app.models.Compras;
import org.saludyvida.app.service.ComprasServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/compras")
public class ComprasController {

    @Autowired
    private ComprasServicios comprasServicio;

    @GetMapping("/{id}")
    public String obtenerCompraPorId(@PathVariable Long id, Model model) {
        Compras compra = comprasServicio.obtenerCompraPorId(id);
        model.addAttribute("compra", compra);
        return "detallesCompra";
    }

    @GetMapping("/usuario/{usuarioId}")
    public String obtenerComprasPorUsuario(@PathVariable Long usuarioId, Model model) {
        List<Compras> compras = comprasServicio.obtenerComprasPorUsuario(usuarioId);
        model.addAttribute("compras", compras);
        return "historialComprasUsuario";
    }

    @GetMapping("/fecha")
    public String obtenerComprasPorFechaCompra(
            @RequestParam("fechaInicio") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fechaInicio,
            @RequestParam("fechaFin") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fechaFin,
            Model model) {
        List<Compras> compras = comprasServicio.obtenerComprasPorFechaCompra(fechaInicio, fechaFin);
        model.addAttribute("compras", compras);
        return "historialComprasPorFecha";
    }

    @GetMapping("/nueva")
    public String mostrarFormularioNuevaCompra(Model model) {
        model.addAttribute("compra", new Compras());
        return "formNuevaCompra";
    }

    @PostMapping("/guardar")
    public String guardarCompra(@ModelAttribute Compras compra) {
        comprasServicio.guardarCompra(compra);
        return "redirect:/compras/" + compra.getId();
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarCompra(@PathVariable Long id, Model model) {
        Compras compra = comprasServicio.obtenerCompraPorId(id);
        model.addAttribute("compra", compra);
        return "formEditarCompra";
    }

    @PostMapping("/actualizar/{id}")
    public String actualizarCompra(@ModelAttribute Compras compra, @PathVariable Long id) {
        comprasServicio.actualizarCompra(compra, id);
        return "redirect:/compras/" + compra.getId();
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarCompra(@PathVariable Long id) {
        comprasServicio.eliminarCompra(id);
        return "redirect:/compras";
    }
}