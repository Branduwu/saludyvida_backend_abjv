package org.saludyvida.app.service;

import org.saludyvida.app.models.Compras;
import java.util.Date;
import java.util.List;

public interface ComprasServicios {
    Compras obtenerCompraPorId(Long id);
    List<Compras> obtenerComprasPorUsuario(Long usuarioId);
    List<Compras> obtenerComprasPorFechaCompra(Date fechaInicio, Date fechaFin);
    Compras guardarCompra(Compras compra);
    Compras actualizarCompra(Compras compra, Long id);
    void eliminarCompra(Long id);
	List<Compras> obtenerTodasLasCompras();
}