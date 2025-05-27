    import kotlin.random.Random
    fun main(){
        var player1points = 0
        var player2points = 0

        var outcomes= listOf<Int>(1,2,3,4,5,6)

        var dice1value=0
        var dice2value=0

        var maxchace=3

        println("Welcome to the dice game")
        println("Every player will get 3 chance to roll the dice")

        for(i in 1 ..maxchace){
            println ("Player1 roll")
            println ("Press any key to roll your dice")
            println("....")
//        readln()

            dice1value = Random.nextInt(1,7)
            player1points+=dice1value

            println ("Player2 roll")
            println ("Press any key to roll your dice")
            println("....")
//        readln()
            dice2value = Random.nextInt(1,7)
            player2points+=dice2value
            println(dice1value)
            println(dice2value)
            println(player1points)
            println(player2points)




        }
        if(player1points==player2points){
            println("Tie")
        }
        if(player1points>player2points){
            println("Player 1 Wins")
        }
        else{
            println("Player 2 Wins")
        }

        println(player1points)
    }