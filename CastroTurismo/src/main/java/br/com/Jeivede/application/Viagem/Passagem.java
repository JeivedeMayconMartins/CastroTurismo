/**
 * 
 */
package br.com.Jeivede.application.Viagem;

import java.io.Serializable;

import br.com.Jeivede.application.Etinerarios.Rota;
import br.com.Jeivede.domain.pessoal.Passageiro;

/**
 * @author jeivede.0941
 *
 */
public class Passagem implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer Id;
	
	private Integer NumeroPassagem;
	
	private String FormaDePagamento;
	
	private Boolean PossuiBagagem;
	
	private Integer NumeroPoltrona;
	
	private Passageiro passageiro;
	
	private Rota rota;

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
	 * @return the numeroPassagem
	 */
	public Integer getNumeroPassagem() {
		return NumeroPassagem;
	}

	/**
	 * @param numeroPassagem the numeroPassagem to set
	 */
	public void setNumeroPassagem(Integer numeroPassagem) {
		NumeroPassagem = numeroPassagem;
	}

	/**
	 * @return the formaDePagamento
	 */
	public String getFormaDePagamento() {
		return FormaDePagamento;
	}

	/**
	 * @param formaDePagamento the formaDePagamento to set
	 */
	public void setFormaDePagamento(String formaDePagamento) {
		FormaDePagamento = formaDePagamento;
	}

	/**
	 * @return the possuiBagagem
	 */
	public Boolean getPossuiBagagem() {
		return PossuiBagagem;
	}

	/**
	 * @param possuiBagagem the possuiBagagem to set
	 */
	public void setPossuiBagagem(Boolean possuiBagagem) {
		PossuiBagagem = possuiBagagem;
	}

	/**
	 * @return the numeroPoltrona
	 */
	public Integer getNumeroPoltrona() {
		return NumeroPoltrona;
	}

	/**
	 * @param numeroPoltrona the numeroPoltrona to set
	 */
	public void setNumeroPoltrona(Integer numeroPoltrona) {
		NumeroPoltrona = numeroPoltrona;
	}

	/**
	 * @return the passageiro
	 */
	public Passageiro getPassageiro() {
		return passageiro;
	}

	/**
	 * @param passageiro the passageiro to set
	 */
	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}

	/**
	 * @return the rota
	 */
	public Rota getRota() {
		return rota;
	}

	/**
	 * @param rota the rota to set
	 */
	public void setRota(Rota rota) {
		this.rota = rota;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((FormaDePagamento == null) ? 0 : FormaDePagamento.hashCode());
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((NumeroPassagem == null) ? 0 : NumeroPassagem.hashCode());
		result = prime * result + ((NumeroPoltrona == null) ? 0 : NumeroPoltrona.hashCode());
		result = prime * result + ((PossuiBagagem == null) ? 0 : PossuiBagagem.hashCode());
		result = prime * result + ((passageiro == null) ? 0 : passageiro.hashCode());
		result = prime * result + ((rota == null) ? 0 : rota.hashCode());
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
		Passagem other = (Passagem) obj;
		if (FormaDePagamento == null) {
			if (other.FormaDePagamento != null)
				return false;
		} else if (!FormaDePagamento.equals(other.FormaDePagamento))
			return false;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (NumeroPassagem == null) {
			if (other.NumeroPassagem != null)
				return false;
		} else if (!NumeroPassagem.equals(other.NumeroPassagem))
			return false;
		if (NumeroPoltrona == null) {
			if (other.NumeroPoltrona != null)
				return false;
		} else if (!NumeroPoltrona.equals(other.NumeroPoltrona))
			return false;
		if (PossuiBagagem == null) {
			if (other.PossuiBagagem != null)
				return false;
		} else if (!PossuiBagagem.equals(other.PossuiBagagem))
			return false;
		if (passageiro == null) {
			if (other.passageiro != null)
				return false;
		} else if (!passageiro.equals(other.passageiro))
			return false;
		if (rota == null) {
			if (other.rota != null)
				return false;
		} else if (!rota.equals(other.rota))
			return false;
		return true;
	}

}