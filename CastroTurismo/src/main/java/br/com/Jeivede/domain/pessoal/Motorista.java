/**
 * 
 */
package br.com.Jeivede.domain.pessoal;

import java.io.Serializable;

/**
 * @author jeivede.0941
 *
 */

public class Motorista extends Funcionario implements Serializable {
	    private static final long serialVersionUID = 1L;
	
	private Boolean Ear;
	
	private Integer xCnh;
	
	private String Categoria;

	/**
	 * 
	 */
	public Motorista() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the ear
	 */
	public Boolean getEar() {
		return Ear;
	}

	/**
	 * @param ear the ear to set
	 */
	public void setEar(Boolean ear) {
		Ear = ear;
	}

	/**
	 * @return the xCnh
	 */
	public Integer getxCnh() {
		return xCnh;
	}

	/**
	 * @param xCnh the xCnh to set
	 */
	public void setxCnh(Integer xCnh) {
		this.xCnh = xCnh;
	}

	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return Categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((Categoria == null) ? 0 : Categoria.hashCode());
		result = prime * result + ((Ear == null) ? 0 : Ear.hashCode());
		result = prime * result + ((xCnh == null) ? 0 : xCnh.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motorista other = (Motorista) obj;
		if (Categoria == null) {
			if (other.Categoria != null)
				return false;
		} else if (!Categoria.equals(other.Categoria))
			return false;
		if (Ear == null) {
			if (other.Ear != null)
				return false;
		} else if (!Ear.equals(other.Ear))
			return false;
		if (xCnh == null) {
			if (other.xCnh != null)
				return false;
		} else if (!xCnh.equals(other.xCnh))
			return false;
		return true;
	}
	

}
