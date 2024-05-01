package org.saludyvida.app.repository;

import org.saludyvida.app.models.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Long> {
    // Puedes agregar métodos de consulta personalizados aquí si lo necesitas
}