package org.saludyvida.app.service;

import org.saludyvida.app.models.Tarjetas;

import java.util.List;

public interface TarjetasServicio {
    List<Tarjetas> obtenerTarjetasPorUsuario(Long usuarioId);
    Tarjetas obtenerTarjetaPorId(Long id);
    Tarjetas guardarTarjeta(Tarjetas tarjeta);
    Tarjetas actualizarTarjeta(Tarjetas tarjeta, Long id);
    void eliminarTarjeta(Long id);
}