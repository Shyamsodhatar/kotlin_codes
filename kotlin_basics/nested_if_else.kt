// wap in kotlin to nested if else concept using kotlin
// explain nested condition statements

fun main(){
    // nested means having  a sub branch into a main branch
    // it means having an if else inside a main if else branch
    // imp for exa cie 2 puchhasej
    val age=18
    val is_member=true

    if (age>=18){
        if(is_member){
            println("Welcome to the Club:")
        }
        else{
            println("You have to Purchase Membership")
        }

    }
    else{
        println("You must be 18 or older")
    }
}