fun main(args : Array<String>){
  var str : String = ""
  var str1 : String  = "Hello "
  var str2 : String = "World"
    println("string is --> ${str.concat(str1, str2)}")
}

fun String.concat(s1 : String, s2 : String) :String {
    return this + s1 + s2
}

