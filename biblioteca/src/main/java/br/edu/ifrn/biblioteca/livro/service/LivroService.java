package br.edu.ifrn.biblioteca.livro.service;

import java.util.List;
import br.edu.ifrn.biblioteca.livro.model.LivroModel;

public class LivroService implements LivroServiceInterface {
    private List<LivroModel> livros;

    public LivroService() {
        this.livros = new ArrayList<>();
    }

    public LivroModel consultarLivro(String id) {
        
    }

    public List<LivroModel> listarLivros() {
        
    }
}
