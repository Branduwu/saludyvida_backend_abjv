package org.saludyvida.app.repository;

import java.util.List;

import org.saludyvida.app.models.Lentes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LentesRepository extends JpaRepository<Lentes, Long> {
    List<Lentes> findByMarca(String marca);
    List<Lentes> findByPrecioBetween(Double precioMin, Double precioMax);
    // Otros métodos de consulta personalizados si los necesitas
}