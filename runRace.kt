fun main() {
    print("Enter the name of the first runner: ")
    val name1 = readLine()
    print("Enter the race time of $name1 (in minutes): ")
    val time1 = readLine()?.toInt()

    print("Enter the name of the second runner: ")
    val name2 = readLine()
    print("Enter the race time of $name2 (in minutes): ")
    val time2 = readLine()?.toInt()

    print("Enter the name of the third runner: ")
    val name3 = readLine()
    print("Enter the race time of $name3 (in minutes): ")
    val time3 = readLine()?.toInt()

    println("The order of finish is:")
    when {
        time1 != null && time2 != null && time3 != null -> {
            if (time1 <= time2 && time1 <= time3) {
                println(name1)
                if (time2 <= time3) {
                    println(name2)
                    println(name3)
                } else {
                    println(name3)
                    println(name2)
                }
            } else if (time2 <= time1 && time2 <= time3) {
                println(name2)
                if (time1 <= time3) {
                    println(name1)
                    println(name3)
                } else {
                    println(name3)
                    println(name1)
                }
            } else {
                println(name3)
                if (time1 <= time2) {
                    println(name1)
                    println(name2)
                } else {
                    println(name2)
                    println(name1)
                }
            }
        }
        else -> println("Invalid input. Please enter a valid race time for each runner.")
    }

}

main()
