class Function{
    fun recArea(len: Int, width: Int) :Int {
        return len * width
    }

    fun circleArea(radius : Int, circle : Boolean) :Double = if(circle){3.14 * radius * radius} else{-1.0}
}

fun main(args: Array<String>){
    var area :Double = Function().circleArea(10, true)
    print("rectangle area --> $area")
}