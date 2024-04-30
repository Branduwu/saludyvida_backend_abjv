package org.saludyvida.app.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tipos de pago")
public class TiposDePago {

    @Id
    private Long id_tipo_pago;

    @Column(name = "descripcion_tipo_pago")
    private String descripcion_tipo_pago;
    
    @ManyToOne
	@JoinColumn(name = "id_usuarios")
	private Usuarios usuarios;

    // Constructores, getters y setters
}