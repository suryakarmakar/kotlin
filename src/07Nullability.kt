fun main() {
    // non-nullable variable
    val emp1: String = "surya"
    println(emp1)

    // nullable variable
    var emp2: String? = null
    emp2 = "rahul"
    println(emp2)

    var emp3: String? = "john"
    emp3 = null
    println(emp3)

    // nullable operator
    var emp4: String? = "employee4"
    println(emp4?.length)
    emp4 = null
    println(emp4?.length)

    // chained safe call
    var emp5: String? = "employee5"
    println(emp5?.length?.toDouble())
    emp5 = null

    // nullable arithmetic operation
    val a: Int? = 10

    println(a?.plus(5)) // addition
    println(a?.minus(5)) // subtraction
    println(a?.times(5)) // multiplication
    println(a?.div(5)) // division
    println(a?.rem(3)) // remainder

    // elvis operator
    val emp6: String? = null
    println(emp6 ?: "default value")

    println(emp6 ?: "default value".length)
}