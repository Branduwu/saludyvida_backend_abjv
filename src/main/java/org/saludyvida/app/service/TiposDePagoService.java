package org.saludyvida.app.service;

import org.saludyvida.app.models.TiposDePago;

import java.util.List;

public interface TiposDePagoService {
    List<TiposDePago> obtenerTodosTiposDePago();
    TiposDePago obtenerTipoDePagoPorId(Long id);
    TiposDePago guardarTipoDePago(TiposDePago tipoDePago);
    TiposDePago actualizarTipoDePago(TiposDePago tipoDePago, Long id);
    void eliminarTipoDePago(Long id);
	TiposDePago obtenerTipoDePagosPorId(Long id);
}