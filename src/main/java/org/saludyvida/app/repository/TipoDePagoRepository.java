package org.saludyvida.app.repository;

import org.saludyvida.app.models.TiposDePago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDePagoRepository extends JpaRepository<TiposDePago, Long> {
    // Puedes agregar métodos de consulta personalizados aquí si lo necesitas
}