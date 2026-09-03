import model.Carro

/*****************************************************
 * Objetivo: Aprender os conceitos de classe no Kotlin
 * Data: 17/08/2026 (segunda-feira)
 * Autor: Gustavo Vidal de Abreu
 ****************************************************/

// 12. CLASSES
fun main() {
    val carro = Carro("fusca", 1994)

//    carro.modelo = "fusca"
//    carro.ano = 1994

    println(carro)
    println(carro.modelo)
    println(carro.ano)
}