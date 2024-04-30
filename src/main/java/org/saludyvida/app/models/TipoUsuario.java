package org.saludyvida.app.models;

import jakarta.persistence.*;
;

@Entity
@Table(name = "tipo_usuario")
public class TipoUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tipo;

    @Column(name = "rol")
    private String rol;

    // Constructores, getters y setters
}