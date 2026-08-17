/***************************************************
 * Objetivo: Aprender os conceitos básicos de Kotlin
 * Data: 17/08/2026 (segunda-feira)
 * Autor: Gustavo Vidal de Abreu
 **************************************************/

fun main() {
    // 1. Saída de dados
    println("Hello World!")

    // 2. Criação de variáveis
    val pi = 3.14
    var idade = 27
    println(idade)
    idade = 28
    println(idade)

    // 3. Criação de variáveis tipadas
    var idadeTipada: Int = 27
    idadeTipada = 28
    println(idadeTipada)
    var alturaTipada: Double = 1.80
    alturaTipada = 2.0
    println(alturaTipada)

    // 4. Criação de variáveis String
    val texto: String = "Bom dia, pessoal!"
    println(texto)
    println(texto.length)
    println(texto.uppercase())
    println(texto.contains("pessoal"))

    // 5. Criação de variáveis interpoladas
    val nomeInterpolado: String = "vidal"
    val idadeInterpolada = 18
    println("Bom dia $nomeInterpolado! Logo logo você fará ${idadeInterpolada + 1} anos")

    // 6. Criação de variáveis String quebradas
    val textoQuebrado = """
        Texto escrito
        em várias linhas
        para teste
    """
    println(textoQuebrado)
    println(textoQuebrado.trimIndent())

    // 7. Criação de variáveis Char
    val caracter = "$"
    val letra: Char = 'j'
    println(letra)

    // 8. Criação de variáveis Boolean
    val bloqueado: Boolean = false
    println(bloqueado)

    // 9. Criação de variáveis Int
    val idadeInt: Int = 27
    println(idadeInt)

    // 10. Criação de variáveis Long
    val populacaoLong: Long = 7000000000L
    println(populacaoLong)
}
