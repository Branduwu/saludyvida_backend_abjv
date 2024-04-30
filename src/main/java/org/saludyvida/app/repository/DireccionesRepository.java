package org.saludyvida.app.repository;

import org.saludyvida.app.models.Direcciones;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DireccionesRepository extends JpaRepository<Direcciones, Long> {
    List<Direcciones> findByUsuariosIdUsuarios(Long usuarioId);
    // Otros métodos de consulta personalizados si los necesitas
}