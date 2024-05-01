package org.saludyvida.app.controller;

import org.saludyvida.app.models.TiposDePago;
import org.saludyvida.app.service.TiposDePagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tiposDePago")
public class TipoDePagoController {

    @Autowired
    private TiposDePagoService tiposDePagoService;

    @GetMapping
    public String listarTiposDePago(Model model) {
        model.addAttribute("tiposDePago", tiposDePagoService.obtenerTodosTiposDePago());
        return "tiposDePago";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevoTipoDePago(Model model) {
        model.addAttribute("tipoDePago", new TiposDePago());
        return "formNuevoTipoDePago";
    }

    @PostMapping("/guardar")
    public String guardarTipoDePago(@ModelAttribute TiposDePago tipoDePago) {
        tiposDePagoService.guardarTipoDePago(tipoDePago);
        return "redirect:/tiposDePago";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarTipoDePago(@PathVariable Long id, Model model) {
        TiposDePago tipoDePago = tiposDePagoService.obtenerTipoDePagoPorId(id);
        model.addAttribute("tipoDePago", tipoDePago);
        return "formEditarTipoDePago";
    }

    @PostMapping("/actualizar/{id}")
    public String actualizarTipoDePago(@ModelAttribute TiposDePago tipoDePago, @PathVariable Long id) {
        tiposDePagoService.actualizarTipoDePago(tipoDePago, id);
        return "redirect:/tiposDePago";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarTipoDePago(@PathVariable Long id) {
        tiposDePagoService.eliminarTipoDePago(id);
        return "redirect:/tiposDePago";
    }
}