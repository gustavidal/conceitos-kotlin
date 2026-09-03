import model.Carro
import model.CarroTunado

/*****************************************************
 * Objetivo: Aprender os conceitos de classe no Kotlin
 * Data: 17/08/2026 (segunda-feira)
 * Autor: Gustavo Vidal de Abreu
 ****************************************************/

// 12. CLASSES
fun main() {
    val carro = Carro()
    val carroTunado = CarroTunado()

    carro.modelo = "fusca"
    carro.ano = 1994
    carroTunado.modelo = "silvia"
    carroTunado.ano = 1999
    carroTunado.ranking = 's'

    println(carro.modelo)
    println(carro.ano)
    println(carro.consultarKm())

    carro.acelerar()
    carroTunado.acelerar()
}