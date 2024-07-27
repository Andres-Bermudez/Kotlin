var valorAConvertir = 0f
var monedaUsuario = 0
var convertirA = 0
var valorConvertido = 0.0f

val LISTA_MONEDAS = listOf("Pesos Colombianos", "Dolares EE.UU", "Libras Esterlinas")

// Precios a fecha 25 de Julio de 2024
const val PRECIO_DOLAR = 4031.50f // Pesos Colombianos
const val PRECIO_LIBRA_ESTERLINA = 1.29f // Dolares

fun main() {
    menuBienvenida()
}

private fun menuBienvenida() {
    var contador = 1

    while (true) {
        try {
            println()
            println(":: Conversor de monedas ::")
            print("Ingresa el valor a convertir: ")
            valorAConvertir = readln().toFloat()

            println()
            println("Tu moneda es: ")

            for (moneda in LISTA_MONEDAS) {
                println("$contador. $moneda")
                contador += 1
            }

            print("Ingresa tu opcion: ")
            monedaUsuario = readln().toInt()

            when {
                monedaUsuario < 0 || monedaUsuario > 3 -> {
                    println("¡Opcion no disponible!")
                }
            }

        } catch (e: NumberFormatException) {
            println("¡Ingresaste valores invalidos, recuerda utilizar solo valores numericos!")
        }
        contador = 1
        ejecutarConversion()
    }
}

fun ejecutarConversion() {
    when (monedaUsuario) {
        1 -> convertirPesosColombianos()
        2 -> convertirDolares()
        3 -> convertirLibrasEsterlinas()
        else -> println("¡Opcion no disponible!")
    }
}

fun convertirPesosColombianos() {
    var contador = 1

    println()
    println("Convertir a:")

    for (moneda in LISTA_MONEDAS) {
        if (moneda == "Pesos Colombianos") {
            // Instruccion vacia para que ignore la moneda elegida y no se muestre en la lista.
        } else {
            println("$contador. $moneda")
            contador++
        }
    }
    print("Ingresa tu opcion: ")

    convertirA = readln().toInt()

    when (convertirA) {
        1 -> {
            valorConvertido = valorAConvertir.div(PRECIO_DOLAR)
            println("$$valorAConvertir peso(s) Colombianos es igual a: $$valorConvertido Dolar(es)")
        }
        2 -> {
            valorConvertido = valorAConvertir.div(PRECIO_DOLAR.times(PRECIO_LIBRA_ESTERLINA))
            println("$$valorAConvertir peso(s) Colombianos es igual a: $$valorConvertido Libra(s) Esterlina(s)")
        }
    }
}

fun convertirDolares() {
    var contador = 1

    println()
    println("Convertir a:")

    for (moneda in LISTA_MONEDAS) {
        if (moneda == "Dolares EE.UU") {
            // Instruccion vacia para que ignore la moneda elegida y no se muestre en la lista.
        } else {
            println("$contador. $moneda")
            contador++
        }
    }
    print("Ingresa tu opcion: ")

    convertirA = readln().toInt()

    when (convertirA) {
        1 -> {
            valorConvertido = valorAConvertir.times(PRECIO_DOLAR)
            println("$$valorAConvertir Dolar(es) es igual a: $$valorConvertido Peso(s) Colombiano(s)")
        }
        2 -> {
            valorConvertido = valorAConvertir.div(PRECIO_LIBRA_ESTERLINA)
            println("$$valorAConvertir Dolar(es) es igual a: $$valorConvertido Libra(s) Esterlina(s)")
        }
    }
}

fun convertirLibrasEsterlinas() {
    var contador = 1

    println()
    println("Convertir a:")

    for (moneda in LISTA_MONEDAS) {
        if (moneda == "Libras Esterlinas") {
            // Instruccion vacia para que ignore la moneda elegida y no se muestre en la lista.
        } else {
            println("$contador. $moneda")
            contador++
        }
    }
    print("Ingresa tu opcion: ")

    convertirA = readln().toInt()

    when (convertirA) {
        1 -> {
            valorConvertido = valorAConvertir.times(PRECIO_DOLAR.times(PRECIO_LIBRA_ESTERLINA))
            println("$$valorAConvertir Libra(s) Esterlina(s) es igual a: $$valorConvertido Peso(s) Colombiano(s)")
        }
        2 -> {
            valorConvertido = valorAConvertir.times(PRECIO_LIBRA_ESTERLINA)
            println("$$valorAConvertir Libra(s) Esterlina(s) es igual a: $$valorConvertido Dolar(es)")
        }
    }
}



