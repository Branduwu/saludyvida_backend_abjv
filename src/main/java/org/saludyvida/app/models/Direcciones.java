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

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getCalle() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setCalle(Object calle2) {
		// TODO Auto-generated method stub
		
	}

	public Object getColonia() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getMunicipio_alcaldia() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setColonia(Object colonia2) {
		// TODO Auto-generated method stub
		
	}

	public void setMunicipio_alcaldia(Object municipio_alcaldia2) {
		// TODO Auto-generated method stub
		
	}

	public Object getEstado1() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getCodigo_postal() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getEstado() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setEstado(Object estado2) {
		// TODO Auto-generated method stub
		
	}

	public void setCodigo_postal(Object codigo_postal2) {
		// TODO Auto-generated method stub
		
	}
}