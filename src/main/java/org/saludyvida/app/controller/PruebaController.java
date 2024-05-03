package org.saludyvida.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaController {

    @GetMapping("/prueba")
    public String pruebaEndpoint() {
        return "Endpoint de prueba accedido correctamente";
    }
}