class Loop{
    fun loopControl(stopLimit: Int) :Int {
        var count: Int = 0
        for(i in 1..10){
            if(i == stopLimit){
                break
            }
            count++
            println("Index is :- $i")
        }
        return count
    }

    fun loopTagControl(stopLimit: Int) :Int {
        var count: Int = 0
        topLoop@ for(i in 1..10){
            for(j in 1..10){
                count++
                println("top loop index: $i")
                println("inner loop index: $j")
                if(i == stopLimit){
                    topLoop@ break
                }
            }
        }
        return count
    }
}

fun main(args: Array<String>){
    println("Total count is :- ${Loop().loopTagControl(5)}")
}