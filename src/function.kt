class Function{
    fun recArea(len: Int, width: Int) :Int {
        return len * width
    }
}

fun main(args: Array<String>){
    var area :Int = Function().recArea(10, 20);
    print("rectangle area --> $area")
}