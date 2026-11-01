#ifndef LIVROCLIENT_HPP
#define LIVROCLIENT_HPP

#include <string>
#include <vector>

#include "models/Livro.hpp"

class LivroClient {

    private:
        std::string url;

        std::string enviarRequisicao(const std::string& mensagem);

    public:
        LivroClient();

        LivroModel consultarLivro(const std::string& id);

        std::vector<LivroModel> listarLivros();

};

#endif