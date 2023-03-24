class Loop{
    fun loopControl(stopLimit: Int) :Int {
        var count: Int = 0;
        for(i in 1..10){
            if(i == stopLimit){
                break;
            }
            count++;
            println("Index is :- $i");
        }
        return count;
    }
}

fun main(args: Array<String>){
    println("Total count is :- ${Loop().loopControl(5)}")
}