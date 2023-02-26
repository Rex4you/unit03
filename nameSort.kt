fun main() {
    println("Enter three names:")
    val name1 = readLine()!!
    val name2 = readLine()!!
    val name3 = readLine()!!

    val sortedNames = listOf(name1, name2, name3).sorted()

    println("Sorted names:")
    for (name in sortedNames) {
        println(name)
    }
}

main()
