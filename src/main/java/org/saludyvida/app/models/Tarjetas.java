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

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getNumeroTarjeta() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getFechaExpiracion() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setNumeroTarjeta(Object numeroTarjeta) {
		// TODO Auto-generated method stub
		
	}

	public void setFechaExpiracion(Object fechaExpiracion) {
		// TODO Auto-generated method stub
		
	}

	public Object getCvv() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setCvv(Object cvv) {
		// TODO Auto-generated method stub
		
	}

    // Constructores, getters y setters
}