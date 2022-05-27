/**
 * 
 */
package br.com.Jeivede.domain.pessoal;

import java.io.Serializable;

/**
 * @author jeivede.0941
 *
 */
public class Passageiro extends PessoaFisica implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String TipoDeCartao;
	
	private String ValidadeDoCartao;
	
	private String NumeroCartao;

	/**
	 * 
	 */
	public Passageiro() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the tipoDeCartao
	 */
	public String getTipoDeCartao() {
		return TipoDeCartao;
	}

	/**
	 * @param tipoDeCartao the tipoDeCartao to set
	 */
	public void setTipoDeCartao(String tipoDeCartao) {
		TipoDeCartao = tipoDeCartao;
	}

	/**
	 * @return the validadeDoCartao
	 */
	public String getValidadeDoCartao() {
		return ValidadeDoCartao;
	}

	/**
	 * @param validadeDoCartao the validadeDoCartao to set
	 */
	public void setValidadeDoCartao(String validadeDoCartao) {
		ValidadeDoCartao = validadeDoCartao;
	}

	/**
	 * @return the numeroCartao
	 */
	public String getNumeroCartao() {
		return NumeroCartao;
	}

	/**
	 * @param numeroCartao the numeroCartao to set
	 */
	public void setNumeroCartao(String numeroCartao) {
		NumeroCartao = numeroCartao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((NumeroCartao == null) ? 0 : NumeroCartao.hashCode());
		result = prime * result + ((TipoDeCartao == null) ? 0 : TipoDeCartao.hashCode());
		result = prime * result + ((ValidadeDoCartao == null) ? 0 : ValidadeDoCartao.hashCode());
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
		Passageiro other = (Passageiro) obj;
		if (NumeroCartao == null) {
			if (other.NumeroCartao != null)
				return false;
		} else if (!NumeroCartao.equals(other.NumeroCartao))
			return false;
		if (TipoDeCartao == null) {
			if (other.TipoDeCartao != null)
				return false;
		} else if (!TipoDeCartao.equals(other.TipoDeCartao))
			return false;
		if (ValidadeDoCartao == null) {
			if (other.ValidadeDoCartao != null)
				return false;
		} else if (!ValidadeDoCartao.equals(other.ValidadeDoCartao))
			return false;
		return true;
	}

}
