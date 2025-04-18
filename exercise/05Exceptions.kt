fun main() {
    /* Read data from the console and convert in into a number, multiply it by 5 and print. if an exception occurs,
    catch it and print a meaningful message */
    print("Enter a number: ")
    val number: String? = readln()
    try {
        val result: Int? = number?.toInt()?.times(5)
        println(result)
    } catch (e: Exception) {
        println("Invalid number")
    }
}