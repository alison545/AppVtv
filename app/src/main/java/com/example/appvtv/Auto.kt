package com.example.appvtv

class Auto {

    var marca: String=""
    var patente: String=""
    var velocidad: Int=0
    var anio:Int=0
    var encendido:Boolean=false
    var frenar:Boolean=false
    var acelerar:Boolean=false

    constructor(velocidad: Int){
        this.velocidad=velocidad

    }

    fun encender(){
        this.encendido=true
        println("El auto esta encendido")
    }

    fun descenderDelVehiculo(){

    }

    fun bajarVelocidad(velocidad: Int){

        //while (this.velocidad)

    }

    fun regularVelocidad(velocidad: Int){

        this.velocidad=velocidad
        while (this.velocidad>20) {
            this.velocidad--
            println(this.velocidad)
        }

        while (this.velocidad<20) {
            this.velocidad++
            println(this.velocidad)
        }
        if(this.velocidad==20) {
            println("Velocidad correcta")
        }

    }

    fun acelerar(){


    }

}