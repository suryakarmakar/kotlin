fun main() {
    print("enter a number: ")
    val a: String = readln()

    // exception handling using try-catch block
    try {
        println(a.toInt())
    } catch (e: Exception) {
        println("Invalid input")
        println(e.localizedMessage) // print error message
        e.printStackTrace() // print error track strace
    }

    // finally
    try {
        println(a.toInt())
    } catch (e: Exception) {
        println(e.localizedMessage)
    } finally {
        println("The execution has completed")
    }

    // throw an exception
    try {
        throw Exception("custom exception")
    } catch (e: Exception) {
        println(e.localizedMessage)
        e.printStackTrace()
    }
}