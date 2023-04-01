// Alunos: Brenda Reimberg
//         Felipe Moreira
//         Matheus Graciki
//         Mirele Veira
//         Ricardo Sommer Barbosa

package br.com.example.exemplo_spring.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //parte do Banco de dados
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Livro {

	@Id
	@GeneratedValue // os @ é anotação do Spring Boot
	private Long id;
	private String titulo;
	private String nomeAutor;
	private int isbn;
	private String editora;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	
	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

}