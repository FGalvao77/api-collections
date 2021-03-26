package me.fgalvao77

fun main() {
    //instanciando três objetos
    val fernando = Funcionario("Fernando", 2850.0, "x3/xx/19xx", "CLT")
    val katia = Funcionario("Katia", 3754.0, "x1/xx/19xx", "CLT")
    val sara = Funcionario("Sara", 3289.0,"x5/xx/20xx", "PJ")

    println("----------------------------------------")
    println("----------------- LIST -----------------")
    val funcionarios = mutableListOf(fernando, sara)
    funcionarios.forEach { println(it) }

    println("")
    println("----------------------------------------")
    println("\tAdicionando elemento a lista")
    funcionarios.add(katia)     //função "add" - adiciona elemento
    funcionarios.forEach { println(it) }

    println("")
    println("----------------------------------------")
    println("\tRemovendo elemento da lista")
    funcionarios.remove(fernando)       //função "remove" - remove elemento
    funcionarios.forEach { println(it) }

    println("----------------- SET -----------------")
    val funcionarioSet = mutableSetOf(fernando)
    funcionarioSet.forEach { println(it) }
    println("----------------------------------------")

    println("Adicionando elemento no conjunto")
    funcionarioSet.add(sara)
    funcionarioSet.add(katia)
    funcionarioSet.forEach { println(it) }
    println("----------------------------------------")

    println("Removendo elemento no conjunto")
    funcionarioSet.remove(sara)
    funcionarioSet.forEach { println(it) }
    println("----------------------------------------")

}