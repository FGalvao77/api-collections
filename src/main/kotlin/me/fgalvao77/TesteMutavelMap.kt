package me.fgalvao77

fun main() {
    //instanciando três objetos
    val fernando = Funcionario("Fernando", 2850.0, "x3/xx/19xx", "CLT")
    val katia = Funcionario("Katia", 3754.0, "x1/xx/19xx", "CLT")
    val sara = Funcionario("Sara", 3289.0,"x5/xx/20xx", "PJ")

    val repositorio = Repositorio<Funcionario>()

    //chamando os objetos
    repositorio.create(fernando.nome, fernando)
    repositorio.create(katia.nome, katia)
    repositorio.create(sara.nome, sara)

    println(repositorio.findById(fernando.nome))
    println(repositorio.findById(sara.nome))
    println(repositorio.findById(katia.nome))

}