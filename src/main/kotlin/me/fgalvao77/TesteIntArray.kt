package me.fgalvao77

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 5
    values[4] = 2

    println("Primeira iteração")
    for (valor in values) {
        println(valor)
        //println("\n\t $valor")
    }
    println("---------------------")

    println("Segunda iteração")
    values.forEach {
        println(it)
    }
    println("---------------------")

    println("Terceira iteração")
    values.forEach { valor ->
        println(valor)
    }
    println("---------------------")

    println("Quarta iteração")
    for (index in values.indices) {
        println(values[index])
    }
    println("---------------------")

    println("Quinta iteração - ordem crescente")
    values.sort()
    for (valor in values) {
        println(valor)
    }
}