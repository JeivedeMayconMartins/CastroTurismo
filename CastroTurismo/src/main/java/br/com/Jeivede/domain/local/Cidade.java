/**
 * 
 */
package br.com.Jeivede.domain.local;

import java.io.Serializable;

/**
 * @author jeivede.0941
 *
 */
public class Cidade implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer Id;
	
	private Integer Nome;
	
	private Integer Estado;

	/**
	 * 
	 */
	public Cidade() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		Id = id;
	}

	/**
	 * @return the nome
	 */
	public Integer getNome() {
		return Nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(Integer nome) {
		Nome = nome;
	}

	/**
	 * @return the estado
	 */
	public Integer getEstado() {
		return Estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(Integer estado) {
		Estado = estado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Estado == null) ? 0 : Estado.hashCode());
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cidade other = (Cidade) obj;
		if (Estado == null) {
			if (other.Estado != null)
				return false;
		} else if (!Estado.equals(other.Estado))
			return false;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (Nome == null) {
			if (other.Nome != null)
				return false;
		} else if (!Nome.equals(other.Nome))
			return false;
		return true;
	}

}
