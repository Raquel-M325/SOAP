package br.edu.ifrn.biblioteca.livro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.edu.ifrn.biblioteca.exception.LivroCorrecoes;
import br.edu.ifrn.biblioteca.livro.model.LivroModel;
import br.edu.ifrn.biblioteca.livro.repository.LivroRepositoryInterface;

@Service
public class LivroService implements LivroServiceInterface {

    private final LivroRepositoryInterface repository;

    public LivroService(LivroRepositoryInterface repository) {
        this.repository = repository;
    }

    @Override
    public LivroModel consultarLivro(String id) {

        if (id == null || id.isBlank()) {
            throw new LivroCorrecoes("ID do livro não pode ser nulo ou vazio");
        }

        Optional<LivroModel> resultado = repository.buscarId(id);

        if (resultado.isEmpty()) {
            throw new LivroCorrecoes("Livro não encontrado com o ID: " + id);
        }

        return resultado.get();
    }

    @Override
    public List<LivroModel> listarLivros() {
        return repository.listarLivros();
    }
}
