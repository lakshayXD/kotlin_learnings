fun main(args: Array<String>){
    Car("BMW")
}

class Car(name : String){
    init {
        println("Car name is --> $name")
    }
}