// Variables
double weight; // The user's weight
double height; // The user's height
double bmi; // The user's BMI

// Create a Scanner object for keyboard input.
Scanner keyboard = new Scanner(System.in);

// Tell the user what the program will do.
System.out.println("This program will calculate your body mass index, or BMI.");

// Get the user's weight.
System.out.print("Enter your weight, in pounds: ");
weight = keyboard.nextDouble();

// Get the user's height.
System.out.print("Enter your height, in inches: ");
height = keyboard.nextDouble();

static double calculateBMI (double height, double weight) {
    return weight * 703 / (height * height);
}

static String bmiDescription (double bmi) {
    if (bmi < 18.5) {
        return "You are underweight.";
    } else {
        if (bmi > 25) {
            return "You are overweight.";
        } else {
            return "Your weight is optimal.";
        }
    }
}

// Calculate the user's body mass index.
bmi =  calculateBMI(height, weight);

// Display the user's BMI.
System.out.println("Your body mass index (BMI) is " + bmi);

System.out.println(bmiDescription(bmi));

This program will calculate your body mass index, or BMI.
Enter your weight, in pounds: 220
Enter your height, in inches: 68
Your body mass index (BMI) is 33.44723183391003
You are overweight.