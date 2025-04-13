fun main() {
    /* Read a message from the console. print out either the message of a default greeting */
    print("enter a msg: ")
    val msg: String? = readln()
    println(msg ?: "hello")

    /* Read a number form the console. Assume you know that the user has entered a value, and the read variable os not null.
    Multiply that number by 5 and print the result */
    print("enter a number: ")
    val number: Int? = readln()?.toInt()
    println("$number * 5 = ${number!! * 5}")
}