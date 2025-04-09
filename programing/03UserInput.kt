fun sumOfTwoNumber() {
    print("Enter 1st number: ")
    val a = readln().toInt()

    print("Enter 2nd number: ")
    val b = readln()

    println("Sum of two number is ${a + b.toInt()}")
}

fun main() {
    print("Enter first name: ")
    val firstName = readln()

    print("Enter last name: ")
    val lastName = readln()

    println("Your full name is $firstName $lastName")

    sumOfTwoNumber()
}