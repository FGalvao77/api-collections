package me.fgalvao77

fun main() {
    val salarios = doubleArrayOf(1375.0, 1493.0, 1115.0)

    for (salario in salarios) {
        println(salario)
    }

    println("---------------------")
    //println("Maior salário: ${salarios.max()}") //função já depreciado
    println("Maior salário: ${salarios.maxOrNull()}")
    //println("Menor salário: ${salarios.min()}") //função já depreciado
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")
    println("Soma dos salários: ${salarios.sum()}")

    println("---------------------")
    val salariosMaiorQue1400 = salarios.filter { it > 1400.0 }
    
    salariosMaiorQue1400.forEach { println(it)
    }

    println("---------------------")
    println(salarios.count{ it in 1100.0..1400.0}) //utilizando um range para contar quantos elementos tem definido pela expressão

    println("---------------------")
    println(salarios.find{ it == 1493.0}) //função "find" procura e elemento definido pela expressão

    println("---------------------")
    println(salarios.find {it == 850.0}) //elemento não encontrado - retorna "null"

    println("---------------------")
    println(salarios.any { it == 1000.0}) //função "any", encontre qualquer elemento  onde a expressão seja válida
    println(salarios.any { it == 1375.0})

}