import kotlin.random.Random
fun main(){
    //Creating Random List

    val random_list= List(10){
        Random.nextInt(1,20)
    }
    println("  List Before Sorting $random_list")

    //sorting list
    val sorted_list=random_list.sortedDescending()
    println("Sorted List:$sorted_list")

}