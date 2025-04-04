fun main() {
    // arithmetic operator
    println(10 + 10) // addition
    println(20 - 10) // subtraction
    println(2 * 10) // multiplication
    println(10 / 2) // division
    println(11 % 2) // modulus

    var a: Int = 5
    a++ // increment
    println(a)
    a-- // decrement
    println(a)

    // assignment operator
    val b = 10
    println(b)

    // reference operator
    println("value of a is $a")
    println("sum of a + b is ${a + b}") // reference expression

    // augmented assignment operator
    a += 1
    println(a)
    a -= 1
    println(a)
    a *= 2
    println(a)
    a /= 2
    println(a)
    a %= 2
    println(a)
}