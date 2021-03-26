package me.fgalvao77

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal(),
    )

    println("")
    println("------------------------------")
    println("\tTotal de salários: ${salarios.soma()}")

    println("------------------------------")
    println("\tMédia salarial: ${salarios.media()}")
    println("------------------------------")
}