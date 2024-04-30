package org.saludyvida.app.repository;

import java.util.List;

import org.saludyvida.app.models.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
    Usuarios findByCorreo(String correo);
    Usuarios findByNombresAndApellidos(String nombres, String apellidos);
    List<Usuarios> findByGenero(String genero);
    List<Usuarios> findByEstatus(String estatus);
    // Otros métodos de consulta personalizados si los necesitas
}