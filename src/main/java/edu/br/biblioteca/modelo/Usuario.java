package edu.br.biblioteca.modelo;

import java.util.List;

public class Usuario {
	
	private String matricula;
	private String email;
	private String senha;
	private List<Livro> livrosLocados;
	
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Usuario(String matricula, String email) {
		super();
		this.matricula = matricula;
		this.email = email;
		this.senha = "123456";
	}

	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Livro> getLivrosLocados() {
		return livrosLocados;
	}

	public void setLivrosLocados(List<Livro> livrosLocados) {
		this.livrosLocados = livrosLocados;
	}
	
}
