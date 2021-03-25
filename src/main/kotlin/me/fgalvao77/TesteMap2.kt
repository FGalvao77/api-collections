package me.fgalvao77

fun main() {
    val nomeCpf = mapOf(
        "Fernando" to "12x.345x.78x-xx",
        "Kátia   " to "14x.25x.36x-xx",
        "Sara    " to "74x.85x.96x-xx",
        "Eloah   " to "78x.45x.12x-xx"
    )

    println("")
    println("----------------------------------------------")
    nomeCpf.forEach { (k, v) -> println("Nome: $k \t| \tCpf: $v\n")}
    println("----------------------------------------------")
}