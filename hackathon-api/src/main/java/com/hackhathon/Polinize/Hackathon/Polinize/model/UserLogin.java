package com.hackhathon.Polinize.Hackathon.Polinize.model;
/*Tabela de UserLogin. O usuário que logar com Usuario e senha receberá um token
 * para ter acesso a outros endpoints
 */
public class UserLogin {
//Atributos da tabela
	private String nome;
	
	private String usuario;
	
	private String senha;
	
	private String token;

	public String getNome() {
		return nome;
	}
	//getters and setters

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
}
