// imp wap kotlin program using a do while loop to perform following task
//1. create a list of celcius tempertures atleast 6 different temperatures
// 2. now convert each temperature to fehrenhit using formupla f=celcius*1.8+32
//  3. The loop should run until fehrenhit temperature reach to 212.0
// 4 . print all  the values

fun main(){
    var index = 0
    val c_temp=listOf(2.0,9.8,139.0,66.6,15.5)
    var f_temp:Double

    do{
        // converting c to f
        f_temp=(c_temp[index]*1.8)+32
        println("${c_temp[index]} Converted to Fehrenhit${f_temp}")
        index+=1
    }while(f_temp<212.0)
}

// below this code you have to
// 1. output explanation
//2. explain how the loop is iterating.
// after running this program
// you will see when we are getting  f value
// greater  then 212 your loop will close
// add 3 4 lines