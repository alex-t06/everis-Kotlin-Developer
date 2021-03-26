package bank.teste

import Banco

fun main(){
    val itau = Banco("Itau", 341)

    println("Nome: " + itau.nome + "\nNumero: " + itau.numero)
}