package VO;

import java.io.Serializable;

public class LoginVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3166387366613069052L;
	
	private String nome;
	private String login;
	private String senha;
	private String tipo_conta;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getTipo_conta() {
		return tipo_conta;
	}
	public void setTipo_conta(String tipo_conta) {
		this.tipo_conta = tipo_conta;
	}

	
	
}
