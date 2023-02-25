fun main() {
    println("Welcome to the BMI Calculator!")
    println("Please enter your weight in pounds: ")
    val weight = readLine()?.toDoubleOrNull()

    println("Please enter your height in inches: ")
    val height = readLine()?.toDoubleOrNull()


    if (weight != null && height != null && weight > 0 && height > 0) {
        val bmi = (weight * 703) / (height * height)

        val weightCategory = if (bmi < 18.5) {
            "underweight"
        } else if (bmi < 25) {
            "optimal weight"
        } else {
            "overweight"
        }

        println("Your BMI is: $bmi")
        println("You are $weightCategory")
    } else {
        println("Invalid input. Please enter valid positive numbers.")
    }

}

main()
