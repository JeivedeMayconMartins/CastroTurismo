/**
 * 
 */
package br.com.Jeivede.domain.pessoal;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jeivede.0941
 *
 */
public class PessoaJuridica extends Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer xCnpj;
	
	private Integer InscricaoEstadual;
	
	private Date DataCriacao;

	/**
	 * 
	 */
	public PessoaJuridica() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the xCnpj
	 */
	public Integer getxCnpj() {
		return xCnpj;
	}

	/**
	 * @param xCnpj the xCnpj to set
	 */
	public void setxCnpj(Integer xCnpj) {
		this.xCnpj = xCnpj;
	}

	/**
	 * @return the inscricaoEstadual
	 */
	public Integer getInscricaoEstadual() {
		return InscricaoEstadual;
	}

	/**
	 * @param inscricaoEstadual the inscricaoEstadual to set
	 */
	public void setInscricaoEstadual(Integer inscricaoEstadual) {
		InscricaoEstadual = inscricaoEstadual;
	}

	/**
	 * @return the dataCriacao
	 */
	public Date getDataCriacao() {
		return DataCriacao;
	}

	/**
	 * @param dataCriacao the dataCriacao to set
	 */
	public void setDataCriacao(Date dataCriacao) {
		DataCriacao = dataCriacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((DataCriacao == null) ? 0 : DataCriacao.hashCode());
		result = prime * result + ((InscricaoEstadual == null) ? 0 : InscricaoEstadual.hashCode());
		result = prime * result + ((xCnpj == null) ? 0 : xCnpj.hashCode());
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
		PessoaJuridica other = (PessoaJuridica) obj;
		if (DataCriacao == null) {
			if (other.DataCriacao != null)
				return false;
		} else if (!DataCriacao.equals(other.DataCriacao))
			return false;
		if (InscricaoEstadual == null) {
			if (other.InscricaoEstadual != null)
				return false;
		} else if (!InscricaoEstadual.equals(other.InscricaoEstadual))
			return false;
		if (xCnpj == null) {
			if (other.xCnpj != null)
				return false;
		} else if (!xCnpj.equals(other.xCnpj))
			return false;
		return true;
	}
}
