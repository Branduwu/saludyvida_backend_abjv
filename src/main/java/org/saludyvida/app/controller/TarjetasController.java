package org.saludyvida.app.controller;

import org.saludyvida.app.models.Tarjetas;
import org.saludyvida.app.service.TarjetasServicio;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarjetas")
public class TarjetasController {

    @Autowired
    private TarjetasServicio tarjetasServicio;

    @GetMapping("/usuario/{usuarioId}")
    public String obtenerTarjetasPorUsuario(@PathVariable Long usuarioId, Model model) {
        List<Tarjetas> tarjetas = tarjetasServicio.obtenerTarjetasPorUsuario(usuarioId);
        model.addAttribute("tarjetas", tarjetas);
        return "listaTarjetas";
    }

    @GetMapping("/{id}")
    public String obtenerTarjetaPorId(@PathVariable Long id, Model model) {
        Tarjetas tarjeta = tarjetasServicio.obtenerTarjetaPorId(id);
        model.addAttribute("tarjeta", tarjeta);
        return "detallesTarjeta";
    }

    @GetMapping("/nueva")
    public String mostrarFormularioNuevaTarjeta(Model model) {
        model.addAttribute("tarjeta", new Tarjetas());
        return "formNuevaTarjeta";
    }

    @PostMapping("/guardar")
    public String guardarTarjeta(@ModelAttribute Tarjetas tarjeta) {
        tarjetasServicio.guardarTarjeta(tarjeta);
        return "redirect:/tarjetas/" + tarjeta.getId();
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarTarjeta(@PathVariable Long id, Model model) {
        Tarjetas tarjeta = tarjetasServicio.obtenerTarjetaPorId(id);
        model.addAttribute("tarjeta", tarjeta);
        return "formEditarTarjeta";
    }

    @PostMapping("/actualizar/{id}")
    public String actualizarTarjeta(@ModelAttribute Tarjetas tarjeta, @PathVariable Long id) {
        tarjetasServicio.actualizarTarjeta(tarjeta, id);
        return "redirect:/tarjetas/" + tarjeta.getId();
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarTarjeta(@PathVariable Long id) {
        tarjetasServicio.eliminarTarjeta(id);
        return "redirect:/tarjetas";
    }
}