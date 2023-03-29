fun main(args: Array<String>){
    var car: Car = Car("BMW")
    println(car.name)
}

class Car(var name : String){
    init {
        println("Car name is --> $name")
    }

    constructor(n: String, id: Int) :this(n) {
        println("Car ID is --> $id")
    }
}