package br.edu.ifrn.biblioteca.livro.repository;

import java.util.List;
import java.util.Optional;
import br.edu.ifrn.biblioteca.livro.model.LivroModel;


public interface LivroRepositoryInterface {

    Optional<LivroModel> buscarId(String id);

    List<LivroModel> listarLivros();
}