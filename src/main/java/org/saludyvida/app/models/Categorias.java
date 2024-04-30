package org.saludyvida.app.models;

import jakarta.persistence.*;


@Entity
@Table(name = "categorias")
public class Categorias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_categorias;

    @Column(name = "material")
    private String material;

    // Constructores, getters y setters
}