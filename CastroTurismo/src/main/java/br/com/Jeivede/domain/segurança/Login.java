/**
 * 
 */
package br.com.Jeivede.domain.segurança;

import java.io.Serializable;

import br.com.Jeivede.domain.pessoal.Funcionario;

/**
 * @author jeivede.0941
 *
 */
@SuppressWarnings("serial")
public class Login implements Serializable {
	
	private Integer Id;
	
	private String Login;
	
	private String Senha;
	
	private Funcionario funcionario;

	/**
	 * 
	 */
	public Login() {
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
	 * @return the login
	 */
	public String getLogin() {
		return Login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		Login = login;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return Senha;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		Senha = senha;
	}

	/**
	 * @return the funcionario
	 */
	public Funcionario getFuncionario() {
		return funcionario;
	}

	/**
	 * @param funcionario the funcionario to set
	 */
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((Login == null) ? 0 : Login.hashCode());
		result = prime * result + ((Senha == null) ? 0 : Senha.hashCode());
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
		Login other = (Login) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (Login == null) {
			if (other.Login != null)
				return false;
		} else if (!Login.equals(other.Login))
			return false;
		if (Senha == null) {
			if (other.Senha != null)
				return false;
		} else if (!Senha.equals(other.Senha))
			return false;
		return true;
	}
}

	