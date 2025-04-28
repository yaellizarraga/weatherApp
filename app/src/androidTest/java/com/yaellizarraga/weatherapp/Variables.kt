package com.yaellizarraga.weatherapp

// variables
fun main () {

    getMonthOfTheYear(10)

}

fun numeros() {
    // Int
    val name:String = "Yael Lizarraga"
    val age:Int = 32

    //Long
    val example:Long = 30

    // Float
    val flotante:Float = 10.5F

    //Doubles
    val numerDouble:Double = 10.49489

    //alfa numéricos
    val charEx:Char = '1'

    println("sumar: " + (example + age))

    getMyAge("Yael", 32);
}


fun getMyAge(name:String, age:Int) {
    println("Hola " + name + " tu edad es: " + age);
}

fun getMonthOfTheYear(month: Int) {
    when(month) {
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> {
            println("Junio")
            println("otra linea")
        }
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> println("Noviembre")
        12 -> println("Diciembre")
        else -> {
            println("Mes no existe")
        }
    }
}

fun getSemesterMonth(month: Int) {
    when(month) {
        in 1..6 -> println("Mes del primer semestre")
        in 7..12 -> println("Mes del segundo semestre")
        !in 1..12 -> println("No es un mes valido")
    }
}