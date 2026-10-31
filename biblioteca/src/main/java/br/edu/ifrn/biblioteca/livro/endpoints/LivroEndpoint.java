package br.edu.ifrn.biblioteca.livro.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;

import br.edu.ifrn.biblioteca.livro.service.LivroServiceInterface;

@Endpoint
public class LivroEndpoint {

    private static final String NAMESPACE_URI =
        "http://biblioteca.ifrn.edu.br";

    private final LivroServiceInterface livroService;

    public LivroEndpoint(LivroServiceInterface livroService) {
        this.livroService = livroService;
    }

}
