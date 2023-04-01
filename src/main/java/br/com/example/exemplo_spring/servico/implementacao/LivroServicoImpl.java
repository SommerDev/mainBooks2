// Alunos: Brenda Reimberg
//         Felipe Moreira
//         Matheus Graciki
//         Mirele Veira
//         Ricardo Sommer Barbosa

package br.com.example.exemplo_spring.servico.implementacao;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.example.exemplo_spring.excecao.LivroNaoEncontradaExcecao;
import br.com.example.exemplo_spring.modelo.Livro;
import br.com.example.exemplo_spring.repositorio.LivroRepositorio;
import br.com.example.exemplo_spring.servico.ILivroServico;
 
@Service
public class LivroServicoImpl implements ILivroServico {
 
	@Autowired 
	private LivroRepositorio repositorio;
 
	@Override
	public Livro salvarLivro(Livro livro) {
		return repositorio.save(livro);
	}
 
	@Override
	public Iterable<Livro> buscarTodosLivros() {
		return repositorio.findAll();
	}
 
	@Override
	public Livro buscarLivroPorId(Long id) {
		Optional<Livro> opcional = repositorio.findById(id);
		if (opcional.isPresent()) {
			return opcional.get();
		} else {
			throw new LivroNaoEncontradaExcecao("Livro com id: " + id + " não encontrada.");
		}
	}
 
	@Override
	public void deletarLivroPorId(Long id) {
		repositorio.delete(buscarLivroPorId(id));
	}
 
	@Override
	public void atualizarLivro(Livro invoice) {
		repositorio.save(invoice);
	}
}