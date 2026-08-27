/***************************************************
 * Objetivo: Aprender os conceitos básicos de Kotlin
 * Data: 17/08/2026 (segunda-feira)
 * Autor: Gustavo Vidal de Abreu
 **************************************************/

fun main() {
    // 1. SAÍDA DE DADOS
    println("Hello World!")





    // 2. CRIAÇÃO DE VARIÁVEIS
    val pi = 3.14  // o valor não pode ser alterado
    var idade = 27 // o valor pode ser alterado
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





    // 5. OPERADORES
    // 5.1. Operadores Aritméticos
    val a = 10
    val b = 3
    println(a + b) // soma
    println(a - b) // subtração
    println(a * b) // multiplicação
    println(a / b) // divisão
    println(a % b) // resto

    // 5.2. Operadores de Comparação
    println(a == b) // é igual a
    println(a != b) // é diferente de
    println(a > b)  // é maior que
    println(a < b)  // é menor que
    println(a >= b) // é maior ou igual que
    println(a <= b) // é menor ou igual que

    // 5.3. Operadores de Atribuição
    var z = 5
    z += 5 // x = x + 5
    println(z)
    z -= 5 // x = x - 5
    println(z)
    z *= 5 // x = x * 5
    println(z)
    z /= 5 // x = x / 5
    println(z)
    z %= 5 // x = x % 5
    println(z)

    // 5.4. Operadores Lógicos
    val idadeInformada = 20
    val habilitado = true

    println(idadeInformada >= 18 && habilitado)
    println(idadeInformada >= 18 || habilitado)
    println(!habilitado) // false





    // 6. FUNÇÕES
    // 6.0. Funções Básicas
    nomeDaFuncao()

    // 6.1. Funções com Parâmetro
    mandaSalve("João")

    // 6.2. Função com Parâmetro de Valor Padrão
    mandaSalvee("João")
    mandaSalvee()

    // 6.3. Função com 2 Parâmetros
    mensagemParabens(idade = 28, nome = "João")

    // 6.4. Função com Retorno
    val result = soma(10, 3)
    println(result)

    // 6.5 Funções em Seta (lambda)
    val soma: (Int, Int) -> Int = { x, y -> x + y }
    val resultado = soma(10, 3)
    println(resultado)





    // 7. ESTRUTURAS DE DECISÃO
    // 7.1.0 Estrutura if / else if / else padrão
    val nota = 7
    if (nota >= 9) {
        println("Excelente")
    } else if (nota >= 6) {
        println("Bom")
    } else {
        println("Reprovado")
    }

    // 7.1.1 Estrutura if / else como variável
    val idadeDecisao = 20
    val status = if (idadeDecisao >= 18) {
        "Maior de idade"
        "teste"
        println(3)
    } else {
        "Menor de idade"
    }
    println(status)

    // 7.1.2 Estrutura como ternário
    val idadeTernario = 20
    println(if (idadeTernario >= 18) "Maior" else "Menor de idade")



    // 7.2.0 Estrutura when padrão
    val dia = 3
    when (dia) {
        1 -> println("Domingo")
        2 -> println("Segunda")
        3 -> println("Terça")
        else -> println("Dia inválido")
    }

    // 7.2.1 Estrutura when com múltiplos valores
    val notaWhen = 9
    when (notaWhen) {
        9, 10 -> println("Excelente")
        7, 8 -> println("Bom")
        6 -> println("Regular")
        else -> println("Reprovado")
    }

    // 7.2.2 Estrutura when como variável
    val nomeDia = when (dia) {
        1 -> "Domingo"
        2 -> "Segunda"
        3 -> "Terça"
        else -> "Outro dia"
    }

    // 7.2.3 Estrutura when sem argumentos (com condições)
    val notaWhenCondicao = 4
    when {
        notaWhenCondicao >= 9 -> println("Excelente")
        notaWhenCondicao >= 6 -> println("Regular")
        else -> println("Reprovado")
    }

    // 7.2.4 Estrutura when com intervalos
    val idadeWhenIn = 15
    when (idadeWhenIn) {
        in 0 .. 12 -> println("Criança")
        in 13 .. 17 -> println("Adolescente")
        in 18 .. 59 -> println("Adulto")
        else -> println("Idoso")
    }





    // 8. NULL SAFETY
    // Por padrão, nenhuma variável pode ser nula, acontecendo um erro de compilação
    var nomeNulo: String? = "Vidal" // Para permitir a declaração de nulo, é necessário utilizar o "?", chamado Elvis
    nomeNulo = null

    if (nomeNulo != null) {
        println(nomeNulo.length)
    }
    println(nomeNulo?.length)





    // 9. COLLECTIONS
    // 9.1 Array
    var numeros = arrayOf(1, 2, 2)
    println(numeros[0]) // 1
    numeros[1] = 50
    println(numeros[1]) // 50
    // numeros[2] = "Carlos" // não funciona (type mismatch)
    // println(numeros[3])   // não funciona (index out of bounds)

    // 9.2 List
    var frutas = listOf("Banana", "Maçã", "Laranja")
    println(frutas[0])
    // frutas.add("Limão") // não funciona
    // frutas.remove(2)    // não funciona
    println(frutas.size)             // 3
    println(frutas.first())          // "Banana"
    println(frutas.last())           // "Laranja"
    println(frutas.contains("Maçã")) // true

    // 9.3 MutableList
    var carros = mutableListOf("Corsa", "Celta")
    println(carros.size)         // 2
    println(carros.last())       // Celta
    println(carros.add("Fusca"))
    println(carros.last())       // Fusca

    // 9.4 Set
    val cores = setOf("Azul", "Verde", "Azul")
    println(cores)
    // cores.add("Amarelo")  // não funciona
    // cores.remove("Verde") // não funciona

    // 9.5 MutableSet
    val coresMutable = mutableSetOf("Azul", "Verde", "Azul")
    println(coresMutable)
    coresMutable.add("Amarelo")
    coresMutable.add("Azul") // ignorado, pois já existe
    coresMutable.remove("Verde")
    println(coresMutable)

    // 9.6 Map
    val pessoas = mapOf(
        "João" to 25,
        "Maria" to 26
    )
    println(pessoas["João"])  // 25
    println(pessoas["Pedro"]) // null

    // 9.7 MutableMap
    val produtos = mutableMapOf(
        "pc" to "computador",
        "cl" to "celular"
    )
    println(produtos["pc"]) // computador
    produtos["ms"] = "mouse"
    produtos.remove("pc")
    println(produtos) // {cl=celular, ms=mouse}





    // 10. ESTRUTURAS DE REPETIÇÃO
    // 10.0 OPERADORES DE INTERVALO
    1 .. 5         // 1 a 5
    1 until 5      // 1 a 4
    5 downTo 1     // 5 a 1
    1 .. 10 step 2 // 1, 3, 5, 7, 9

    // 10.1 Estrutura while
    var iWhile = 0
    while (iWhile < 10) {
        println(iWhile)
        iWhile++
    }

    // 10.2 Estrutura for
    for (iFor in 1 .. 5) {
        println(iFor)
    }

    // 10.2.1 Misturando for com listOf
    var carrosForListOf = listOf("corsa", "celta", "fusca")
    for (carroForListOf in carrosForListOf) {
        println(carroForListOf)
    }
    for (indice in carrosForListOf.indices) {
        println(indice)
    }
    for ((indice, carro) in carrosForListOf.withIndex()) {
        println("O $carro está na posição $indice")
    }





    // 11. INTERAÇÕES COM COLLECTIONS
    // 11.1 Filter
    val numerosFilter = (1 .. 10).toList()
    val pares = numerosFilter.filter { numero ->
        numero % 2 == 0
    }
    println(pares)

    // 11.2 Map
    val numerosMap = (1 .. 5).toList()
    val dobro = numerosMap.map { numero ->
        numero * 2
    }
    println(dobro)

    // 11.3 Reduce
    val numerosReduce = (1 .. 5).toList()
    val somaReduce = numerosReduce.reduce { acumulador, numero ->
        acumulador + numero
    }
    println(somaReduce)
}





// 6.0. Funções Básicas
fun nomeDaFuncao() {
    println("Função de teste")
}

// 6.1. Funções com Parâmetro
fun mandaSalve(nome: String) {
    println("Salve $nome!")
}

// 6.2. Função com Parâmetro de Valor Padrão
fun mandaSalvee(nome: String = "Caba") {
    println("Salve $nome!")
}

// 6.3. Função com 2 Parâmetros
fun mensagemParabens(nome: String, idade: Int) {
    println("Parabéns $nome, pelos $idade anos de vida!")
}

// 6.4. Função com Retorno
fun soma(a: Int, b: Int): Int { // Se a função tem um retorno, é obrigatório declarar o tipo do retorno
    return a + b
}

