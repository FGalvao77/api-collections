package me.fgalvao77

//criando um "data class" para "Funcionario"
data class Funcionario(
    val nome: String,
    val salario: Double,
    val dataNasc: String,
    val tipoContratacao: String
) {

    override fun toString(): String = //realizando interpolação
        """
            ----------------------------------------
            Nome              : $nome
            Salario           : $salario
            Data de nascimento: $dataNasc
            ----------------------------------------
        """.trimIndent()
}