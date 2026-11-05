from zeep import Client

class LivroCliente:
    def __init__(self):
        self.cliente = Client("http://localhost:8080/ws/biblioteca.wsdl")

        self.endpoint = cliente.service

    def listarLivro(self):
        return self.endpoint.listarLivro()

    def consultarLivro(self, id):
        return self.endpoint.consultarLivro(id)