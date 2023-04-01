package br.com.example.exemplo_spring.excecao;

public class LivroNaoEncontradaExcecao extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public LivroNaoEncontradaExcecao() {
		super();
	}

	public LivroNaoEncontradaExcecao(String mensagemPersonalizada) {
		super(mensagemPersonalizada);
	}
}