fun main() {
    print("Enter the object's mass (in kilograms): ")
    val mass = readLine()?.toDoubleOrNull()

    val weight = mass?.times(9.8)

    if (weight != null) {
        if (weight > 1000) {
            println("The object is too heavy!")
        } else if (weight < 10) {
            println("The object is too light!")
        } else {
            println("The object weighs ${weight} Newtons.")
        }
    } else {
        println("Invalid input. Please enter a valid mass value.")
    }
}
