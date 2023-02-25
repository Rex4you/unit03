fun main() {
    println("Enter month")

    val month = readln().toInt()

    if (month > 12 || month < 1) {
        println("error, number is not logic");
        return;
    }

    println("Enter a day")
    val day = readln().toInt()

    if (day > 31 || day < 1) {
        println("error, number is not logic");
        return;
    }

    println("Enter a year")
    val year = readln().toInt()
    if (year < 1) {
        println("error, number is not logic")
    }

    val multiplication = month * day
    if( multiplication ==year) {
        println("date is magic")
    }
    else
            println("date is not magic")


}

main()
