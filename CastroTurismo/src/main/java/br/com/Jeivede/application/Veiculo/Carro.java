/**
 * 
 */
package br.com.Jeivede.application.Veiculo;

import java.io.Serializable;

/**
 * @author jeivede.0941
 *
 */
public class Carro extends Veiculo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private setorEnum Setor;

	/**
	 * 
	 */
	public Carro() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the setor
	 */
	public setorEnum getSetor() {
		return Setor;
	}

	/**
	 * @param setor the setor to set
	 */
	public void setSetor(setorEnum setor) {
		Setor = setor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((Setor == null) ? 0 : Setor.hashCode());
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
		Carro other = (Carro) obj;
		if (Setor != other.Setor)
			return false;
		return true;
	}
	
	

}
