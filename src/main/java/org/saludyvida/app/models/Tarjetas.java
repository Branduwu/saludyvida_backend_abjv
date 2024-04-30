package org.saludyvida.app.models;

import jakarta.persistence.*;


@Entity
@Table(name = "tarjetas")
public class Tarjetas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tarjeta;

    @Column(name = "numero_tarjeta")
    private String numero_tarjeta;

    @Column(name = "expiracion")
    private String expiracion;

    @Column(name = "direccion_tarjeta")
    private String direccion_tarjeta;

    @ManyToOne
	@JoinColumn(name = "id_usuarios")
	private Usuarios usuarios;

    // Constructores, getters y setters
}