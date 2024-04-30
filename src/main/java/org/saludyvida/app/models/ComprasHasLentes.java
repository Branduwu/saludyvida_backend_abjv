package org.saludyvida.app.models;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "compras_has_lentes")
public class ComprasHasLentes {

	@EmbeddedId
	 private ComprasHasLentesId id ;
	@Column(name = "cantidad")
	private String cantidad;
	
	public ComprasHasLentes() {
		
	}
	
    public ComprasHasLentes(ComprasHasLentesId id, String cantidad) {
	this.id = id; 
	this.cantidad = cantidad;
	}

	public ComprasHasLentesId getId() {
		return id;
	}

	public void setId(ComprasHasLentesId id) {
		this.id = id;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ComprasHasLentes [id=");
		builder.append(id);
		builder.append(", cantidad=");
		builder.append(cantidad);
		builder.append(", getId()=");
		builder.append(getId());
		builder.append(", getCantidad()=");
		builder.append(getCantidad());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
@Embeddable
class ComprasHasLentesId implements Serializable{
	@ManyToOne

	@JoinColumn(name = "compras_id_compras")
	private Compras compras;
	
	@ManyToOne

	@JoinColumn(name = "lentes_id_lentes")
	private Lentes lentes;

	public Compras getCompras() {
		return compras;
	}

	public void setCompras(Compras compras) {
		this.compras = compras;
	}

	public Lentes getLentes() {
		return lentes;
	}

	public void setLentes(Lentes lentes) {
		this.lentes = lentes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(compras, lentes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComprasHasLentesId other = (ComprasHasLentesId) obj;
		return Objects.equals(compras, other.compras) && Objects.equals(lentes, other.lentes);
	}
	
}