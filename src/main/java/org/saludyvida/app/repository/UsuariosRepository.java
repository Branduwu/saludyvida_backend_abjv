package org.saludyvida.app.repository;

import org.saludyvida.app.models.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
    Usuarios findByCorreo(String correo);
    List<Usuarios> findByEstatus(String estatus);
}