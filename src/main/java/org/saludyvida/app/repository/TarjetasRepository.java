package org.saludyvida.app.repository;

import org.saludyvida.app.models.Tarjetas;
import org.saludyvida.app.models.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TarjetasRepository extends JpaRepository<Tarjetas, Long> {
    List<Tarjetas> findByUsuarios(Usuarios usuario);
}