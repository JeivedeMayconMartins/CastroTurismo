/**
 * 
 */
package br.com.Jeivede.application.Etinerarios;

import java.io.Serializable;

import br.com.Jeivede.domain.pessoal.Rodoviaria;

/**
 * @author jeivede.0941
 *
 */
public class Rota implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer Id;
	
	private Rodoviaria Origem;
	
	private Rodoviaria Destino;
	
	private Double Quilometragem;
	
	private Double PrecoPassagem;

	/**
	 * 
	 */
	public Rota() {
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
	 * @return the origem
	 */
	public Rodoviaria getOrigem() {
		return Origem;
	}

	/**
	 * @param origem the origem to set
	 */
	public void setOrigem(Rodoviaria origem) {
		Origem = origem;
	}

	/**
	 * @return the destino
	 */
	public Rodoviaria getDestino() {
		return Destino;
	}

	/**
	 * @param destino the destino to set
	 */
	public void setDestino(Rodoviaria destino) {
		Destino = destino;
	}

	/**
	 * @return the quilometragem
	 */
	public Double getQuilometragem() {
		return Quilometragem;
	}

	/**
	 * @param quilometragem the quilometragem to set
	 */
	public void setQuilometragem(Double quilometragem) {
		Quilometragem = quilometragem;
	}

	/**
	 * @return the precoPassagem
	 */
	public Double getPrecoPassagem() {
		return PrecoPassagem;
	}

	/**
	 * @param precoPassagem the precoPassagem to set
	 */
	public void setPrecoPassagem(Double precoPassagem) {
		PrecoPassagem = precoPassagem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Destino == null) ? 0 : Destino.hashCode());
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((Origem == null) ? 0 : Origem.hashCode());
		result = prime * result + ((PrecoPassagem == null) ? 0 : PrecoPassagem.hashCode());
		result = prime * result + ((Quilometragem == null) ? 0 : Quilometragem.hashCode());
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
		Rota other = (Rota) obj;
		if (Destino == null) {
			if (other.Destino != null)
				return false;
		} else if (!Destino.equals(other.Destino))
			return false;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (Origem == null) {
			if (other.Origem != null)
				return false;
		} else if (!Origem.equals(other.Origem))
			return false;
		if (PrecoPassagem == null) {
			if (other.PrecoPassagem != null)
				return false;
		} else if (!PrecoPassagem.equals(other.PrecoPassagem))
			return false;
		if (Quilometragem == null) {
			if (other.Quilometragem != null)
				return false;
		} else if (!Quilometragem.equals(other.Quilometragem))
			return false;
		return true;
	}

}
