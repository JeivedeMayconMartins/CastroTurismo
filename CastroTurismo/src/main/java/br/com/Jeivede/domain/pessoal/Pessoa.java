package br.com.Jeivede.domain.pessoal;

import java.io.Serializable;

import br.com.Jeivede.domain.local.Cidade;

public abstract class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer Id;
	
	private String Numero;
	
	private String Telefone;
	
	private String Email;
	
	private String Logradouro;
	
	private String Complemento;
	
	private String Nome;
	
	private Cidade cidade;

	/**
	 * 
	 */
	public Pessoa() {
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
	 * @return the numero
	 */
	public String getNumero() {
		return Numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		Numero = numero;
	}

	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return Telefone;
	}

	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
	}

	/**
	 * @return the logradouro
	 */
	public String getLogradouro() {
		return Logradouro;
	}

	/**
	 * @param logradouro the logradouro to set
	 */
	public void setLogradouro(String logradouro) {
		Logradouro = logradouro;
	}

	/**
	 * @return the complemento
	 */
	public String getComplemento() {
		return Complemento;
	}

	/**
	 * @param complemento the complemento to set
	 */
	public void setComplemento(String complemento) {
		Complemento = complemento;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return Nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		Nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
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
		Pessoa other = (Pessoa) obj;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		return true;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	

}
