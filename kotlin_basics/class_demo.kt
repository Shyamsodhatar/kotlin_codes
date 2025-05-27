// wap in kotlin to understand class and object
// we will add two argument one for student name and one for the rollno
class student(val sname:String,val r_no:Int){
    // adding one function here to print the value
    fun get_data(){
        println("Student Name Is : ${sname}")
        println("Student Roll No:${r_no}")
    }
}
fun main() {
    var s1=student("Shyam",37)
    //using s1 to call student function
    s1.get_data()
    }