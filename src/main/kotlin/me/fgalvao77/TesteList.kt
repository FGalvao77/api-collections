package me.fgalvao77

fun main() {
    //instanciando três objetos
    val fernando = Funcionario(nome = "Fernando", salario = 2785.0, dataNasc = "x3/xx/19xx", tipoContratacao = "CLT")
    val katia = Funcionario(nome = "Katia ", salario = 3754.0, dataNasc = "x1/xx/19xx", tipoContratacao = "CLT")
    val sara = Funcionario(nome = "Sara", salario = 3289.0, dataNasc = "x5/xx/20xx", tipoContratacao = "PJ")

    val funcionarios = listOf(fernando, katia, sara)

    funcionarios.forEach {println(it)} //imprimindo os objetos através da iteração "it" - função lambda

    println("") //procurando um funcionário especifíco e imprimindo suas informações
    println("INFOS DO FUNCIONÁRIO:")
    println(funcionarios.find { it.nome == "Sara"})

    println("")
    println("--------------------") //ordenando a lista
    println("Ordenação por salários:")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("")
    println("--------------------") //agrupando por tipo de contratação
    println("Tipo de contratação:")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }
}

//criando um "data class" para "Funcionario"
data class Funcionario(
    val nome: String,
    val salario: Double,
    val dataNasc: String,
    val tipoContratacao: String
    ) {

    override fun toString(): String = //realizando interpolação
        """
            ---------------------
            Nome   : $nome
            Salario: $salario
            Data de nascimento: $dataNasc
            ---------------------
        """.trimIndent()
}
