package org.saludyvida.app.service.impl;

import org.saludyvida.app.models.Tarjetas;
import org.saludyvida.app.models.Usuarios;
import org.saludyvida.app.repository.TarjetasRepository;
import org.saludyvida.app.repository.UsuariosRepository;
import org.saludyvida.app.service.TarjetasServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarjetasServicioImpl implements TarjetasServicio {

    @Autowired
    private TarjetasRepository tarjetasRepository;

    @Autowired
    private UsuariosRepository usuarioRepository;

    @Override
    public List<Tarjetas> obtenerTarjetasPorUsuario(Long usuarioId) {
        Usuarios usuario = usuarioRepository.findById(usuarioId)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con el id: " + usuarioId));
        return tarjetasRepository.findByUsuarios(usuario);
    }

    @Override
    public Tarjetas obtenerTarjetaPorId(Long id) {
        return tarjetasRepository.findById(id).orElse(null);
    }

    @Override
    public Tarjetas guardarTarjeta(Tarjetas tarjeta) {
        return tarjetasRepository.save(tarjeta);
    }

    @Override
    public Tarjetas actualizarTarjeta(Tarjetas tarjeta, Long id) {
        Tarjetas tarjetaExistente = tarjetasRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarjeta no encontrada con el id: " + id));

        tarjetaExistente.setNumeroTarjeta(tarjeta.getNumeroTarjeta());
        tarjetaExistente.setFechaExpiracion(tarjeta.getFechaExpiracion());
        tarjetaExistente.setCvv(tarjeta.getCvv());
        // Actualizar otros campos de la tarjeta si es necesario

        return tarjetasRepository.save(tarjetaExistente);
    }

    @Override
    public void eliminarTarjeta(Long id) {
        tarjetasRepository.deleteById(id);
    }
}