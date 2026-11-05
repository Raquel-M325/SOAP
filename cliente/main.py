from LivroCliente import LivroCliente

class main:

    @staticmethod
    def menu():
        cliente = LivroCliente()

        while True:
            print("\n=== BIBLIOTECA SOAP ===")
            print("1 - Listar livros")
            print("2 - Consultar livro")
            print("0 - Sair")

            opcao = input("Escolha uma opção: ")

            if opcao == "1":
                livros = cliente.listarLivros()

                for livro in livros:
                    print(livro)

            elif opcao == "2":
                id = input("Digite o ID do livro: ")

                livro = cliente.consultarLivro(id)

                print(livro)

            elif opcao == "0":
                print("Encerrando...")
                break

            else:
                print("Opção inválida!")


if __name__ == "__main__":
    main.menu()