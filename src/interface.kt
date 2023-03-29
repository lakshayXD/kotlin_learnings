interface Student{
    val id : Int
    val name : String
    fun id()
    fun name()
}

class HighSchoolStudent(id : Int, name : String) : Student{
    override val id : Int = id
    override val name : String = name

    override fun id(){
        println("Student ID is --> ${this.id}")
    }
    override fun name(){
        println("Student Name is --> ${this.name}")
    }
}

fun main(args : Array<String>){
    var highSchoolStudent : HighSchoolStudent = HighSchoolStudent(1, "Rahul")
    highSchoolStudent.id()
    highSchoolStudent.name()
}