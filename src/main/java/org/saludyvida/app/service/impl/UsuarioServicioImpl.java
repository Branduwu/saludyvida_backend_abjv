package org.saludyvida.app.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.saludyvida.app.models.Usuarios;
import org.saludyvida.app.repository.UsuariosRepository;
import org.saludyvida.app.service.UsuarioServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicioImpl implements UsuarioServicios {

    @Autowired
    private UsuariosRepository usuariosRepository;

    @Override
    public Usuarios obtenerUsuarioPorId(Long id) {
        return usuariosRepository.findById(id).orElse(null);
    }

    @Override
    public Usuarios obtenerUsuarioPorCorreo(String correo) {
        return usuariosRepository.findByCorreo(correo);
    }

    @Override
    public Usuarios guardarUsuario(Usuarios usuario) {
        return usuariosRepository.save(usuario);
    }

    @Override
    public List<Usuarios> obtenerUsuariosActivos() {
        return usuariosRepository.findByEstatus("activo");
    }

    @Override
    public List<Usuarios> obtenerUsuariosInactivos() {
        return usuariosRepository.findByEstatus("inactivo");
    }

    @Override
    public List<Usuarios> obtenerTodosLosUsuarios(boolean esActivo) {
        String estatusDeseado = esActivo ? "activo" : "inactivo";
        return usuariosRepository.findAll().stream()
                .filter(usuario -> usuario.getEstatus().equalsIgnoreCase(estatusDeseado))
                .collect(Collectors.toList());
    }

    @Override
    public Usuarios actualizarUsuario(Usuarios usuario, Long id) {
        Usuarios usuarioExistente = usuariosRepository.findById(id).orElse(null);
        if (usuarioExistente != null) {
            usuarioExistente.setNombre(usuario.getNombre());
            usuarioExistente.setApellidos(usuario.getApellidos());
            usuarioExistente.setCorreo(usuario.getCorreo());
            usuarioExistente.setEstado(usuario.getEstatus());
            // Actualizar otros campos según sea necesario
            return usuariosRepository.save(usuarioExistente);
        }
        return null;
    }

    @Override
    public void eliminarUsuario(Long id) {
        usuariosRepository.deleteById(id);
    }
}