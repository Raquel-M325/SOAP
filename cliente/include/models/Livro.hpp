#ifndef LIVROMODEL_HPP
#define LIVROMODEL_HPP

#include <string>

struct LivroModel {
    std::string id;
    std::string titulo;
    std::string autor;
    std::string editora;
    std::string descricao;
    std::string genero;
    std::string idioma;
    std::string dataPublicacao;
    int quantidadeDisponivel, quantidadePaginas;
};