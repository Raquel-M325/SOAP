package br.edu.ifrn.biblioteca.livro.repository;

import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.List;
import br.edu.ifrn.biblioteca.livro.model.LivroModel;

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
