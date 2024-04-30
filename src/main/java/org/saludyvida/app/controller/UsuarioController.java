package org.saludyvida.app.controller;

import org.saludyvida.app.models.Usuarios;
import org.saludyvida.app.service.UsuarioServicios;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioServicios usuarioServicio;

    public UsuarioController(UsuarioServicios usuarioServicio) {
        this.usuarioServicio = usuarioServicio;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuarios> obtenerUsuarioPorId(@PathVariable Long id) {
        Usuarios usuario = usuarioServicio.obtenerUsuarioPorId(id);
        return ResponseEntity.ok(usuario);
    }

    @GetMapping
    public ResponseEntity<List<Usuarios>> obtenerUsuarios(@RequestParam(required = false) Boolean esActivo) {
        List<Usuarios> usuarios = usuarioServicio.obtenerTodosLosUsuarios(esActivo);
        return ResponseEntity.ok(usuarios);
    }

    @PostMapping
    public ResponseEntity<Usuarios> crearUsuario(@RequestBody Usuarios usuario) {
        Usuarios usuarioCreado = usuarioServicio.guardarUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioCreado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuarios> actualizarUsuario(@PathVariable Long id, @RequestBody Usuarios usuario) {
        Usuarios usuarioActualizado = usuarioServicio.actualizarUsuario(usuario, id);
        return ResponseEntity.ok(usuarioActualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarUsuario(@PathVariable Long id) {
        usuarioServicio.eliminarUsuario(id);
        return ResponseEntity.noContent().build();
    }
}