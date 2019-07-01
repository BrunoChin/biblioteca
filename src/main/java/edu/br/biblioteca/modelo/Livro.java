package edu.br.biblioteca.modelo;

public class Livro {
	private String titulo;
	private int numPaginas;
	private String autor;
	
	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Livro(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getTitula() {
		return titulo;
	}
	public void setTitula(String titula) {
		this.titulo = titula;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
}
