/**
 * 
 */
package br.com.Jeivede.domain.pessoal;

import java.io.Serializable;

/**
 * @author jeivede.0941
 *
 */
@SuppressWarnings("serial")
public class Funcionario extends PessoaFisica implements Serializable {
	
	private Integer NumeroDeRegistro;
	
	private Boolean EstaAtivo;

	/**
	 * 
	 */
	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the numeroDeRegistro
	 */
	public Integer getNumeroDeRegistro() {
		return NumeroDeRegistro;
	}

	/**
	 * @param numeroDeRegistro the numeroDeRegistro to set
	 */
	public void setNumeroDeRegistro(Integer numeroDeRegistro) {
		NumeroDeRegistro = numeroDeRegistro;
	}

	/**
	 * @return the estaAtivo
	 */
	public Boolean getEstaAtivo() {
		return EstaAtivo;
	}

	/**
	 * @param estaAtivo the estaAtivo to set
	 */
	public void setEstaAtivo(Boolean estaAtivo) {
		EstaAtivo = estaAtivo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((EstaAtivo == null) ? 0 : EstaAtivo.hashCode());
		result = prime * result + ((NumeroDeRegistro == null) ? 0 : NumeroDeRegistro.hashCode());
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
		Funcionario other = (Funcionario) obj;
		if (EstaAtivo == null) {
			if (other.EstaAtivo != null)
				return false;
		} else if (!EstaAtivo.equals(other.EstaAtivo))
			return false;
		if (NumeroDeRegistro == null) {
			if (other.NumeroDeRegistro != null)
				return false;
		} else if (!NumeroDeRegistro.equals(other.NumeroDeRegistro))
			return false;
		return true;
	}

	

}
