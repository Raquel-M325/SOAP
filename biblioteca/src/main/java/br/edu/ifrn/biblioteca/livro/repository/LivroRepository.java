package br.edu.ifrn.biblioteca.livro.repository;

import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.List;

@Repository
public class LivroRepository implements LivroRepositoryInterface {


    public LivroRepository() {

    }

    @Override
    public Optional<LivroModel> buscarId(String id) {
        
    }

    @Override 
    public List<LivroModel> listarLivros() {
        
    }

}
