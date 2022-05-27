/**
 * 
 */
package br.com.Jeivede.domain.pessoal;

import java.io.Serializable;

/**
 * @author jeivede.0941
 *
 */
public class Menores implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Boolean autorizacaoDeEmbarque;
	
	private Passageiro Responsavel;

	/**
	 * 
	 */
	public Menores() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the autorizacaoDeEmbarque
	 */
	public Boolean getAutorizacaoDeEmbarque() {
		return autorizacaoDeEmbarque;
	}

	/**
	 * @param autorizacaoDeEmbarque the autorizacaoDeEmbarque to set
	 */
	public void setAutorizacaoDeEmbarque(Boolean autorizacaoDeEmbarque) {
		this.autorizacaoDeEmbarque = autorizacaoDeEmbarque;
	}

	/**
	 * @return the responsavel
	 */
	public Passageiro getResponsavel() {
		return Responsavel;
	}

	/**
	 * @param responsavel the responsavel to set
	 */
	public void setResponsavel(Passageiro responsavel) {
		Responsavel = responsavel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Responsavel == null) ? 0 : Responsavel.hashCode());
		result = prime * result + ((autorizacaoDeEmbarque == null) ? 0 : autorizacaoDeEmbarque.hashCode());
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
		Menores other = (Menores) obj;
		if (Responsavel == null) {
			if (other.Responsavel != null)
				return false;
		} else if (!Responsavel.equals(other.Responsavel))
			return false;
		if (autorizacaoDeEmbarque == null) {
			if (other.autorizacaoDeEmbarque != null)
				return false;
		} else if (!autorizacaoDeEmbarque.equals(other.autorizacaoDeEmbarque))
			return false;
		return true;
	}
	
	

}
