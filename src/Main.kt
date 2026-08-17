/***************************************************
 * Objetivo: Aprender os conceitos básicos de Kotlin
 * Data: 17/08/2026 (segunda-feira)
 * Autor: Gustavo Vidal de Abreu
 **************************************************/

fun main() {
    // 1. SAÍDA DE DADOS
    println("Hello World!")





    // 2. CRIAÇÃO DE VARIÁVEIS
    val pi = 3.14
    var idade = 27
    println(idade)
    idade = 28
    println(idade)

    // 2.1. Criação de variáveis tipadas
    var idadeTipada: Int = 27
    idadeTipada = 28
    println(idadeTipada)
    var alturaTipada: Double = 1.80
    alturaTipada = 2.0
    println(alturaTipada)

    // 2.2. Criação de variáveis String
    val texto: String = "Bom dia, pessoal!"
    println(texto)
    println(texto.length)
    println(texto.uppercase())
    println(texto.contains("pessoal"))

    // 2.3. Criação de variáveis interpoladas
    val nomeInterpolado: String = "vidal"
    val idadeInterpolada = 18
    println("Bom dia $nomeInterpolado! Logo logo você fará ${idadeInterpolada + 1} anos")

    // 2.4. Criação de variáveis String quebradas
    val textoQuebrado = """
        Texto escrito
        em várias linhas
        para teste
    """
    println(textoQuebrado)
    println(textoQuebrado.trimIndent())





    // 3. TIPOS DE DADOS
    // 3.1. Criação de variáveis Char
    val caracter = "$"
    val letra: Char = 'j'
    println(letra)

    // 3.2. Criação de variáveis Boolean
    val bloqueado: Boolean = false
    println(bloqueado)

    // 3.3. Criação de variáveis Int
    val idadeInt: Int = 27
    println(idadeInt)

    // 3.4. Criação de variáveis Long
    val populacaoLong: Long = 7_000_000_000L
    println(populacaoLong)

    // 3.5. Criação de variáveis Float
    val pesoFloat: Float = 55.2350943543983753065875485487638754F
    println(pesoFloat)

    // 3.6. Criação de variáveis Double
    val alturaDouble: Double = 1.802409050724592484589274975267887548
    println(alturaDouble)





    // 4. CONVERSÕES
    val x: Int = 5
    val y: Double = x.toDouble() // obrigatório
    // val z: Double = x // não funciona
    println(x)
    println(y)
}
