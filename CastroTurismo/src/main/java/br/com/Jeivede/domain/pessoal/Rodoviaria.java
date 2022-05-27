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
public class Rodoviaria extends PessoaFisica implements Serializable {
	
	private String HoraAbertura;
	
	private String HoraFechamento;
	
	private Double TaxaEmbarque;

	/**
	 * 
	 */
	public Rodoviaria() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the horaAbertura
	 */
	public String getHoraAbertura() {
		return HoraAbertura;
	}

	/**
	 * @param horaAbertura the horaAbertura to set
	 */
	public void setHoraAbertura(String horaAbertura) {
		HoraAbertura = horaAbertura;
	}

	/**
	 * @return the horaFechamento
	 */
	public String getHoraFechamento() {
		return HoraFechamento;
	}

	/**
	 * @param horaFechamento the horaFechamento to set
	 */
	public void setHoraFechamento(String horaFechamento) {
		HoraFechamento = horaFechamento;
	}

	/**
	 * @return the taxaEmbarque
	 */
	public Double getTaxaEmbarque() {
		return TaxaEmbarque;
	}

	/**
	 * @param taxaEmbarque the taxaEmbarque to set
	 */
	public void setTaxaEmbarque(Double taxaEmbarque) {
		TaxaEmbarque = taxaEmbarque;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((HoraAbertura == null) ? 0 : HoraAbertura.hashCode());
		result = prime * result + ((HoraFechamento == null) ? 0 : HoraFechamento.hashCode());
		result = prime * result + ((TaxaEmbarque == null) ? 0 : TaxaEmbarque.hashCode());
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
		Rodoviaria other = (Rodoviaria) obj;
		if (HoraAbertura == null) {
			if (other.HoraAbertura != null)
				return false;
		} else if (!HoraAbertura.equals(other.HoraAbertura))
			return false;
		if (HoraFechamento == null) {
			if (other.HoraFechamento != null)
				return false;
		} else if (!HoraFechamento.equals(other.HoraFechamento))
			return false;
		if (TaxaEmbarque == null) {
			if (other.TaxaEmbarque != null)
				return false;
		} else if (!TaxaEmbarque.equals(other.TaxaEmbarque))
			return false;
		return true;
	}

}
