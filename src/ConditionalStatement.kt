fun main(args: Array<String>) {
    val age = 23
    if(age<18){
        println("You are not qualified to vote")
    }else{
        println("You are legible to vote")
    }

    val number = 4
    if (number==1){
        println("Oops you lost the game")
    }else if(number==4){
        print("Oops you are almost there")
    }else if(number==3){
        println("Congratulations you just won 1 million")
    }else{
        println("$number is not a valid number")
    }

    var y = 1
    when (y){
        1 -> println("Oops you lost the game")
        2 -> println("Oops you are almost there")
        3 -> println("Congratulations you just won one million")
        else -> println("$number is not a valid number")
    }



    
}