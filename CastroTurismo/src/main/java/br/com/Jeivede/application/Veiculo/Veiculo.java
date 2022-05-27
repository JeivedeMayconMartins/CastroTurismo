/**
 * 
 */
package br.com.Jeivede.application.Veiculo;

import java.io.Serializable;

/**
 * @author jeivede.0941
 *
 */
public abstract class Veiculo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer Id;
	
	private String Placa;
	
	private Integer Renavam;
	
	private Integer Quilometragem;

	/**
	 * 
	 */
	public Veiculo() {
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
	 * @return the placa
	 */
	public String getPlaca() {
		return Placa;
	}

	/**
	 * @param placa the placa to set
	 */
	public void setPlaca(String placa) {
		Placa = placa;
	}

	/**
	 * @return the renavam
	 */
	public Integer getRenavam() {
		return Renavam;
	}

	/**
	 * @param renavam the renavam to set
	 */
	public void setRenavam(Integer renavam) {
		Renavam = renavam;
	}

	/**
	 * @return the quilometragem
	 */
	public Integer getQuilometragem() {
		return Quilometragem;
	}

	/**
	 * @param quilometragem the quilometragem to set
	 */
	public void setQuilometragem(Integer quilometragem) {
		Quilometragem = quilometragem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((Placa == null) ? 0 : Placa.hashCode());
		result = prime * result + ((Quilometragem == null) ? 0 : Quilometragem.hashCode());
		result = prime * result + ((Renavam == null) ? 0 : Renavam.hashCode());
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
		Veiculo other = (Veiculo) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (Placa == null) {
			if (other.Placa != null)
				return false;
		} else if (!Placa.equals(other.Placa))
			return false;
		if (Quilometragem == null) {
			if (other.Quilometragem != null)
				return false;
		} else if (!Quilometragem.equals(other.Quilometragem))
			return false;
		if (Renavam == null) {
			if (other.Renavam != null)
				return false;
		} else if (!Renavam.equals(other.Renavam))
			return false;
		return true;
	}
	


}
