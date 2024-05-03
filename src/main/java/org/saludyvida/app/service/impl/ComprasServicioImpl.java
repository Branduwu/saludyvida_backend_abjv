package org.saludyvida.app.service.impl;

import org.saludyvida.app.models.Compras;
import org.saludyvida.app.service.ComprasServicios;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ComprasServicioImpl implements ComprasServicios {

    @Override
    public Compras obtenerCompraPorId(Long id) {
        // Implementación
        return null;
    }

    @Override
    public List<Compras> obtenerComprasPorUsuario(Long usuarioId) {
        // Implementación
        return null;
    }

    @Override
    public List<Compras> obtenerComprasPorFechaCompra(Date fechaInicio, Date fechaFin) {
        // Implementación
        return null;
    }

    @Override
    public Compras guardarCompra(Compras compra) {
        // Implementación
        return null;
    }

    @Override
    public Compras actualizarCompra(Compras compra, Long id) {
        // Implementación
        return null;
    }

    @Override
    public void eliminarCompra(Long id) {
        // Implementación
    }

	@Override
	public List<Compras> obtenerTodasLasCompras() {
		// TODO Auto-generated method stub
		return null;
	}
}