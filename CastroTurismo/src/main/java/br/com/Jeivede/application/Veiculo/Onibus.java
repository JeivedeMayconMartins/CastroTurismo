/**
 * 
 */
package br.com.Jeivede.application.Veiculo;

import java.io.Serializable;

/**
 * @author jeivede.0941
 *
 */
public class Onibus extends Veiculo  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer Poltrona;

	/**
	 * 
	 */
	public Onibus() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the poltrona
	 */
	public Integer getPoltrona() {
		return Poltrona;
	}

	/**
	 * @param poltrona the poltrona to set
	 */
	public void setPoltrona(Integer poltrona) {
		Poltrona = poltrona;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Poltrona == null) ? 0 : Poltrona.hashCode());
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
		Onibus other = (Onibus) obj;
		if (Poltrona == null) {
			if (other.Poltrona != null)
				return false;
		} else if (!Poltrona.equals(other.Poltrona))
			return false;
		return true;
	}

}
