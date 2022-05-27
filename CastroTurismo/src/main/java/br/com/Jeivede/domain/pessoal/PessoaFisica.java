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
public class PessoaFisica extends Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer xCpf;
	
	private Integer xRg;
	
	private String OrgaoEmisor;
	
	private Date DataNascimento;

	/**
	 * 
	 */
	public PessoaFisica() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the xCpf
	 */
	public Integer getxCpf() {
		return xCpf;
	}

	/**
	 * @param xCpf the xCpf to set
	 */
	public void setxCpf(Integer xCpf) {
		this.xCpf = xCpf;
	}

	/**
	 * @return the xRg
	 */
	public Integer getxRg() {
		return xRg;
	}

	/**
	 * @param xRg the xRg to set
	 */
	public void setxRg(Integer xRg) {
		this.xRg = xRg;
	}

	/**
	 * @return the orgaoEmisor
	 */
	public String getOrgaoEmisor() {
		return OrgaoEmisor;
	}

	/**
	 * @param orgaoEmisor the orgaoEmisor to set
	 */
	public void setOrgaoEmisor(String orgaoEmisor) {
		OrgaoEmisor = orgaoEmisor;
	}

	/**
	 * @return the dataNascimento
	 */
	public Date getDataNascimento() {
		return DataNascimento;
	}

	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(Date dataNascimento) {
		DataNascimento = dataNascimento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((DataNascimento == null) ? 0 : DataNascimento.hashCode());
		result = prime * result + ((OrgaoEmisor == null) ? 0 : OrgaoEmisor.hashCode());
		result = prime * result + ((xCpf == null) ? 0 : xCpf.hashCode());
		result = prime * result + ((xRg == null) ? 0 : xRg.hashCode());
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
		PessoaFisica other = (PessoaFisica) obj;
		if (DataNascimento == null) {
			if (other.DataNascimento != null)
				return false;
		} else if (!DataNascimento.equals(other.DataNascimento))
			return false;
		if (OrgaoEmisor == null) {
			if (other.OrgaoEmisor != null)
				return false;
		} else if (!OrgaoEmisor.equals(other.OrgaoEmisor))
			return false;
		if (xCpf == null) {
			if (other.xCpf != null)
				return false;
		} else if (!xCpf.equals(other.xCpf))
			return false;
		if (xRg == null) {
			if (other.xRg != null)
				return false;
		} else if (!xRg.equals(other.xRg))
			return false;
		return true;
	}

}
