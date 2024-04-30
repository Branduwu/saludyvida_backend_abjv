package org.saludyvida.app.models;

import java.sql.Date;

import jakarta.persistence.*;


@Entity
@Table(name = "carrito_compras")
public class CarritoCompra {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_carrito;

    @Column(name = "fecha_actualizacion")
    private Date fecha_actualizacion;

    

    // Constructores, getters y setters
}