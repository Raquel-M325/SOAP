package br.edu.ifrn.biblioteca.livro.service;

import java.util.List;
import br.edu.ifrn.biblioteca.livro.model.LivroModel;

public interface LivroServiceInterface {
    LivroModel consultarLivro(String id);
    List<LivroModel> listarLivros(); 
}
