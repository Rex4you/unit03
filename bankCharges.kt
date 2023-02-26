fun main() {
    val baseFee = 10
    var checkFee = 0.0
    
    print("Enter the number of checks written for the month: ")
    val numChecks = readLine()!!.toInt()
    
    when {
        numChecks < 20 -> checkFee = numChecks * 0.1
        numChecks in 20..39 -> checkFee = numChecks * 0.08
        numChecks in 40..59 -> checkFee = numChecks * 0.06
        numChecks >= 60 -> checkFee = numChecks * 0.04
    }
    
    val totalFee = baseFee + checkFee
    println("The bank’s service fees for the month is $$totalFee")
}

main()
