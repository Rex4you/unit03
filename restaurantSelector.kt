fun main() {
    val restaurantChoices = listOf(
        "Joe's Gourmet Burgers",
        "Main Street Pizza Company",
        "Corner Cafe",
        "Mama's Fine Italian",
        "The Chef's Kitchen"
    )

    print("Is anyone in your party a vegetarian? ")
    val isVegetarian = readLine()?.equals("yes", ignoreCase = true) ?: false

    print("Is anyone in your party a vegan? ")
    val isVegan = readLine()?.equals("yes", ignoreCase = true) ?: false

    print("Is anyone in your party gluten-free? ")
    val isGlutenFree = readLine()?.equals("yes", ignoreCase = true) ?: false

    val filteredChoices = restaurantChoices.filter { restaurant ->
        val isVegetarianFriendly = when (restaurant) {
            "Joe's Gourmet Burgers", "Main Street Pizza Company", "Corner Cafe",
            "The Chef's Kitchen" -> true
            else -> false
        }

        val isVeganFriendly = when (restaurant) {
            "Corner Cafe", "The Chef's Kitchen" -> true
            else -> false
        }

        val isGlutenFreeFriendly = when (restaurant) {
            "Main Street Pizza Company", "Corner Cafe", "The Chef's Kitchen" -> true
            else -> false
        }

        (!isVegetarian || isVegetarianFriendly) &&
                (!isVegan || isVeganFriendly) &&
                (!isGlutenFree || isGlutenFreeFriendly)
    }

    println("Here are your restaurant choices:")
    filteredChoices.forEach { println(it) }
}

main()
