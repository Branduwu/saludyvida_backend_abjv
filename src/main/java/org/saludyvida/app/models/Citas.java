package org.saludyvida.app.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "citas")
public class Citas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_citas;

    

    @Column(name = "fecha_hora_cita")
    private Date fecha_hora_cita;

    // Constructores, getters y setters
    
    @ManyToOne
	@JoinColumn(name = "id_usuarios")
	private Usuarios usuarios;
}

