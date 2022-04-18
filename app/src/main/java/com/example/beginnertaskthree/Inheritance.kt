package com.example.beginnertaskthree

class Inheritance {
    val myCar = Truck(2020)
    val dadsCar = Truck(2019)
}

abstract class Car (private var model : Int) {

    abstract val name : String
    abstract val colour : String

    fun carCost() : Int {
        return model * 400
    }

}

class Truck(model : Int) : Car(model) {

    override val name = "GMC"
    override val colour = "Red"
    val capacity = 5
    val speed = 270.0

}