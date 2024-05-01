package org.saludyvida.app.repository;

import org.saludyvida.app.models.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
    // No es necesario definir el método findById, ya está definido en JpaRepository
    // Optional<Usuarios> findById(Long usuarioId);

    // Otros métodos de consulta personalizados si los necesitas
}
