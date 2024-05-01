package org.saludyvida.app.service;

import org.saludyvida.app.models.Direcciones;

import java.util.List;

public interface DireccionesServicio {
    List<Direcciones> obtenerDireccionesPorUsuario(Long usuarioId);
    Direcciones obtenerDireccionPorId(Long id);
    Direcciones guardarDireccion(Direcciones direccion);
    Direcciones actualizarDireccion(Direcciones direccion, Long id);
    void eliminarDireccion(Long id);
}