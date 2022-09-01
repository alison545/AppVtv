package com.example.appvtv

fun main(){

    var velocidad:Int =0
    var auto =Auto(velocidad)
    println("Control del Vehiculo tomado")

    println("Velocidad a la que ingresa: ")
    velocidad = readLine()!!.toInt()


    auto.regularVelocidad(velocidad)

}

