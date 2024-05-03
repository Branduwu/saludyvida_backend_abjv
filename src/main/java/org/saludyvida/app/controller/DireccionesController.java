package org.saludyvida.app.controller;

import org.saludyvida.app.models.Direcciones;
import org.saludyvida.app.service.DireccionesServicio;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/direcciones")
public class DireccionesController {

    @Autowired
    private DireccionesServicio direccionesServicio;

    @GetMapping("/usuario/{usuarioId}")
    public String obtenerDireccionesPorUsuario(@PathVariable Long usuarioId, Model model) {
        List<Direcciones> direcciones = direccionesServicio.obtenerDireccionesPorUsuario(usuarioId);
        model.addAttribute("direcciones", direcciones);
        return "listaDirecciones";
    }

    @GetMapping("/{id}")
    public String obtenerDireccionPorId(@PathVariable Long id, Model model) {
        Direcciones direccion = direccionesServicio.obtenerDireccionPorId(id);
        model.addAttribute("direccion", direccion);
        return "detallesDireccion";
    }

    @GetMapping("/nueva")
    public String mostrarFormularioNuevaDireccion(Model model) {
        model.addAttribute("direccion", new Direcciones());
        return "formNuevaDireccion";
    }

    @PostMapping("/guardar")
    public String guardarDireccion(@ModelAttribute Direcciones direccion) {
        direccionesServicio.guardarDireccion(direccion);
        return "redirect:/direcciones/" + direccion.getId();
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarDireccion(@PathVariable Long id, Model model) {
        Direcciones direccion = direccionesServicio.obtenerDireccionPorId(id);
        model.addAttribute("direccion", direccion);
        return "formEditarDireccion";
    }

    @PostMapping("/actualizar/{id}")
    public String actualizarDireccion(@ModelAttribute Direcciones direccion, @PathVariable Long id) {
        direccionesServicio.actualizarDireccion(direccion, id);
        return "redirect:/direcciones/" + direccion.getId();
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarDireccion(@PathVariable Long id) {
        direccionesServicio.eliminarDireccion(id);
        return "redirect:/direcciones";
    }
}