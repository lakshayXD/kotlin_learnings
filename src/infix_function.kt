fun main(args: Array<String>){
    var num1 : Int = 2
    var num2 : Int = 20
    var res : Int = num1 greaterThan num2
    println("Greater number --> $res")
}

    infix fun Int.greaterThan(other: Int) :Int {
        if(this > other){
             return this
        } else {
             return other
        }
    }

