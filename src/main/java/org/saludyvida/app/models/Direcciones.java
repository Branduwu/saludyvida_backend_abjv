package org.saludyvida.app.models;


import jakarta.persistence.*;

@Entity
@Table(name = "direcciones")
public class Direcciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_direcciones;

   

    @Column(name = "calle")
    private String calle;

    @Column(name = "colonia")
    private String colonia;

    @Column(name = "municipio_alcaldia")
    private String municipio_alcaldia;

    @Column(name = "estado")
    private String estado;

    @Column(name = "codigo_postal")
    private String codigo_postal;

    @ManyToOne
	@JoinColumn(name = "id_usuarios")
	private Usuarios usuarios;
    // Constructores, getters y setters
}