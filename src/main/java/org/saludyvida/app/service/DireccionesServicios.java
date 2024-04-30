package org.saludyvida.app.service;

import org.saludyvida.app.models.Direcciones;
import java.util.List;

public interface DireccionesServicios {
    Direcciones obtenerDireccionPorId(Long id);
    List<Direcciones> obtenerDireccionesPorUsuario(Long usuarioId);
    Direcciones guardarDireccion(Direcciones direccion);
    Direcciones actualizarDireccion(Direcciones direccion, Long id);
    void eliminarDireccion(Long id);
}