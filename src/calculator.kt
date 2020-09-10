
fun main() {


    println("Enter First Number ")
    val firstNumber = Integer.valueOf(readLine())
    println("Enter Operator: +, -, * or -")
    val Operator = readLine()
    println("Enter Second Number ")
    val secondNumber = Integer.valueOf(readLine())


    when (Operator)
    {

        "+" -> println("your answer is: " + (firstNumber+secondNumber))
        "-" -> println("your answer is: " + (firstNumber-secondNumber))
        "*" -> println("your answer is: " + (firstNumber*secondNumber))
        "/" -> println("your answer is: " + (firstNumber/secondNumber))

    }

}