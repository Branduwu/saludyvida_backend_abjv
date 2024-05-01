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

	public Object getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setNombre(Object nombre) {
		// TODO Auto-generated method stub
		
	}

    // Constructores, getters y setters
}