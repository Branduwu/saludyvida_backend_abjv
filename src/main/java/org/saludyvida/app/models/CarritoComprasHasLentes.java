package org.saludyvida.app.models;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "carrito_compras_has_lentes")
public class CarritoComprasHasLentes {

	@EmbeddedId
	 private CarritoComprasHasLentesId id ;
	@Column(name = "cantidad")
	private String cantidad;
	
	public CarritoComprasHasLentes() {
		
	}
	public CarritoComprasHasLentes(CarritoComprasHasLentesId id, String cantidad) {
		this.id = id; 
		this.cantidad = cantidad;
		}
	
	public CarritoComprasHasLentesId getId() {
		return id;
	}

	public void setId(CarritoComprasHasLentesId id) {
		this.id = id;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
}
   class CarritoComprasHasLentesId implements Serializable{
	   
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1682067346547342984L;

	@ManyToOne

		@JoinColumn(name = "id_carrito")
		private CarritoCompra carritoComprarrito;
		
		@ManyToOne

		@JoinColumn(name = "id_lentes")
		private Lentes lentes;

		public CarritoComprasHasLentesId() {
			
		}
		public CarritoComprasHasLentesId(CarritoCompra carritoComprarrito, Lentes lentes) {
			this.carritoComprarrito = carritoComprarrito; 
			this.lentes = lentes;
			}
		
		public CarritoCompra getCarritoComprarrito() {
			return carritoComprarrito;
		}

		public void setCarritoComprarrito(CarritoCompra carritoComprarrito) {
			this.carritoComprarrito = carritoComprarrito;
		}

		public Lentes getLentes() {
			return lentes;
		}

		public void setLentes(Lentes lentes) {
			this.lentes = lentes;
		}

		@Override
		public int hashCode() {
			return Objects.hash(carritoComprarrito, lentes);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			CarritoComprasHasLentesId other = (CarritoComprasHasLentesId) obj;
			return Objects.equals(carritoComprarrito, other.carritoComprarrito) && Objects.equals(lentes, other.lentes);
		}

	
   }
