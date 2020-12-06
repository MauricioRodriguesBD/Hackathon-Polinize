package com.hackhathon.Polinize.Hackathon.Polinize.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/*Tabela de UserLogin. O usuário que logar com Usuario e senha receberá um token
 * para ter acesso a outros endpoints
 */
@Entity
@Table(name = "usuario")
public class Usuario {
	//atributos da tabela
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String nome;
	private String usuario;
	private String senha;
	
	//getters and setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
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
	
	
	
}
