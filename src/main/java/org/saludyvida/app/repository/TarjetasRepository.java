package org.saludyvida.app.repository;

import java.util.List;

import org.saludyvida.app.models.Tarjetas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarjetasRepository extends JpaRepository<Tarjetas, Long> {
    List<Tarjetas> findByUsuariosIdUsuarios(Long usuarioId);
    // Otros métodos de consulta personalizados si los necesitas
}