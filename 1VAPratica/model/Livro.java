package model;

public class Livro {
	private String titulo,editora,autor;
	private String isbn;
	

	public Livro(String titulo, String autor, String editora, String isbn) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEdiora(String ediora) {
		this.editora = ediora;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}
