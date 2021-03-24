package me.fgalvao77

fun main() {
    val values = intArrayOf(2, 6, 5, 10, 7, 1)
    
    values.forEach {
        println(it)
    }

    println("------------------------------")
    //ordenando o array
    values.sort()
    values.forEach {
        println(it)
    }
}