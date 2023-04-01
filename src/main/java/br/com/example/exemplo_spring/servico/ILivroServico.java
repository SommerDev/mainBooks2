package br.com.example.exemplo_spring.servico;

import java.util.List;
import br.com.example.exemplo_spring.servico.*;
import br.com.example.exemplo_spring.modelo.*;

public interface ILivroServico {

	public Livro salvarLivro(Livro livro);

	public Iterable<Livro> buscarTodosLivros();

	public Livro buscarLivroPorId(Long id);

	public void deletarLivroPorId(Long id);

	public void atualizarLivro(Livro livro);

}