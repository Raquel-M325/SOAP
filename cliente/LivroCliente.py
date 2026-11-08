
from zeep import Client

class LivroCliente:

    def __init__(self):
        self.cliente = Client(
            "http://localhost:8080/ws/biblioteca.wsdl"
        )
        self.endpoint = self.cliente.service

    def listarLivros(self):
        return self.endpoint.listarLivros()

    def consultarLivro(self, id):
        return self.endpoint.consultarLivro(id)
