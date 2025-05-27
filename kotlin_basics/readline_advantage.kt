// describe method available in kotlin for reading user input from the
// console
// highlight readline use advantage, drawback.
// please provide code example to read different type of input
// using method
fun main(){
    // User input for string datatype
//    val name:String
    println("Enter Your Name:")
    val name:String= readLine().toString()
    // user input for int datatype
    val num:Int
    println("Enter Any Number")
    num = readln()!!.trim().toInt()
    // add some explanation
}

// Advantages of readline
/*
1. simplicity :ideal for read a string data without any additional setup
2. User friendly : easy for any user to create readline
3.readability: code is easy to understand

Disadvantages of readline
1. limited to string: Readline  is only limited to strings for other
  data type we have to change the format of readline

2. software limit: readline is only works for android stdio , kotlin compiler
 etc .. it will not work in VS Code,Subline etc..
*/
