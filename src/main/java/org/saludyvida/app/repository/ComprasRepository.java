package org.saludyvida.app.repository;

import org.saludyvida.app.models.Compras;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Date;
import java.util.List;

public interface ComprasRepository extends JpaRepository<Compras, Long> {
    List<Compras> findByIdUsuario(Long usuarioId);
    List<Compras> findByFechaCompraBetween(Date fechaInicio, Date fechaFin);
    // Otros métodos de consulta personalizados si los necesitas
}