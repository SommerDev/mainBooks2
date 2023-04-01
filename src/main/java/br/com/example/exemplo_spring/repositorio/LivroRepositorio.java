package br.com.example.exemplo_spring.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import br.com.example.exemplo_spring.modelo.Livro;
import br.com.example.exemplo_spring.repositorio.*;

public interface LivroRepositorio extends CrudRepository<Livro, Long> {

}