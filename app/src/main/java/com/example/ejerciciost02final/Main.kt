package com.example.ejerciciost02final

fun main() {
    val alumno = Alumno("Juan", "Pérez", 17)

    println(alumno.nombreCompleto)
    println(alumno.mayorEdad)

    alumno.edad = 19

    println(alumno.mayorEdad)
}

class Alumno(
    val nombre: String,
    val apellido: String,
    var edad: Int
) {
    val mayorEdad: Boolean
        get() = edad >= 18

    val nombreCompleto: String
        get() = "$nombre $apellido"
}

/*
fun ejercicio1() {
    println("Hola, soy Alejandro Palazón Sánchez y este es mi primer programa en Kotlin")
}

fun ejercicio2() {
    println("Ejercicio 2: Alejandro Palazón Sánchez")
    print("Introduce el primer número: ")
    val num1 = readln().toInt()
    print("Introduce el segundo número: ")
    val num2 = readln().toInt()

    val suma = num1 + num2
    val resta = num1 - num2
    val multiplicacion = num1 * num2

    println("Suma: $suma")
    println("Resta: $resta")
    println("Multiplicación: $multiplicacion")
}

fun ejercicio4() {
    println("Ejercicio 4: Alejandro Palazón Sánchez")
    print("Introduzca un número mayor de 1: ")
    val num = readln().toIntOrNull()
    if (num == null || num <= 1) {
        println("Error: Debe introducir un número entero mayor que 1.")
    } else {
        println("Múltiplos de 3")
        for (i in 1..num) {
            if (i % 3 == 0) {
                println(i)
            }
        }
    }
}

fun ejercicio5() {
    println("Ejercicio 5: Alejandro Palazón Sánchez")
    for (i in 1..5) {
        println("Introduzca el sueldo del trabajador $i")
        val sueldo = readln().toIntOrNull()
        when {
            sueldo == null || sueldo <= 0 -> println("Error: Debe introducir un entero positivo.")
            sueldo > 5000 -> println("sueldo alto")
            sueldo > 2000 -> println("sueldo medio")
            else -> println("sueldo bajo")
        }
    }
}

fun esPar(numero: Int): Boolean = numero % 2 == 0

fun ejercicio6() {
    println("Ejercicio 6: Alejandro Palazón Sánchez")
    println("¿Es 4 par? ${esPar(4)}")
    println("¿Es 7 par? ${esPar(7)}")
}

fun cuadradoCalculadora(numero: Int): Int = numero * numero

fun productoCalculadora(n1: Int, n2: Int): Int = n1 * n2

fun ejercicio7() {
    println("Ejercicio 7: Alejandro Palazón Sánchez")
    print("Introduce el primer número: ")
    val num1 = readln().toIntOrNull()
    print("Introduce el segundo número: ")
    val num2 = readln().toIntOrNull()

    if (num1 == null || num2 == null) {
        println("Error: Introduce números enteros válidos.")
    } else {
        println("Cuadrado del primero: ${cuadradoCalculadora(num1)}")
        println("Cuadrado del segundo: ${cuadradoCalculadora(num2)}")
        println("Producto de ambos: ${productoCalculadora(num1, num2)}")
    }
}

fun mediaDeTres(v1: Int, v2: Int = 1, v3: Int = 1): Int = (v1 + v2 + v3) / 3

fun palabraMasLarga(w1: String, w2: String): String = if (w1.length > w2.length) w1 else w2

fun ejercicio8() {
    println("Ejercicio 8: Alejandro Palazón Sánchez")
    println("Media enviando solo v1 y v3: ${mediaDeTres(v1 = 9, v3 = 3)}")
    println("Palabra más larga: ${palabraMasLarga("Kotlin", "Java")}")
}

fun cuadrado(num: Int): Int = num * num

fun concatenar(p1: String, p2: String): String = p1 + p2

fun juego(opcion: String): String = when (opcion.lowercase()) {
    "papel" -> "piedra"
    "tijera" -> "papel"
    "piedra" -> "tijera"
    else -> "empate"
}

fun ejercicio9() {
    println("Ejercicio 9: Alejandro Palazón Sánchez")
    println("Cuadrado de 5: ${cuadrado(5)}")
    println("Concatenación: ${concatenar("Hola ", "Mundo")}")
    println("Gana a 'papel': ${juego("papel")}")
}

fun ejercicio11(n: Int, m: Int) {
    val milista = mutableListOf<Int>()
    println("Vas a introducir $n numeros")
    for (i in 1..n) {
        print("Introduce tu $i numero: ")
        val numero = readln().toIntOrNull() ?: 0
        milista.add(numero)
    }

    println("Esta es la lista actual $milista")
    val miNuevaLista = milista.filter { it < m }
    println("Esta es la lista actualizada $miNuevaLista")
}

fun ejercicio12(palabras: List<String>): String? {
    val palabra = palabras.find { it.startsWith("Al") }
    println(palabra)
    return palabra
}
*/