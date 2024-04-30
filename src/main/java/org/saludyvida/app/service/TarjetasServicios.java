package org.saludyvida.app.service;

import org.saludyvida.app.models.Tarjetas;
import java.util.List;

public interface TarjetasServicios {
    Tarjetas obtenerTarjetaPorId(Long id);
    List<Tarjetas> obtenerTarjetasPorUsuario(Long usuarioId);
    Tarjetas guardarTarjeta(Tarjetas tarjeta);
    Tarjetas actualizarTarjeta(Tarjetas tarjeta, Long id);
    void eliminarTarjeta(Long id);
}