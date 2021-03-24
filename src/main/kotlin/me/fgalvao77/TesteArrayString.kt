package me.fgalvao77

fun main() {
    val nomes = Array<String>(size = 4) {" "}
    nomes[0] = "Kátia"
    nomes[1] = "Fernando"
    nomes[2] = "Eloah"
    nomes[3] = "Sara"

    for (nome in nomes) {
        println(nome)
    }

    println("----------------------------")
    nomes.sort()
    nomes.forEach {
        println(it)
    }

    println("---------------------------")
    nomes.sort()
    nomes.forEach { println(it)
    }

    val outrosNomes = arrayOf("Priscila", "Cesar", "Cristina", "Fernanda")
    println("---------------------------")
    outrosNomes.sort()
    outrosNomes.forEach { println(it)}

}