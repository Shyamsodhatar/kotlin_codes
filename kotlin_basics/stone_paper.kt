import kotlin.random.Random
fun main(){
    print("Enter your choice (Rock/Paper/Scissors)")
    print("\n")
//    val userchoice=readln().trim().capitalize()
//    val temp=userchoice.uppercase()
//    print(temp)
    val userchoice=readln().trim().replaceFirstChar { it.uppercase() }
    //computer random
    val opptions=listOf<String>("Rock","Paper","Scissors")
    val computerchoice=opptions.random()
//    print (userchoice)
    print (computerchoice)
    print("\n")

    if (computerchoice == "Paper" && userchoice == "Rock"){
        print ("Computer Wins")
    }
    else if(computerchoice == "Rock" && userchoice == "Paper"){
        print ("You Wins")
    }
    else if(computerchoice == "Scissors" && userchoice == "Paper"){
        print ("Computer Wins")
    }
    else if(computerchoice == "Paper" && userchoice == "Scissors"){
        print ("You Wins")
    }
    else if(computerchoice == "Rock" && userchoice == "Scissors"){
        print ("Computer Wins")
    }
    else if(computerchoice == "Scissors" && userchoice == "Rock"){
        print ("You Wins")
    }
    else if(computerchoice == userchoice){
        print ("Tie")
    }
    else {
        print("Invalid Value")
    }
}