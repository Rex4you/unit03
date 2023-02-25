fun main() {
    println("enter a number within the range of 1 through 10")
    val number = readln().toInt()

    if(number > 10 || number < 0) {
        println("error, the number is not valid");
        return;
    }

    if (number == 1) println("I")
    else if( number == 2) println("II")
    else if( number == 3) println("III")
    else if( number == 4) println("IV")
    else if( number == 5) println("V")
    else if( number == 6) println("VI")
    else if( number == 7) println("VII")
    else if( number == 8) println("VIII")
    else if( number == 9) println("IX")
    else if( number == 10) println("X")



}
