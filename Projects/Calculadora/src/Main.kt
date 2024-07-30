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

val sumar = {a : Double, b : Double -> a + b}
val restar = {a : Double, b : Double -> a - b}
val multiplicar = {a : Double, b : Double -> a * b}
val dividir = {a : Double, b : Double -> a / b}

fun main() {
    var entradaUsuario = 0

    while (true) {
        println()
        println(":: Calculadora ::")
        println("   1. Sumar")
        println("   2. Restar")
        println("   3. Multiplicar")
        println("   4. Dividir")
        println("   0. Salir")
        print("Ingresa tu opcion: ")

        try {
            entradaUsuario = readln().toInt()

            if (entradaUsuario == 0) {
                System.exit(0)
            }

            print("Ingresa el primer valor: ")
            primervalor = readln().toDouble()

            print("Ingresa el segundo valor: ")
            segundoValor = readln().toDouble()

            println()

            when (entradaUsuario) {
                1 -> println("El resultado de la suma es: ${sumar(primervalor, segundoValor)}")
                2 -> println("El resultado de la resta es: ${restar(primervalor, segundoValor)}")
                3 -> println("El resultado de la multiplicacion es: ${multiplicar(primervalor, segundoValor)}")
                4 -> if (segundoValor.toInt() == 0) {
                    println("Imposible dividir entre 0")
                } else {
                    println("El resultado de la division es: ${dividir(primervalor, segundoValor)}")
                }
                else -> println("¡Opcion no disponible!")
            }
        } catch (e: NumberFormatException) {
            println()
            println("¡Solo puedes elegir entre las opciones disponibles!")
        }
    }
}