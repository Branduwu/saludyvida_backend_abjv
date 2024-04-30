package org.saludyvida.app.models;



import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "lentes_has_categorias")
public class LentesHasCategorias {

    @EmbeddedId
    private LenteCategoriaId id ;

    public LentesHasCategorias() {
    	
    }
    
    public LentesHasCategorias(LenteCategoriaId id) {
    	this.id = id;
    }
    
	public LenteCategoriaId getId() {
		return id;
	}

	public void setId(LenteCategoriaId id) {
		id = id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LentesHasCategorias [Id=");
		builder.append(id);
		builder.append(", getId()=");
		builder.append(getId());
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
class LenteCategoriaId implements Serializable{
	@ManyToOne

	@JoinColumn(name = "id_lentes")
	private Lentes lentes;

	@ManyToOne

	@JoinColumn(name = "id_categorias")
	private Categorias categorias; 
	
public LenteCategoriaId() {
	
}

public LenteCategoriaId(Lentes lentes, Categorias categorias) {
	this.lentes = lentes;
	this.categorias = categorias;
}

public Lentes getLentes() {
	return lentes;
}

public void setLentes(Lentes lentes) {
	this.lentes = lentes;
}

public Categorias getCategorias() {
	return categorias;
}

public void setCategorias(Categorias categorias) {
	this.categorias = categorias;
}

@Override
public int hashCode() {
	return Objects.hash(categorias, lentes);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	LenteCategoriaId other = (LenteCategoriaId) obj;
	return Objects.equals(categorias, other.categorias) && Objects.equals(lentes, other.lentes);
}

}
