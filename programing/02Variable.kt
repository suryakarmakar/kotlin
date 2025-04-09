// constants variable
const val BASE_URL = "example.com"

fun main() {
    // creating variable
    var name = "Surya"
    var age = 25
    var gander = 'M'

    println(name)
    println(age)
    println(gander)

    // changing variable
    name = "Priya"
    age = 26
    gander = 'F'

    println(name)
    println(age)
    println(gander)

    // mutable variable
    var color = "blue"
    color = "red"
    println(color)

    // immutable variable
    val pi = 3.14
    println(pi)

    // string functions
    val str = "String"
    println(str.length)
    println("   some text   ".trim())
    println(str.get(2))
    println(str[2])
    println(str.substring(3))

    // string templates
    println("My name is $name")
    println("2 + 2 = ${2 + 2}")

    // constants variable
    println("$BASE_URL/api/v1/user")
}