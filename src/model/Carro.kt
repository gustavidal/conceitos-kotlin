package model

open class Carro(
//    var modelo: String, var ano: Int, var portas: Int = 4
) {
    var modelo: String = ""
        get() {
            return field.uppercase()
        }

    var ano: Int = 0
        set(value) {
            field = if (value > 0) value else 0
        }

    open fun acelerar() {
        println("vrum-vrum")
    }

    private var kilometragem: Double = 0.0

    fun rodar(km: Double) {
        kilometragem += km
    }

    fun consultarKm(): Double {
        return kilometragem
    }
//    init {
//        println("O $modelo é um carro de $ano com $portas portas.")
//    }
}