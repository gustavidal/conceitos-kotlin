package model

class Carro(var modelo: String, var ano: Int) {
//    var modelo: String = ""
//    var ano: Int = 0

    init {
        println("O $modelo é um carro do ano $ano!")
    }
}