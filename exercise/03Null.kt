fun main() {
    /* Declare a nullable variable of type string and give it a value. Print out a substring of it, from position 3 to 6 */
    val str: String? = "this is a nullable variable"
    println(str?.substring(3, 6))

    /* Declare a nullable variable of type Double. Multiply it by 6, convert it to a Float and print it to the console */
    val db: Double? = 10.5
    val result = db?.times(6)?.toFloat()
    println(result)

    /* Receive the name of the user form the console and print out the length of the name */
    print("enter a name: ")
    val name: String? = readln()
    println("length if the name is ${name?.length}")
}