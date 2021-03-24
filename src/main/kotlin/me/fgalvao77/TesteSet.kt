package me.fgalvao77

fun main() {
    //instanciando três objetos
    val fernando = Funcionario(nome = "Fernando", salario = 2785.0, dataNasc = "x3/xx/19xx", tipoContratacao = "CLT")
    val katia = Funcionario(nome = "Katia ", salario = 3754.0, dataNasc = "x1/xx/19xx", tipoContratacao = "CLT")
    val sara = Funcionario(nome = "Sara", salario = 3289.0, dataNasc = "x5/xx/20xx", tipoContratacao = "PJ")

    //criando dois conjuntos (set)
    val funcionarios1 = setOf(fernando, katia)
    val funcionarios2 = setOf(sara)

    //gerando o relatório total
    //para isso, vamos realizar a união dos conjuntos
    //utlizando a função "union"
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    //realizando a subtração de um funcionário do set
    //a função "sutract" retorna o que tem de comum nos sets
    println("")
    println("---------------------------------------")
    println("Extraindo funcionário não presente em ambos sets")
    val funcionarios3 = setOf(fernando, katia, sara)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }
}