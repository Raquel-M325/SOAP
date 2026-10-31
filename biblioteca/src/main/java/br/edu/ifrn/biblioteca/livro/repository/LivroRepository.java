
package br.edu.ifrn.biblioteca.livro.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import br.edu.ifrn.biblioteca.livro.model.LivroModel;

@Repository
public class LivroRepository implements LivroRepositoryInterface {

    private List<LivroModel> livros;

    public LivroRepository() {
        this.livros = new ArrayList<>();
        carregarLivros();
    }

    private void carregarLivros() {

        this.livros.add(new LivroModel(
            "L01",
            "Anne com E",
            "Lucy Maud Montgomery",
            LocalDate.of(2023, 1, 1),
            "Anne é uma jovem órfã que enfrenta desafios, faz amizades e busca seu lugar no mundo.",
            400,
            10,
            "Romance",
            "Português",
            "Companhia das Letrinhas"
        ));

        this.livros.add(new LivroModel(
            "L02",
            "Clean Code",
            "Robert C. Martin",
            LocalDate.of(2008, 8, 1),
            "Livro sobre boas práticas de programação e desenvolvimento de código limpo.",
            464,
            5,
            "Tecnologia",
            "Inglês",
            "Prentice Hall"
        ));

        this.livros.add(new LivroModel(
            "L03",
            "O Pequeno Príncipe",
            "Antoine de Saint-Exupéry",
            LocalDate.of(1943, 4, 6),
            "Uma narrativa sobre amizade, amor e as relações humanas.",
            96,
            8,
            "Literatura",
            "Português",
            "Editora fictícia"
        ));
    }

    @Override
    public Optional<LivroModel> buscarId(String id) {

        if (id == null) {
            return Optional.empty();
        }

        for (LivroModel livro : this.livros) {
            if (id.equals(livro.getId())) {
                return Optional.of(livro);
            }
        }

        return Optional.empty();
    }

    @Override
    public List<LivroModel> listarLivros() {
        return new ArrayList<>(this.livros);
    }
}
