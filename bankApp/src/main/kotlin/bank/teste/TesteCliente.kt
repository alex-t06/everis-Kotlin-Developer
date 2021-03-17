package bank.teste

import Cliente

fun main() {
    val adriana = Cliente(
        "Adriana", "111.111.111-11", ClienteTipo.PF, "123456"
    )

    println(adriana)
    TesteAutenticacao().autentica(adriana)
}