import kotlin.random.Random

var rondasGanadasUsuario = 0
var rondasGanadasMaquina = 0

var ataqueMaquina = 0
var ataqueUsuario = 0

var eleccionMaquina = ""
var eleccionUsuario = ""

val LISTA_ATAQUES = listOf("Piedra", "Papel", "Tijeras")

fun main() {
    while (rondasGanadasUsuario < 3 && rondasGanadasMaquina < 3) {
        println()
        println(":: Elige tu ataque ::")

        var numeroAtaque = 1
        for (ataque in LISTA_ATAQUES) {
            println("   $numeroAtaque. $ataque")
            numeroAtaque++
        }

        print("Ingresa tu opcion: ")

        try {
            ataqueUsuario = readln().toInt()
        } catch (e: NumberFormatException) {
            println("¡Recuerda elegir entre las opciones disponibles!")
        }
        ataqueMaquina()
        ejecutarBatalla()
    }
}

fun ataqueMaquina() {
    ataqueMaquina = Random.nextInt(1, 3)
}

fun verAtaques() {
    println("Tu elegiste: $eleccionUsuario")
    println("La maquina eligio: $eleccionMaquina")
    println()
}

fun verificarRondas() {
    if (rondasGanadasUsuario == 3) {
        println("¡EL GANADOR FINAL ES EL USUARIO!")

    } else if (rondasGanadasMaquina == 3) {
        println("¡EL GANADOR FINAL ES LA MAQUINA!")
    }
}

fun ejecutarBatalla() {
    if (ataqueUsuario == ataqueMaquina) {
        println("El usuario y la maquina eligieron lo mismo")
        println()
        println("¡Empate!")
    } else {
        if (ataqueUsuario == 1) {
            eleccionUsuario = "Piedra"

            if (ataqueMaquina == 2) {
                eleccionMaquina = "Papel"
                verAtaques()
                rondasGanadasMaquina++
                println("¡Gana la maquina!")
            } else if (ataqueMaquina == 3) {
                eleccionMaquina = "Tijeras"
                verAtaques()
                rondasGanadasUsuario++
                println("¡Gana el usuario!")
            }
        } else if (ataqueUsuario == 2) {
            eleccionUsuario = "Papel"

            if (ataqueMaquina == 1) {
                eleccionMaquina = "Piedra"
                verAtaques()
                rondasGanadasUsuario++
                println("¡Gana el usuario!")
            } else if ( ataqueMaquina == 3) {
                eleccionMaquina = "Tijeras"
                verAtaques()
                rondasGanadasMaquina++
                println("¡Gana la maquina!")
            }
        } else if (ataqueUsuario == 3) {
            eleccionUsuario = "Tijeras"

            if (ataqueMaquina == 1) {
                eleccionMaquina = "Piedra"
                verAtaques()
                rondasGanadasMaquina++
                println("¡Gana la maquina!")
            } else if (ataqueMaquina == 2) {
                eleccionMaquina = "Papel"
                verAtaques()
                rondasGanadasUsuario++
                println("¡Gana el usuario!")
            }
        }
    }
    verificarRondas()
}