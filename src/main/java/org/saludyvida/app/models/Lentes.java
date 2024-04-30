package org.saludyvida.app.models;

import jakarta.persistence.*;

@Entity
@Table(name = "lentes")
public class Lentes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_lentes;

    @Column(name = "nombre_lentes")
    private String nombre_lentes;

    @Column(name = "url_imagen")
    private String url_imagen;

    @Column(name = "marca")
    private String marca;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "largo")
    private String largo;

    @Column(name = "ancho")
    private String ancho;

    @Column(name = "alto")
    private String alto;

    @Column(name = "modelo_producto")
    private String modelo_producto;

    @Column(name = "sku")
    private String sku;

    @Column(name = "precio")
    private Double precio;

    // Constructores, getters y setters
}