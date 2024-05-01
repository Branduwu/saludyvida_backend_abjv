package org.saludyvida.app.service.impl;

import org.saludyvida.app.models.TiposDePago;
import org.saludyvida.app.repository.TipoDePagoRepository;
import org.saludyvida.app.service.TiposDePagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiposDePagoServiceImpl implements TiposDePagoService {

    @Autowired
    private TipoDePagoRepository tipoDePagoRepository;

    @Override
    public List<TiposDePago> obtenerTodosTiposDePago() {
        return tipoDePagoRepository.findAll();
    }

    @Override
    public TiposDePago obtenerTipoDePagoPorId(Long id) {
        return tipoDePagoRepository.findById(id).orElse(null);
    }

    @Override
    public TiposDePago guardarTipoDePago(TiposDePago tiposDePago) {
        return tipoDePagoRepository.save(tiposDePago);
    }

    @Override
    public TiposDePago actualizarTipoDePago(TiposDePago tiposDePago, Long id) {
        TiposDePago tiposDePagoExistente = tipoDePagoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tipo de pago no encontrado con el id: " + id));

        tiposDePagoExistente.setDescripcionTipoPago(tiposDePago.getDescripcionTipoPago());

        return tipoDePagoRepository.save(tiposDePagoExistente);
    }

    @Override
    public void eliminarTipoDePago(Long id) {
        tipoDePagoRepository.deleteById(id);
    }

	@Override
	public TiposDePago obtenerTipoDePagosPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}