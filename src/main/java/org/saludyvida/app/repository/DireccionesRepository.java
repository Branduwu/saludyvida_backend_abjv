package org.saludyvida.app.repository;

import org.saludyvida.app.models.Direcciones;
import org.saludyvida.app.models.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DireccionesRepository extends JpaRepository<Direcciones, Long> {
    List<Direcciones> findByUsuarios(Usuarios usuario);
}