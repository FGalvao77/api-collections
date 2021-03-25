package me.fgalvao77

fun main() {
    //criando a função "Pair" - chave e valor
    val pair: Pair<String, Double> = Pair("Fernando", 1580.0)
    val map1 = mapOf(pair)

    //imprimindo o "map1"
    map1.forEach { (k, v) -> println("Chave: $k | \tValor: $v") }

    println("--------------------------------------")
    println("")

    //utilizando o recurso "infix"
    val map2 = mapOf(
        "Kátia" to 2385.0,
        "Sara" to 3157.0
    )

    //imprimindo o "map2"
    map2.forEach { (k, v) -> println("Chave: $k \t| \tValor: $v")}
}