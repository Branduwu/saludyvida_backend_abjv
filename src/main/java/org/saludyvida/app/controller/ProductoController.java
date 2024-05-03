package org.saludyvida.app.controller;

import org.saludyvida.app.models.Lentes;
import org.saludyvida.app.service.LentesServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private LentesServicios lentesServicio;

    @GetMapping
    public String listarProductos(Model model) {
        List<Lentes> lentes = lentesServicio.obtenerTodosLosLentes();
        model.addAttribute("productos", lentes);
        return "listadoProductos";
    }

    @GetMapping("/{id}")
    public String obtenerProductoPorId(@PathVariable Long id, Model model) {
        Lentes lente = lentesServicio.obtenerLentePorId(id);
        model.addAttribute("producto", lente);
        return "detallesProducto";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevoProducto(Model model) {
        model.addAttribute("producto", new Lentes());
        return "formNuevoProducto";
    }

    @PostMapping("/guardar")
    public String guardarProducto(@ModelAttribute Lentes lente) {
        lentesServicio.guardarLente(lente);
        return "redirect:/productos";
    }

    // Otros métodos similares
}