package br.edu.ifrn.biblioteca.livro.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import br.edu.ifrn.biblioteca.livro.service.LivroServiceInterface;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.util.List;
import br.edu.ifrn.biblioteca.livro.model.LivroModel;

@Endpoint
public class LivroEndpoint {

    private static final String NAMESPACE_URI =
        "http://biblioteca.ifrn.edu.br";

    private final LivroServiceInterface livroService;

    public LivroEndpoint(LivroServiceInterface livroService) {
        this.livroService = livroService;
    }

    @PayloadRoot(
        namespace = NAMESPACE_URI,
        localPart = "consultarLivroRequest"
    )

    @ResponsePayload
    public Element consultarLivro(@RequestPayload Element request) throws ParserConfigurationException {
        if (request == null) {
            throw new IllegalArgumentException("Request não pode ser nulo");
        }

        NodeList elementosId = request.getElementsByTagNameNS(NAMESPACE_URI,"id");

        Node noId= elementosId.item(0);


        if (noId == null) {
            throw new IllegalArgumentException("Elemento 'id' não encontrado no request");
        }
        
        String id = noId.getTextContent().trim();
        
        if (id.isEmpty()) {
            throw new IllegalArgumentException("Elemento 'id' não encontrado no request");
        }
        
        LivroModel livro = livroService.consultarLivro(id);
        
        Document documento = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        
        Element resposta = documento.createElementNS(NAMESPACE_URI, "consultarLivroResponse");        
        documento.appendChild(resposta);

        Element elementoLivro = documento.createElementNS(NAMESPACE_URI, "livro");
        resposta.appendChild(elementoLivro);

        
        Element elementoId = documento.createElementNS(NAMESPACE_URI, "id");
        Element elementoTitulo = documento.createElementNS(NAMESPACE_URI, "titulo");
        Element elementoAutor = documento.createElementNS(NAMESPACE_URI, "autor");
        Element elementoDataPublicacao = documento.createElementNS(NAMESPACE_URI, "dataPublicacao");
        Element elementoDescricao = documento.createElementNS(NAMESPACE_URI, "descricao");
        Element elementoQuantidadePaginas = documento.createElementNS(NAMESPACE_URI, "quantidadePaginas");
        Element elementoQuantidadeDisponivel = documento.createElementNS(NAMESPACE_URI, "quantidadeDisponivel");
        Element elementoGenero = documento.createElementNS(NAMESPACE_URI, "genero");
        Element elementoIdioma = documento.createElementNS(NAMESPACE_URI, "idioma");
        Element elementoEditora = documento.createElementNS(NAMESPACE_URI, "editora");

        elementoId.setTextContent(livro.getId());
        elementoTitulo.setTextContent(livro.getTitulo());
        elementoAutor.setTextContent(livro.getAutor());
        elementoDataPublicacao.setTextContent(livro.getDataPublicacao().toString());
        elementoDescricao.setTextContent(livro.getDescricao());
        elementoQuantidadePaginas.setTextContent(String.valueOf(livro.getQuantidadePaginas()));
        elementoQuantidadeDisponivel.setTextContent(String.valueOf(livro.getQuantidadeDisponivel()));
        elementoGenero.setTextContent(livro.getGenero());
        elementoIdioma.setTextContent(livro.getIdioma());
        elementoEditora.setTextContent(livro.getEditora());


        elementoLivro.appendChild(elementoId);
        elementoLivro.appendChild(elementoTitulo);
        elementoLivro.appendChild(elementoAutor);
        elementoLivro.appendChild(elementoDataPublicacao);
        elementoLivro.appendChild(elementoDescricao);
        elementoLivro.appendChild(elementoQuantidadePaginas);
        elementoLivro.appendChild(elementoQuantidadeDisponivel);
        elementoLivro.appendChild(elementoGenero);
        elementoLivro.appendChild(elementoIdioma);
        elementoLivro.appendChild(elementoEditora);
        
        return resposta;
    }

    @PayloadRoot(
        namespace = NAMESPACE_URI,
        localPart = "listarLivrosRequest"
    )

    @ResponsePayload
    public Element listarLivros(@RequestPayload Element request) throws ParserConfigurationException {
        if (request == null) {
            throw new IllegalArgumentException("Request não pode ser nulo");
        }

        List<LivroModel> livros = livroService.listarLivros();

        Document documento = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        
        Element resposta = documento.createElementNS(NAMESPACE_URI, "listarLivrosResponse");
        documento.appendChild(resposta);

        for (LivroModel livro : livros){
            
            Element elementoLivro = documento.createElementNS(NAMESPACE_URI, "livro");
            resposta.appendChild(elementoLivro);

            Element elementoId = documento.createElementNS(NAMESPACE_URI, "id");
            Element elementoTitulo = documento.createElementNS(NAMESPACE_URI, "titulo");
            Element elementoAutor = documento.createElementNS(NAMESPACE_URI, "autor");
            Element elementoDataPublicacao = documento.createElementNS(NAMESPACE_URI, "dataPublicacao");
            Element elementoDescricao = documento.createElementNS(NAMESPACE_URI, "descricao");
            Element elementoQuantidadePaginas = documento.createElementNS(NAMESPACE_URI, "quantidadePaginas");
            Element elementoQuantidadeDisponivel = documento.createElementNS(NAMESPACE_URI, "quantidadeDisponivel");
            Element elementoGenero = documento.createElementNS(NAMESPACE_URI, "genero");
            Element elementoIdioma = documento.createElementNS(NAMESPACE_URI, "idioma");
            Element elementoEditora = documento.createElementNS(NAMESPACE_URI, "editora");

            elementoId.setTextContent(livro.getId());
            elementoTitulo.setTextContent(livro.getTitulo());
            elementoAutor.setTextContent(livro.getAutor());
            elementoDataPublicacao.setTextContent(livro.getDataPublicacao().toString());
            elementoDescricao.setTextContent(livro.getDescricao());
            elementoQuantidadePaginas.setTextContent(String.valueOf(livro.getQuantidadePaginas()));
            elementoQuantidadeDisponivel.setTextContent(String.valueOf(livro.getQuantidadeDisponivel()));
            elementoGenero.setTextContent(livro.getGenero());
            elementoIdioma.setTextContent(livro.getIdioma());
            elementoEditora.setTextContent(livro.getEditora());

            elementoLivro.appendChild(elementoId);
            elementoLivro.appendChild(elementoTitulo);
            elementoLivro.appendChild(elementoAutor);  
            elementoLivro.appendChild(elementoDataPublicacao);
            elementoLivro.appendChild(elementoDescricao);
            elementoLivro.appendChild(elementoQuantidadePaginas);
            elementoLivro.appendChild(elementoQuantidadeDisponivel);
            elementoLivro.appendChild(elementoGenero);
            elementoLivro.appendChild(elementoIdioma);
            elementoLivro.appendChild(elementoEditora);
        }

        return resposta;
    }

}