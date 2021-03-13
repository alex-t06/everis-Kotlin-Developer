fun main() {
    var option: Int

    do {
        println("CALCULADORA" + "\n")
        println(
            "1 - Soma" + "\n" + "2 - Subtracao" + "\n" + "3 - Multiplicacao" + "\n" +
                    "4 - Divisao" + "\n" + "0 - Sair"
        )
        print("\n" + "Escolha a opcao desejada: ")
        option = readLine()!!.toInt()

        when (option) {
            1 -> {
                val numbers = getNumbers()
                val result = sum(numbers.first, numbers.second)
                println("${numbers.first} + ${numbers.second} = $result")
            }
            2 -> {
                val numbers = getNumbers()
                val result = subtraction(numbers.first, numbers.second)
                println("${numbers.first} - ${numbers.second} = $result")
            }
            3 -> {
                val numbers = getNumbers()
                val result = multiplication(numbers.first, numbers.second)
                println("${numbers.first} x ${numbers.second} = $result")
            }
            4 -> {
                val numbers = getNumbers()
                val result = division(numbers.first, numbers.second)
                println("${numbers.first} / ${numbers.second} = $result")
            }
            0 -> option = 0
            else -> {
                println("Opcao Invalida!")
            }
        }
    } while (option != 0)
}

private fun getNumbers(): Pair<Float, Float> {
    print("Digite o primeiro numero: ")
    val number1 = readLine()!!.toFloat()
    print("Digite o segundo numero: ")
    val number2 = readLine()!!.toFloat()

    return Pair(number1, number2)
}

private fun sum(number1: Float, number2: Float) = number1 + number2
private fun subtraction(number1: Float, number2: Float) = number1 - number2
private fun multiplication(number1: Float, number2: Float) = number1 * number2
private fun division(number1: Float, number2: Float) = number1 / number2