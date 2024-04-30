package org.saludyvida.app.service;

import org.saludyvida.app.models.Usuarios;
import java.util.List;

public interface UsuarioServicios {
    Usuarios obtenerUsuarioPorId(Long id);
    Usuarios obtenerUsuarioPorCorreo(String correo);
    Usuarios guardarUsuario(Usuarios usuario);
    List<Usuarios> obtenerUsuariosActivos();
    List<Usuarios> obtenerUsuariosInactivos();
    List<Usuarios> obtenerTodosLosUsuarios(boolean esActivo);
    Usuarios actualizarUsuario(Usuarios usuario, Long id);
    void eliminarUsuario(Long id);
}