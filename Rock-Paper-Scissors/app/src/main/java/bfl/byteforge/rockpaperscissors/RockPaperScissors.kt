package bfl.byteforge.rockpaperscissors

fun main(){

    while(true){
        print("Rock, Paper or Scissors? Enter your choice (press 0 to EXIT): ")
        val playerChoice = readln()

        if(playerChoice == "0"){
            break
        }
        else if(playerChoice == "Rock" || playerChoice == "Paper" || playerChoice == "Scissors"){
            val computerChoice = when((1..3).random()){
                1 -> { "Rock" }
                2 -> { "Paper" }
                else -> { "Scissors" }
            }
            val winner = when{
                playerChoice == computerChoice -> "Tie"
                playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
                playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
                playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
                else -> "Computer"
            }

            println(computerChoice)

            if(winner == "Tie"){
                println("The game is s Tie!")
            }else{
                println("$winner Won the Game!")
            }
        }
        else{
            println("Enter Valid Action")
        }
    }
}