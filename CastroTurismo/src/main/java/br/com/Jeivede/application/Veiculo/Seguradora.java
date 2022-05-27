/**
 * 
 */
package br.com.Jeivede.application.Veiculo;

import java.io.Serializable;

/**
 * @author jeivede.0941
 *
 */
public class Seguradora implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer Id;
	
	private String Nome;
	
	private String Corretora;
	
	private String Telefone;

	/**
	 * 
	 */
	public Seguradora() {
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
	public String getNome() {
		return Nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		Nome = nome;
	}

	/**
	 * @return the corretora
	 */
	public String getCorretora() {
		return Corretora;
	}

	/**
	 * @param corretora the corretora to set
	 */
	public void setCorretora(String corretora) {
		Corretora = corretora;
	}

	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return Telefone;
	}

	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Corretora == null) ? 0 : Corretora.hashCode());
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
		result = prime * result + ((Telefone == null) ? 0 : Telefone.hashCode());
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
		Seguradora other = (Seguradora) obj;
		if (Corretora == null) {
			if (other.Corretora != null)
				return false;
		} else if (!Corretora.equals(other.Corretora))
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
		if (Telefone == null) {
			if (other.Telefone != null)
				return false;
		} else if (!Telefone.equals(other.Telefone))
			return false;
		return true;
	}
	
	

}
