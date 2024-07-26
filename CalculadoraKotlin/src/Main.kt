/*
 * Introduccion a Kotlin.
 *
 * Proyecto: Calculadora.
 *
 * Objetivo: Aprender la sintaxis basica de Kotlin, observar algunas mejoras
 *           que introduce con respecto a Java, comprender sus diferencias
 *           y realizar ejercicios practicos.
 *
 *  Nota: La JVM permite la interoperabilidad entre lenguaje Java y lenguaje Kotlin.
 *        Ambos lenguajes son compilados a Bytecode.
 */

private var primervalor = 0.0
private var segundoValor = 0.0
private var resultado = 0.0

fun main() {
    var entradaUsuario = 0

    while (true) {
        println()
        println(":: Calculadora ::")
        println("   1. Sumar")
        println("   2. Restar")
        println("   3. Multiplicar")
        println("   4. Dividir")
        print("Ingresa tu opcion: ")

        try {
            entradaUsuario = readln().toInt()
            tomarDatos()
            println()

            when (entradaUsuario) {
                1 -> sumar()
                2 -> restar()
                3 -> multiplicar()
                4 -> dividir()
                else -> println("¡Opcion no disponible!")
            }
        } catch (e: NumberFormatException) {
            println()
            println("¡Solo puedes elegir entre las opciones disponibles!")
        }
    }
}

private fun tomarDatos() {
    print("Ingresa el primer valor: ")
    primervalor = readln().toDouble()

    print("Ingresa el segundo valor: ")
    segundoValor = readln().toDouble()
}

private fun sumar() {
    resultado = primervalor.plus(segundoValor)
    println("El resultado de la suma es: $resultado")
}

private fun restar() {
    resultado = primervalor.minus(segundoValor)
    println("El resultado de la resta es: $resultado")
}

private fun multiplicar() {
    resultado = primervalor.times(segundoValor)
    println("El resultado de la multiplicacion es: $resultado")
}

private fun dividir() {
    if (segundoValor.toInt() == 0) {
        println("¡No es posible dividir entre 0!")

    } else {
        resultado = primervalor.div(segundoValor)
        println("El resultado de la division es: $resultado")
    }
}