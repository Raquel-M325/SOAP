from dataclasses import dataclass

@dataclass
class LivroModel:
    id: int
    titulo: str
    autor: str
    editora: str
    descricao: str
    genero: str
    idioma: str
    dataPublicacao: str
    quantidadeDisponivel: int
    quantidadePaginas: int