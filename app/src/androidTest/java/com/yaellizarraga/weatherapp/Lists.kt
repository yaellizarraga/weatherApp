package com.yaellizarraga.weatherapp

fun main() {
    val weekDays:MutableList<String> = mutableListOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado", "Domingo")
    println(weekDays.size)
    println(weekDays.toString())

    // Filtrado
    val filtrado = weekDays.filter { it.contains("M") }
    println(filtrado)

    // Añadiento valores a listas
    weekDays.add("TEST");

    //Iterar lista
    if (weekDays.isNotEmpty()) {
        weekDays.forEach {
                weekDay -> println(weekDay)
        }
    }
}