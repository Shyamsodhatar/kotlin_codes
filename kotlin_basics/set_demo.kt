fun main(){
    //wap in kotlin to understand sets
    // 2 types of set 1 mutable immutable set 2

    //mutable set
//    var/val name= mutableSetOf<String>() syntax

    var names= mutableSetOf<String>("Shyam","Bhavya","Bhumit","Aryan","Rutul")
    println(names)

    // immutable set
    var numbers= setOf(10,20)
    println(numbers)

    //function of sets
    println("First element is "+numbers.first())
    println("Last Value is "+numbers.last())
    println("Sum of set is :"+numbers.sum())
}