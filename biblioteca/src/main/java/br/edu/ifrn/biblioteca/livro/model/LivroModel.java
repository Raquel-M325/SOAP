package br.edu.ifrn.biblioteca.livro.model;
import java.time.LocalDate;

public class LivroModel {
    private String id;
    private String titulo;
    private String autor;
    private LocalDate dataPublicacao; //diz somente data, não horário
    private String descricao;
    private int quantidadePaginas;
    private int quantidadeDisponivel;
    private String genero;
    private String idioma;
    private String editora;

    public LivroModel(String id, String titulo, String autor, LocalDate dataPublicacao, String descricao, int quantidadePaginas, int quantidadeDisponivel, String genero, String idioma, String editora) {
        this.id = id; //não pode enviar id, pois ele é gerado automaticamente pelo banco de dados
        this.titulo = titulo;
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
        this.descricao = descricao;
        this.quantidadePaginas = quantidadePaginas;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.genero = genero;
        this.idioma = idioma;
        this.editora = editora;
    }

    public String getId() {
        return id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEditora() {
        return editora;
    }
}