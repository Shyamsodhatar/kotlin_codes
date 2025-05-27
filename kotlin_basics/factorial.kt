fun main(){
//    var number:Int
    println("Enter Any Number:")
    var number= readLine()!!.trim().toInt()

    // checking negative and postive

    if(number<0){
        println("Number is Negative")
    }
    else if(number>0){
        println("Number is Postitve")
        var fact=1
       for ( i in 1.. number){
           fact=fact*i
       }
        println("Factof Given Number is =>"+fact)

    }
    else{
        println("Number is Zero")
    }
}