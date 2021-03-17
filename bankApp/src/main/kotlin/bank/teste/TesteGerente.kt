package bank.teste

import Gerente
import bank.teste.TesteAutenticacao as TesteAutenticacao

fun main() {
    val cindy = Gerente("Cindy", "555.666.777-88", 7000.54, "senha123")

    ImprimeRelatorioFuncionario.imprime(cindy)
    TesteAutenticacao().autentica(cindy)
}