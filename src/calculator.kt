
fun main() {


    println("Enter First Number ")
    val FirstNumber = Integer.valueOf(readLine())
    println("Enter Operator: +, -, * or -")
    val Operator = readLine()
    println("Enter Second Number ")
    val SecondNumber = Integer.valueOf(readLine())


    when (Operator)
    {
        "+" -> println("your answer is: " + (FirstNumber+SecondNumber))
        "-" -> println("your answer is: " + (FirstNumber-SecondNumber))
        "*" -> println("your answer is: " + (FirstNumber*SecondNumber))
        "/" -> println("your answer is: " + (FirstNumber/SecondNumber))

    }

}