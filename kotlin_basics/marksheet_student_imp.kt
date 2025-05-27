fun main(){

//    val data =10
//    when(data) {
//        5-> println("Data Is Five(5)")
//        10-> println("Data is Ten(10)")
//        else -> println("Data is not found")
//    }

    println("Enter Subject 1 Mark: ")
    var sub_1= readln()!!.trim().toInt()
    println("Enter Subject 2 Mark:")
    var sub_2= readLine()!!.trim().toInt()
    println("Enter Subject 3 Mark")
    var sub_3= readLine()!!.trim().toInt()

    var total=sub_1+sub_2+sub_3
    var average=total/3

    println("Your Average is"+average)

    // Determining Grade fro student
    val grade=
    when{
        average >=90 -> "A+"
        average >=75 -> "A"
        average >=60 -> "B"
        average >=50 ->"C"
        else -> "Fail"
    }
    // Display Marksheet
    println("\n--- Student Performance Report---")
    println("Total Marks $total")
    println("Average Marks : $average")
    println("Grade :$grade")

}